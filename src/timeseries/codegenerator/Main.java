package timeseries.codegenerator;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.squareup.javapoet.*;
import javax.lang.model.element.Modifier;


public class Main {

	public static void main(String[] args) throws IOException {
		
		// Variable de la génération de code
		Path   genPath = Paths.get("src");
		String genPackageName = "timeseries.constraints";
		String genClassName = "TimeSeriesConstraints";

		// Liste des aggregators, features et patterns que l'on veut générer
		List<String> contraint_aggregators = Arrays.asList("min", "max");
		List<String> contraint_features = Arrays.asList("one", "width", "surf", "max", "min", "range");
		List<String> contraint_patterns = Arrays.asList("peak", "bump_on_decreasing_sequence", "decreasing", "decreasing_sequence", "decreasing_terrace", "dip_on_increasing_sequence", "gorge", "increasing", "increasing_sequence", "increasing_terrace", "inflexion", "plain", "plateau", "proper_plain", "proper_plateau", "steady", "steady_sequence", "strictly_decreasing_sequence", "strictly_increasing_sequence", "summit", "valley", "zigzag");
		
		// Affichage
		Integer nbMethods = contraint_aggregators.size() * contraint_features.size() * contraint_patterns.size();
		System.out.println("Génération du code java pour " + nbMethods.toString() + " methodes");

		// Generate contraint methods
		List<MethodSpec> methodsToGenerate = new ArrayList<>();
				
		// Pour chaque aggregateur, feature, pattern
		for (String aggregator : contraint_aggregators) {
			for (String feature : contraint_features) {
				for (String pattern : contraint_patterns) {
					methodsToGenerate.add(MethodSpec
							  .methodBuilder(aggregator + "_"+ feature + "_" + pattern)
							  .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
							  .addParameter(TypesJavapoet.ListInteger, "serie")
							  .addStatement("List<List<Integer>> resultsPattern = applyPattern(" + pattern.toUpperCase() + ", serie)")
							  .addStatement("List<Integer> resultsFeature = "+ feature +"(resultsPattern)")
							  .addStatement("Integer resultAggregator = "+ aggregator +"(resultsFeature)")
							  .addStatement("return resultAggregator")
							  .returns(Integer.class)
							  .build());
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
