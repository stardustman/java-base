package generic.boundary.wrong;
public class TeacherHolder <T>{
    
	private T t;
    
 	public TeacherHolder (T t) {
		this.t = t;
	}
    
	//没有边界的泛型类，无法通过编译，因为编译器并不知道这个T应该拥有什么样的方法
	//编译器报错原文：The method teach() is undefined for the type T
	public  void callTeach() {
		t.teach();
	}
	
	public static void main(String[] args) {
		TeacherHolder<String> holder = new TeacherHolder<String>("jiang");
		holder.callTeach();
	}
}