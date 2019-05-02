package generic.boundary;
public class TeacherHolder <T extends Teacher>{

	private T t;
	
	public TeacherHolder (T t) {
		this.t = t;
	}
    
	//通过定义边界<T extends Teacher>，t拥有了调teach方法的能力
	public  void callTeach() {
		t.teach();
	}
}


