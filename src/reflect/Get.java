package reflect;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class Get {
	
    public static void main(String[] args) throws NoSuchMethodException, SecurityException {
    	Method method = MyClass.class.getMethod("getStringList", null);
    	
    	Type returnType = method.getGenericReturnType();
    	
    	if(returnType instanceof ParameterizedType){
    	    ParameterizedType type = (ParameterizedType) returnType;
    	    Type[] typeArguments = type.getActualTypeArguments();
    	    for(Type typeArgument : typeArguments){
    	        Class<?> typeArgClass = (Class<?>) typeArgument;
    	        System.out.println("typeArgClass = " + typeArgClass);
    	    }
    	}
    	
    	
    	
    	
    	
    	
    	
	}
}

