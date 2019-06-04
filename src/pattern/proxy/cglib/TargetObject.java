package pattern.proxy.cglib;
/**
 * 没有实现接口，需要CGlib动态代理的目标类
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