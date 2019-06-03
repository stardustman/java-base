package pattern.proxy.jdk.dynamic;
////https://zhuanlan.zhihu.com/p/26193963

/**
 * 使用动态代理的五大步骤
1.通过实现InvocationHandler接口来自定义自己的InvocationHandler;
 
2.通过Proxy.getProxyClass获得动态代理类
 
3.通过反射机制获得代理类的构造方法，方法签名为getConstructor(InvocationHandler.class)
 
4.通过构造函数获得代理对象并将自定义的InvocationHandler实例对象传为参数传入
 
5.通过代理对象调用目标方法
 * @author young
 *
 */
public class Client {
    public static void main(String args[]) {
    	
    	//System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        dynamicProxy();
        
    }

    public static void dynamicProxy() {
    	//target要被代理的对象
        Subject realSubject = new RealSubject();
        //动态就是相对于静态不用手写Proxy类了啊,都特么用代码生成. 2,3,4
        Subject proxy = (Subject)java.lang.reflect.Proxy.newProxyInstance(
                realSubject.getClass().getClassLoader(),//new InvocationSubject(realSubject) realSubject就是要被代理的target
                realSubject.getClass().getInterfaces(), new InvocationSubject(realSubject));
        proxy.request(1);
    }
}