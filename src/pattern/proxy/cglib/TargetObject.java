package pattern.proxy.cglib;
/**
 * û��ʵ�ֽӿڣ���ҪCGlib��̬�����Ŀ����
 * 
 * @author zghw
 *
 */
public class TargetObject {
    public String name(String name) {
        return name;
    }
 
    public int age(int age) {
        return age;
    }
 
    public int score(int score) {
        return score;
    }
 
    @Override
    public String toString() {
        return "TargetObject []"+ getClass();
    }
}