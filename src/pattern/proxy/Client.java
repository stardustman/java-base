package pattern.proxy;
public class Client {
    public static void main(String args[]) {
        Subject s = new Proxy(new RealSubject());
        s.request(3);
    }
}