package main;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.squareup.javapoet.*;
import javax.lang.model.element.Modifier;

import enums.PatternsEnum;
import javapoet.AggregatorJavapoet;
import javapoet.FeatureJavapoet;
import javapoet.PatternJavapoet;
import javapoet.TypesJavapoet;


public class Main {

	public static void main(String[] args) throws IOException {
		// TEST PEAK REGEX
//		List<Integer> serie = Arrays.asList(7,5,5,1,4,5,2,2,3,5,6,2,3,3,3,1);
//		Integer result = min_width_peak(serie);		
//		System.out.println(result);
		
		System.out.println("LETS GO");
		// Use of Javapoet
		
		
		String pattern = "PEAK";
		String feature = "width";
		String aggregator = "min";
		
		MethodSpec method = MethodSpec
				  .methodBuilder(aggregator+"_"+feature+"_"+pattern.toLowerCase())
				  .addParameter(TypesJavapoet.ListInteger, "serie")
				  .addStatement("List<List<Integer>> resultsPattern = applyPattern(PatternsEnum."+pattern+", serie)")
				  .addStatement("List<Integer> resultsFeature = "+feature+"(resultsPattern)")
				  .addStatement("Integer resultAggregator = "+aggregator+"(resultsFeature)")
				  .addStatement("return resultAggregator")
				  .returns(Integer.class)
				  .build();
		
		
		TypeSpec seriesNumerique = TypeSpec
				  .classBuilder("SeriesNumerique")
				  .addModifiers(Modifier.PUBLIC)
				  .addMethod(PatternJavapoet.applyPattern)
				  .addMethod(PatternJavapoet.getSignature)
				  .addMethod(FeatureJavapoet.width)
				  .addMethod(AggregatorJavapoet.min)
				  .addMethod(method)
				  .build();
		
		JavaFile javaFile = JavaFile
				  .builder("com.imt.seriesNumerique", seriesNumerique)
				  .indent("    ")
				  .build();
		
		Path path = Paths.get("src");
		javaFile.writeTo(path);
	}
	
	
	//TODO remove
	public static Integer min_width_peak(List<Integer> serie) {
		List<List<Integer>> resultsPattern = Patterns.applyPattern(PatternsEnum.PEAK, serie);
		List<Integer> resultsFeature = Feature.width(resultsPattern);
		Integer resultAggregator = Aggregator.min(resultsFeature);
		return resultAggregator;
	}
}
