package pattern.proxy;
public class Client {
    public static void main(String args[]) {
    	// 被代理的目标对象
    	RealSubject target = new RealSubject();
    	// 代理类
        Subject s = new Proxy(target);
        s.request(3);
    }
}