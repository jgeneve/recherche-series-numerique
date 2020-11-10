package timeseries.codegenerator;

import java.util.List;

import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.ParameterizedTypeName;
import com.squareup.javapoet.TypeName;

public class TypesJavapoet {
//	public static TypeName ListListInteger = ParameterizedTypeName.get(ClassName.get(List.class),TypeName.get(List.class),TypeName.get(Integer.class));
	public static ParameterizedTypeName ListListInteger = ParameterizedTypeName.get(ClassName.get(List.class), 
			ParameterizedTypeName.get(ClassName.get(List.class), ClassName.get(Integer.class)));
	
	public static TypeName ListInteger = ParameterizedTypeName.get(ClassName.get(List.class),ClassName.get(Integer.class));
}
