package pattern.proxy;
public class Proxy implements Subject {
    private Subject target;

    public Proxy(Subject s) {
        target = s;
    }

    public void request(int id) {
        System.out.println("Proxy log : " + id);
        target.request(id);
    }

    /*public void setTarget(Subject realSubject) {
        this.target = realSubject;
    }*/
}