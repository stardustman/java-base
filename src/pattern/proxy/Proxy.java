package pattern.proxy;
/**
 * 静态代理,需要手写类
 * @author young
 *
 */
public class Proxy implements Subject {
    private Subject target;

    public Proxy(Subject s) {
        target = s;
    }

    public void request(int id) {
    	// 增加的额外的逻辑
        System.out.println("Proxy log : " + id);
        // 被代理对象的方法
        target.request(id);
    }
}