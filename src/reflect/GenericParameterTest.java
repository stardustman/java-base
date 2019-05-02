package reflect;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

public class GenericParameterTest {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		  Method method = MyClass.class.getMethod("setStringList", List.class);
		
    	Type[] genericParameterTypes = method.getGenericParameterTypes();

    	for(Type genericParameterType : genericParameterTypes){
    	    if(genericParameterType instanceof ParameterizedType){
    	        ParameterizedType aType = (ParameterizedType) genericParameterType;
    	        Type[] parameterArgTypes = aType.getActualTypeArguments();
    	        for(Type parameterArgType : parameterArgTypes){
    	            Class<?> parameterArgClass = (Class<?>) parameterArgType;
    	            System.out.println("parameterArgClass = " + parameterArgClass);
    	        }
    	    }
    	}
	}
}

