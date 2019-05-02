package generic.boundary.wrong;
public class TeacherHolder <T>{
    
	private T t;
    
 	public TeacherHolder (T t) {
		this.t = t;
	}
    
	//û�б߽�ķ����࣬�޷�ͨ�����룬��Ϊ����������֪�����TӦ��ӵ��ʲô���ķ���
	//����������ԭ�ģ�The method teach() is undefined for the type T
	public  void callTeach() {
		t.teach();
	}
	
	public static void main(String[] args) {
		TeacherHolder<String> holder = new TeacherHolder<String>("jiang");
		holder.callTeach();
	}
}