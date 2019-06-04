package pattern.proxy.cglib;
import net.sf.cglib.core.DebuggingClassWriter;
import net.sf.cglib.proxy.Enhancer;
 
public class TestCglib {
    public static void main(String args[]) {
    	System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "D:\\bytecode");
    	
    	// bytecode ��ǿ��
        Enhancer enhancer =new Enhancer();
        // ���ñ��������
        enhancer.setSuperclass(TargetObject.class);
        // ������
        enhancer.setCallback(new TargetInterceptor());
        // ���ɴ�����
        TargetObject proxyForTarget=(TargetObject)enhancer.create();
        System.out.println(proxyForTarget.getClass());
        proxyForTarget.name("stardust");
        proxyForTarget.age(100);
        proxyForTarget.score(200);
        /*class pattern.proxy.cglib.TargetObject$$EnhancerByCGLIB$$68429eed
        class pattern.proxy.cglib.TargetObject$$EnhancerByCGLIB$$68429eed name class net.sf.cglib.proxy.MethodProxy
        =================> before
        =================> after, result is stardust
        class pattern.proxy.cglib.TargetObject$$EnhancerByCGLIB$$68429eed age class net.sf.cglib.proxy.MethodProxy
        =================> before
        =================> after, result is 100
        class pattern.proxy.cglib.TargetObject$$EnhancerByCGLIB$$68429eed score class net.sf.cglib.proxy.MethodProxy
        =================> before
        =================> after, result is 200*/

    }
}