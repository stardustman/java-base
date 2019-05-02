package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import http.LatchTest;

public class ReflectDemo {
	 @SuppressWarnings({ "static-access", "rawtypes" })
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InterruptedException {
		//class object
		Class<LatchTest> latchTestClass = LatchTest.class;
		//class name
		System.out.println(latchTestClass.getName());
		//modifiers
		int modifiers = latchTestClass.getModifiers();
		System.out.println(Modifier.isAbstract(modifiers));
		System.out.println(Modifier.isFinal(modifiers));
		System.out.println(Modifier.isInterface(modifiers));
		System.out.println(Modifier.isNative(modifiers));
		System.out.println(Modifier.isPrivate(modifiers));
		System.out.println(Modifier.isProtected(modifiers));
		System.out.println(Modifier.isPublic(modifiers));
		System.out.println(Modifier.isStatic(modifiers));
		System.out.println(Modifier.isStrict(modifiers));
		System.out.println(Modifier.isSynchronized(modifiers));
		System.out.println(Modifier.isTransient(modifiers));
		System.out.println(Modifier.isVolatile(modifiers));
		
		//pack info
		Package pack = latchTestClass.getPackage();
		System.out.println(pack.getName());
		
		//super class
		System.out.println(latchTestClass.getClass().getSuperclass().getName());
		
		//implements interfaces
		
		Class<?>[] interfaces = latchTestClass.getInterfaces();
		for (Class<?> iface : interfaces) {
			System.out.println(iface.getName());
		}
		
		//constructors
		
		Constructor[] constructors = latchTestClass.getConstructors();
		 for ( Constructor constructor : constructors) {
			System.out.println(constructor.getName());
			LatchTest lt = (LatchTest) constructor.newInstance(null);
			lt.main(null);
		}
		 
		 //fields
		 latchTestClass.getFields();
		 
		 //annotations
		 latchTestClass.getAnnotations();
		 
		 Method[] methods = latchTestClass.getMethods();
		 for (Method method : methods) {
			if(method.getName().equals("startTaskAllInOnce")){
				System.out.println("·µ»ØÖµ"+method.getReturnType());
				Class<?>[] pa =  method.getParameterTypes();
				System.out.println(pa);
				
			}
		}
		
	}
}

