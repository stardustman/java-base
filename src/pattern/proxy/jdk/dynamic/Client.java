package pattern.proxy.jdk.dynamic;
////https://zhuanlan.zhihu.com/p/26193963

/**
 * ʹ�ö�̬����������
1.ͨ��ʵ��InvocationHandler�ӿ����Զ����Լ���InvocationHandler;
 
2.ͨ��Proxy.getProxyClass��ö�̬������
 
3.ͨ��������ƻ�ô�����Ĺ��췽��������ǩ��ΪgetConstructor(InvocationHandler.class)
 
4.ͨ�����캯����ô�����󲢽��Զ����InvocationHandlerʵ������Ϊ��������
 
5.ͨ������������Ŀ�귽��
 * @author young
 *
 */
public class Client {
    public static void main(String args[]) {
    	
    	//System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        dynamicProxy();
        
    }

    public static void dynamicProxy() {
    	//targetҪ������Ķ���
        Subject realSubject = new RealSubject();
        //��̬��������ھ�̬������дProxy���˰�,����ô�ô�������. 2,3,4
        Subject proxy = (Subject)java.lang.reflect.Proxy.newProxyInstance(
                realSubject.getClass().getClassLoader(),//new InvocationSubject(realSubject) realSubject����Ҫ�������target
                realSubject.getClass().getInterfaces(), new InvocationSubject(realSubject));
        proxy.request(1);
    }
}