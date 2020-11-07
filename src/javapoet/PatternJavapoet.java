package javapoet;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.lang.model.element.Modifier;

import com.squareup.javapoet.MethodSpec;

import enums.PatternsEnum;

public class PatternJavapoet {
	
	public static MethodSpec applyPattern = MethodSpec
			  .methodBuilder("applyPattern")
			  .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
			  .addParameter(PatternsEnum.class, "pattern")
			  .addParameter(TypesJavapoet.ListInteger, "serie")
			  .addStatement("String sig = getSignature(serie)")
			  .addStatement("Pattern p = Pattern.compile(pattern.getRegex())")
			  .addStatement("Matcher matcher = p.matcher(sig)")
			  .addStatement("List<List<Integer>> results = new ArrayList<List<Integer>>()")
			  .beginControlFlow("while(matcher.find())")
			  .addStatement("Integer start = matcher.start()")
			  .addStatement("Integer end = matcher.end()")
			  .addStatement("Integer patternStartOffset = pattern.getStart()")
			  .addStatement("Integer patternEndOffset = pattern.getEnd()")
			  .addStatement("List<Integer> sublist = serie.subList(start+patternStartOffset, end-patternEndOffset+1)")
			  .addStatement("results.add(sublist)")
			  .endControlFlow()
			  .addStatement("return results")
			  .returns(TypesJavapoet.ListListInteger)
			  .build();
	
	public static MethodSpec getSignature = MethodSpec
			  .methodBuilder("getSignature")
			  .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
			  .addParameter(TypesJavapoet.ListInteger, "serie")
			  .addStatement("String result = \"\"")
			  .beginControlFlow("for (int i = 1; i < serie.size(); i++)")
			  .beginControlFlow("if (serie.get(i - 1) > serie.get(i))")
			  .addStatement("result += \">\"")
			  .endControlFlow()
			  .beginControlFlow("else if (serie.get(i - 1) < serie.get(i))")
			  .addStatement("result += \"<\"")
			  .endControlFlow()
			  .beginControlFlow("else")
			  .addStatement("result += \"=\"")
			  .endControlFlow()
			  .endControlFlow()
			  .addStatement("return result")
			  .returns(String.class)
			  .build();
}
