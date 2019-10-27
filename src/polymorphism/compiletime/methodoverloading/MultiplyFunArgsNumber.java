package polymorphism.compiletime.methodoverloading;
// Java program for Method overloading 

class MultiplyFunArgsNumber { 

	// Method with 2 parameter 
	static int Multiply(int a, int b) 
	{ 
		return a * b; 
	} 

	// Method with the same name but 3 parameter 
	static int Multiply(int a, int b, int c) 
	{ 
		return a * b * c; 
	} 
} 

class Main { 
	public static void main(String[] args) 
	{ 
		System.out.println(MultiplyFunArgsNumber.Multiply(2, 4)); 

		System.out.println(MultiplyFunArgsNumber.Multiply(2, 7, 3)); 
	} 
} 
