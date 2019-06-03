package pattern.proxy;
/**
 * ��̬����,��Ҫ��д��
 * @author young
 *
 */
public class Proxy implements Subject {
    private Subject target;

    public Proxy(Subject s) {
        target = s;
    }

    public void request(int id) {
    	// ���ӵĶ�����߼�
        System.out.println("Proxy log : " + id);
        // ���������ķ���
        target.request(id);
    }
}