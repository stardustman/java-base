package pattern.proxy.cglib;
import java.lang.reflect.Method;
 
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
/**
 * Ŀ�������������ʵ��MethodInterceptor
 * @author zghw
 *
 */
public class TargetInterceptor implements MethodInterceptor{
 
    /**
     * ��д���������ڷ���ǰ�ͷ��������ҵ��
     * Object objΪĿ�����
     * Method methodΪĿ�귽��
     * Object[] params Ϊ������
     * MethodProxy proxy CGlib�����������
     */
    @Override
    public Object intercept(Object obj, Method method, Object[] params,
            MethodProxy proxy) throws Throwable {
    	System.out.println(obj.getClass() +" " + method.getName() + " " + proxy.getClass());
        System.out.println("=================> before");
        Object result = proxy.invokeSuper(obj, params);
        System.out.println("=================> after, result is " + result);
        return result;
    }
 
 
}