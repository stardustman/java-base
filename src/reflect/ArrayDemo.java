package reflect;

import java.lang.reflect.Array;

public class ArrayDemo {
     public static void main(String[] args) throws ClassNotFoundException {
    	 int[] intArray = (int[]) Array.newInstance(int.class, 3);
    	 

    	 Array.set(intArray, 0, 123);
    	 Array.set(intArray, 1, 456);
    	 Array.set(intArray, 2, 789);

    	 System.out.println("intArray[0] = " + Array.get(intArray, 0));
    	 System.out.println("intArray[1] = " + Array.get(intArray, 1));
    	 System.out.println("intArray[2] = " + Array.get(intArray, 2));
    	 
    	
    	 
    	 Class<String[]> stringArrayClass = String[].class;
    	 System.out.println(stringArrayClass);
    	 
    	 Class<?> stringArrayComponentType = stringArrayClass.getComponentType();
    	 System.out.println(stringArrayComponentType);
    	 
    	 Class<?> iArray = Class.forName("[I");
    	 
    	 System.out.println(iArray);
	}
}
