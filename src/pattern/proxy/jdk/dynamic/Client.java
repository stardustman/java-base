package pattern.proxy.jdk.dynamic;
////https://zhuanlan.zhihu.com/p/26193963
public class Client {
    public static void main(String args[]) {
    	
    	//System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        dynamicProxy();
        
    }

    public static void dynamicProxy() {
    	//targetҪ������Ķ���
        Subject realSubject = new RealSubject();
        //��̬��������ھ�̬������дProxy���˰�,����ô�ô�������.
        Subject proxy = (Subject)java.lang.reflect.Proxy.newProxyInstance(
                realSubject.getClass().getClassLoader(),//new InvocationSubject(realSubject) realSubject����Ҫ�������target
                realSubject.getClass().getInterfaces(), new InvocationSubject(realSubject));
        proxy.request(1);
    }
}