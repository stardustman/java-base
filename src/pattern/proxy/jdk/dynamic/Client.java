package pattern.proxy.jdk.dynamic;
////https://zhuanlan.zhihu.com/p/26193963
public class Client {
    public static void main(String args[]) {
    	
    	//System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        dynamicProxy();
        
    }

    public static void dynamicProxy() {
    	//target要被代理的对象
        Subject realSubject = new RealSubject();
        //动态就是相对于静态不用手写Proxy类了啊,都特么用代码生成.
        Subject proxy = (Subject)java.lang.reflect.Proxy.newProxyInstance(
                realSubject.getClass().getClassLoader(),//new InvocationSubject(realSubject) realSubject就是要被代理的target
                realSubject.getClass().getInterfaces(), new InvocationSubject(realSubject));
        proxy.request(1);
    }
}