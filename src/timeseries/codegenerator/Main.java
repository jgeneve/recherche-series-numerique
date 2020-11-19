package timeseries.codegenerator;

import static timeseries.enums.PatternsEnum.DECREASING;
import static timeseries.functions.Aggregator.min;
import static timeseries.functions.Feature.one;
import static timeseries.functions.Patterns.applyPattern;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.squareup.javapoet.*;

import results.objects.AggregatorResult;
import results.objects.FeatureResult;
import results.objects.PatternResult;
import timeseries.enums.AggregatorsEnum;
import timeseries.enums.FeaturesEnum;
import timeseries.enums.PatternsEnum;

import javax.lang.model.element.Modifier;


public class Main {

	public static void main(String[] args) throws IOException {
		
		// Variable de la génération de code
		Path   genPath = Paths.get("src");
		String genPackageName = "timeseries.constraints";
		String genClassName = "TimeSeriesConstraints";

		// Liste des aggregators, features et patterns que l'on veut générer
		AggregatorsEnum[] contraint_aggregators = AggregatorsEnum.values();
		FeaturesEnum[] contraint_features = FeaturesEnum.values();
		PatternsEnum[] contraint_patterns = PatternsEnum.values();
		
		// Affichage
		Integer nbMethods = contraint_aggregators.length * contraint_features.length * contraint_patterns.length;
		System.out.println("Génération du code java pour " + nbMethods.toString() + " methodes");

		// Generate contraint methods
		List<MethodSpec> methodsToGenerate = new ArrayList<>();
			
		
	    
		// Pour chaque aggregateur, feature, pattern
		for (AggregatorsEnum a : contraint_aggregators) {
			for (FeaturesEnum f : contraint_features) {
				for (PatternsEnum p : contraint_patterns) {
					
					String aggregator = a.getName();
					String feature = f.getName();
					String pattern = p.getName();
					
					// Genere la methode "agg_fea_pat"
					methodsToGenerate.add(MethodSpec
							  .methodBuilder(aggregator + "_"+ feature + "_" + pattern)
							  .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
							  .addParameter(TypesJavapoet.ListInteger, "serie")
							  .addStatement("AggregatorResult resultAggregator = "+ aggregator +"("+ feature + "(applyPattern(" + pattern.toUpperCase() + ", serie)))")
							  .addStatement("return resultAggregator.getValue()")
							  .returns(Integer.class)
							  .build());
					
					// Genere la methode "pos_agg_fea_pat" uniquement si la feature n'est pas une constante feature
					if (!f.isConstantFeature()) {
						methodsToGenerate.add(MethodSpec
								  .methodBuilder("pos_" + aggregator + "_"+ feature + "_" + pattern)
								  .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
								  .addParameter(TypesJavapoet.ListInteger, "serie")
								  .addStatement("AggregatorResult resultAggregator = "+ aggregator +"("+ feature + "(applyPattern(" + pattern.toUpperCase() + ", serie)))")
								  .addStatement("return resultAggregator")
								  .returns(AggregatorResult.class)
								  .build());
					}
					
				}
			}
		}
		
		// Generation de la classes et ajout de ses methodes
		TypeSpec seriesNumerique = TypeSpec
				  .classBuilder(genClassName)
				  .addModifiers(Modifier.PUBLIC)
				  .addMethods(methodsToGenerate)
				  .build();

		ClassName classEnumPattern = ClassName.get("timeseries.enums", "PatternsEnum");
		ClassName classPatterns = ClassName.get("timeseries.functions", "Patterns");
		ClassName classFeature = ClassName.get("timeseries.functions", "Feature");
		ClassName classAggregator = ClassName.get("timeseries.functions", "Aggregator");
		
		JavaFile javaFile = JavaFile
				.builder(genPackageName, seriesNumerique)
				.indent("    ")
				.addStaticImport(classEnumPattern, "*")
				.addStaticImport(classPatterns, "*")
				.addStaticImport(classFeature, "*")
				.addStaticImport(classAggregator, "*")
				.build();
		javaFile.writeTo(genPath);
		
		// Affichage
		System.out.println("Fin - méthodes générées dans '" + genPath + "/" + genPackageName + "/"+ genClassName + ".java'");
	}

}
