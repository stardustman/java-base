package pattern.builder;

public class TestSquare1 {
	public static void main(String[] args) {
		Square1.Builder builder = new Square1.Builder();
		builder.setBorderSize(50);
	    builder.setColor(1);
		builder.setBorderSize(5);
		builder.setBorderColor(2); 
		//在build方法中会检查参数是否正确。
		Square1 square = builder.build();
		System.out.println(square.toString());
		
		Square2 square2 = new Square2.Builder()
				   .setBorderSize(50)
				    .setColor(100)
				    .setBorderSize(5)
				    .setBorderColor(200)
				    .build();
		System.out.println(square2);
	}
}

