package javapoet;

import javax.lang.model.element.Modifier;

import com.squareup.javapoet.MethodSpec;

public class FeatureJavapoet {

	public static MethodSpec one = MethodSpec
			  .methodBuilder("one")
			  .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
			  .addParameter(TypesJavapoet.ListListInteger, "resultsPattern")
			  .addStatement("List<Integer> results = new ArrayList<>()")
			  .beginControlFlow("for (List<Integer> resultPattern : resultsPattern)")
			  .addStatement("results.add(resultPattern.get(0))")
			  .endControlFlow()
			  .addStatement("return results")
			  .returns(TypesJavapoet.ListInteger)
			  .build();
	
	public static MethodSpec width = MethodSpec
			  .methodBuilder("width")
			  .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
			  .addParameter(TypesJavapoet.ListListInteger, "resultsPattern")
			  .addStatement("List<Integer> results = new ArrayList<>()")
			  .addStatement("Integer listSize")
			  .beginControlFlow("for (List<Integer> resultPattern : resultsPattern)")
			  .addStatement("listSize = resultPattern.size()")
			  .addStatement("results.add(listSize)")	
			  .endControlFlow()
			  .addStatement("return results")
			  .returns(TypesJavapoet.ListInteger)
			  .build();

	public static MethodSpec surf = MethodSpec
			  .methodBuilder("surf")
			  .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
			  .addParameter(TypesJavapoet.ListListInteger, "resultsPattern")
			  .addStatement("List<Integer> results = new ArrayList<>()")
			  .addStatement("Integer surface")
			  .beginControlFlow("for (List<Integer> resultPattern : resultsPattern)")
			  .addStatement("surface = 0")
			  .beginControlFlow("for (Integer val : resultPattern)")
			  .addStatement("surface = surface + val")	
			  .endControlFlow()
			  .addStatement("results.add(surface)")
			  .endControlFlow()
			  .addStatement("return results")
			  .returns(TypesJavapoet.ListInteger)
			  .build();
	
	public static MethodSpec min = MethodSpec
			  .methodBuilder("min")
			  .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
			  .addParameter(TypesJavapoet.ListListInteger, "resultsPattern")
			  .addStatement("List<Integer> results = new ArrayList<>()")
			  .addStatement("Integer min")
			  .beginControlFlow("for (List<Integer> resultPattern : resultsPattern)")
			  .addStatement("min = Integer.MAX_VALUE")
			  .beginControlFlow("for (int value : resultPattern)")
			  .beginControlFlow("if (value < min)")
			  .addStatement("min = value")
			  .endControlFlow()
			  .endControlFlow()
			  .addStatement("results.add(min)")
			  .endControlFlow()
			  .addStatement("return results")
			  .returns(TypesJavapoet.ListInteger)
			  .build();
	
	public static MethodSpec max = MethodSpec
			  .methodBuilder("max")
			  .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
			  .addParameter(TypesJavapoet.ListListInteger, "resultsPattern")
			  .addStatement("List<Integer> results = new ArrayList<>()")
			  .addStatement("Integer max")
			  .beginControlFlow("for (List<Integer> resultPattern : resultsPattern)")
			  .addStatement("max = Integer.MIN_VALUE")
			  .beginControlFlow("for (int value : resultPattern)")
			  .beginControlFlow("if (value > max)")
			  .addStatement("max = value")
			  .endControlFlow()
			  .endControlFlow()
			  .addStatement("results.add(max)")
			  .endControlFlow()
			  .addStatement("return results")
			  .returns(TypesJavapoet.ListInteger)
			  .build();
	
}
