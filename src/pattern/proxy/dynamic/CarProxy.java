package pattern.proxy.dynamic;
 
import net.sf.cglib.core.DebuggingClassWriter;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
 
import java.lang.reflect.Method;
 
public class CarProxy implements MethodInterceptor{
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        Object rst=null;
 
        System.out.println("before inovking '"+method+"'");
        rst=proxy.invokeSuper(obj,args);
 
        System.out.println("leaving method '"+method+"'");
 
        return rst;
    }
 
    public static void main(String[] args) {
    	System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "D:\\bytecodecar");
        Enhancer enhancer=new Enhancer();
        enhancer.setSuperclass(Car.class);
        enhancer.setCallback(new CarProxy());
 
        Car car=(Car)enhancer.create();
        System.out.println(car.getClass()); // class pattern.proxy.dynamic.Car$$EnhancerByCGLIB$$a32fb71
        car.start();
        car.accelerate(2000);
    }
}