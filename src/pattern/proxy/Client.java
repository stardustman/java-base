package pattern.proxy;
public class Client {
    public static void main(String args[]) {
    	// �������Ŀ�����
    	RealSubject target = new RealSubject();
    	// ������
        Subject s = new Proxy(target);
        s.request(3);
    }
}