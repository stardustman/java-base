package generic.boundary;
public class TeacherHolder <T extends Teacher>{

	private T t;
	
	public TeacherHolder (T t) {
		this.t = t;
	}
    
	//ͨ������߽�<T extends Teacher>��tӵ���˵�teach����������
	public  void callTeach() {
		t.teach();
	}
}


