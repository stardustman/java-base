package pattern.proxy.jdk.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * ��������� �ṩ�� java.lang.reflect.Proxy.newProxyInstance �������ʹ������ ������.
 * @author young
 *
 */
public class InvocationSubject implements InvocationHandler {
    Subject target;

    public InvocationSubject(Subject subject) {
        target = subject;
    }

    // ���ʵ���Ϸ����� $Proxy0 ʵ�� Subject �ӿ�����ķ�������.
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable {
    	// args �� Subject �ӿ� ����ķ����Ĳ����б�,��  $Proxy0  ��ʵ�ֵķ�������.
    	// ʵ����Ҳ���ǵ������ɵĴ������ķ���ʱ�Ĳ���.
        System.out.println("log : " + method.getName() + " invoked with arguments object is:" + args);
        System.out.println("�൱�ں���,�ı����ɵĴ���������Ϊ!");
        
        //����ԭ������ķ���
        return method.invoke(target, args);
    }
}