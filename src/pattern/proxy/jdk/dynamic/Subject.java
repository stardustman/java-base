package pattern.proxy.jdk.dynamic;
public interface Subject {
    void request(int id);
    
    void response(int id);
}