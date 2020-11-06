package javapoet;

import javax.lang.model.element.Modifier;

import com.squareup.javapoet.MethodSpec;

public class AggregatorJavapoet {
	public static MethodSpec min = MethodSpec
			  .methodBuilder("min")
			  .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
			  .addParameter(TypesJavapoet.ListInteger, "resultsFeature")
			  .addStatement("Integer min = Integer.MAX_VALUE")
			  .beginControlFlow("for (Integer resultFeature : resultsFeature)")
			  .beginControlFlow("if (resultFeature < min)")
			  .addStatement("min = resultFeature")
			  .endControlFlow()
			  .endControlFlow()
			  .addStatement("return min")
			  .returns(Integer.class)
			  .build();
	
	public static MethodSpec max = MethodSpec
			  .methodBuilder("max")
			  .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
			  .addParameter(TypesJavapoet.ListInteger, "resultsFeature")
			  .addStatement("Integer max = Integer.MIN_VALUE")
			  .beginControlFlow("for (Integer resultFeature : resultsFeature)")
			  .beginControlFlow("if (resultFeature > max)")
			  .addStatement("max = resultFeature")
			  .endControlFlow()
			  .endControlFlow()
			  .addStatement("return max")
			  .returns(Integer.class)
			  .build();
}
