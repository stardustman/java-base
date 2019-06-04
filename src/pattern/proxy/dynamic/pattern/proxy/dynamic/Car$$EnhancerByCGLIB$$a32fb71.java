package pattern.proxy.dynamic.pattern.proxy.dynamic;

import java.lang.reflect.*;
import net.sf.cglib.proxy.*;
import pattern.proxy.dynamic.Car;
import net.sf.cglib.core.*;

/**
 * 真正的代理类
 * @author young
 *
 */
public class Car$$EnhancerByCGLIB$$a32fb71 extends Car implements Factory
{
    private boolean CGLIB$BOUND;
    public static Object CGLIB$FACTORY_DATA;
    private static final ThreadLocal CGLIB$THREAD_CALLBACKS;
    private static final Callback[] CGLIB$STATIC_CALLBACKS;
    private MethodInterceptor CGLIB$CALLBACK_0;
    private static Object CGLIB$CALLBACK_FILTER;
    private static final Method CGLIB$start$0$Method;
    private static final MethodProxy CGLIB$start$0$Proxy;
    private static final Object[] CGLIB$emptyArgs;
    private static final Method CGLIB$accelerate$1$Method;
    private static final MethodProxy CGLIB$accelerate$1$Proxy;
    private static final Method CGLIB$equals$2$Method;
    private static final MethodProxy CGLIB$equals$2$Proxy;
    private static final Method CGLIB$toString$3$Method;
    private static final MethodProxy CGLIB$toString$3$Proxy;
    private static final Method CGLIB$hashCode$4$Method;
    private static final MethodProxy CGLIB$hashCode$4$Proxy;
    private static final Method CGLIB$clone$5$Method;
    private static final MethodProxy CGLIB$clone$5$Proxy;
    
    static void CGLIB$STATICHOOK1() {
        CGLIB$THREAD_CALLBACKS = new ThreadLocal();
        CGLIB$emptyArgs = new Object[0];
        final Class<?> forName = Class.forName("pattern.proxy.dynamic.Car$$EnhancerByCGLIB$$a32fb71");
        final Class<?> forName2;
        final Method[] methods = ReflectUtils.findMethods(new String[] { "equals", "(Ljava/lang/Object;)Z", "toString", "()Ljava/lang/String;", "hashCode", "()I", "clone", "()Ljava/lang/Object;" }, (forName2 = Class.forName("java.lang.Object")).getDeclaredMethods());
        CGLIB$equals$2$Method = methods[0];
        CGLIB$equals$2$Proxy = MethodProxy.create((Class)forName2, (Class)forName, "(Ljava/lang/Object;)Z", "equals", "CGLIB$equals$2");
        CGLIB$toString$3$Method = methods[1];
        CGLIB$toString$3$Proxy = MethodProxy.create((Class)forName2, (Class)forName, "()Ljava/lang/String;", "toString", "CGLIB$toString$3");
        CGLIB$hashCode$4$Method = methods[2];
        CGLIB$hashCode$4$Proxy = MethodProxy.create((Class)forName2, (Class)forName, "()I", "hashCode", "CGLIB$hashCode$4");
        CGLIB$clone$5$Method = methods[3];
        CGLIB$clone$5$Proxy = MethodProxy.create((Class)forName2, (Class)forName, "()Ljava/lang/Object;", "clone", "CGLIB$clone$5");
        final Class<?> forName3;
        final Method[] methods2 = ReflectUtils.findMethods(new String[] { "start", "()V", "accelerate", "(I)V" }, (forName3 = Class.forName("pattern.proxy.dynamic.Car")).getDeclaredMethods());
        CGLIB$start$0$Method = methods2[0];
        CGLIB$start$0$Proxy = MethodProxy.create((Class)forName3, (Class)forName, "()V", "start", "CGLIB$start$0");
        CGLIB$accelerate$1$Method = methods2[1];
        CGLIB$accelerate$1$Proxy = MethodProxy.create((Class)forName3, (Class)forName, "(I)V", "accelerate", "CGLIB$accelerate$1");
    }
    
    final void CGLIB$start$0() {
        super.start();
    }
    
    public final void start() {
        MethodInterceptor cglib$CALLBACK_2;
        MethodInterceptor cglib$CALLBACK_0;
        if ((cglib$CALLBACK_0 = (cglib$CALLBACK_2 = this.CGLIB$CALLBACK_0)) == null) {
            CGLIB$BIND_CALLBACKS(this);
            cglib$CALLBACK_2 = (cglib$CALLBACK_0 = this.CGLIB$CALLBACK_0);
        }
        if (cglib$CALLBACK_0 != null) {
            cglib$CALLBACK_2.intercept((Object)this, Car$$EnhancerByCGLIB$$a32fb71.CGLIB$start$0$Method, Car$$EnhancerByCGLIB$$a32fb71.CGLIB$emptyArgs, Car$$EnhancerByCGLIB$$a32fb71.CGLIB$start$0$Proxy);
            return;
        }
        super.start();
    }
    
    final void CGLIB$accelerate$1(final int n) {
        super.accelerate(n);
    }
    
    public final void accelerate(final int n) {
        MethodInterceptor cglib$CALLBACK_2;
        MethodInterceptor cglib$CALLBACK_0;
        if ((cglib$CALLBACK_0 = (cglib$CALLBACK_2 = this.CGLIB$CALLBACK_0)) == null) {
            CGLIB$BIND_CALLBACKS(this);
            cglib$CALLBACK_2 = (cglib$CALLBACK_0 = this.CGLIB$CALLBACK_0);
        }
        if (cglib$CALLBACK_0 != null) {
            cglib$CALLBACK_2.intercept((Object)this, Car$$EnhancerByCGLIB$$a32fb71.CGLIB$accelerate$1$Method, new Object[] { new Integer(n) }, Car$$EnhancerByCGLIB$$a32fb71.CGLIB$accelerate$1$Proxy);
            return;
        }
        super.accelerate(n);
    }
    
    final boolean CGLIB$equals$2(final Object o) {
        return super.equals(o);
    }
    
    public final boolean equals(final Object o) {
        MethodInterceptor cglib$CALLBACK_2;
        MethodInterceptor cglib$CALLBACK_0;
        if ((cglib$CALLBACK_0 = (cglib$CALLBACK_2 = this.CGLIB$CALLBACK_0)) == null) {
            CGLIB$BIND_CALLBACKS(this);
            cglib$CALLBACK_2 = (cglib$CALLBACK_0 = this.CGLIB$CALLBACK_0);
        }
        if (cglib$CALLBACK_0 != null) {
            final Object intercept = cglib$CALLBACK_2.intercept((Object)this, Car$$EnhancerByCGLIB$$a32fb71.CGLIB$equals$2$Method, new Object[] { o }, Car$$EnhancerByCGLIB$$a32fb71.CGLIB$equals$2$Proxy);
            return intercept != null && (boolean)intercept;
        }
        return super.equals(o);
    }
    
    final String CGLIB$toString$3() {
        return super.toString();
    }
    
    public final String toString() {
        MethodInterceptor cglib$CALLBACK_2;
        MethodInterceptor cglib$CALLBACK_0;
        if ((cglib$CALLBACK_0 = (cglib$CALLBACK_2 = this.CGLIB$CALLBACK_0)) == null) {
            CGLIB$BIND_CALLBACKS(this);
            cglib$CALLBACK_2 = (cglib$CALLBACK_0 = this.CGLIB$CALLBACK_0);
        }
        if (cglib$CALLBACK_0 != null) {
            return (String)cglib$CALLBACK_2.intercept((Object)this, Car$$EnhancerByCGLIB$$a32fb71.CGLIB$toString$3$Method, Car$$EnhancerByCGLIB$$a32fb71.CGLIB$emptyArgs, Car$$EnhancerByCGLIB$$a32fb71.CGLIB$toString$3$Proxy);
        }
        return super.toString();
    }
    
    final int CGLIB$hashCode$4() {
        return super.hashCode();
    }
    
    public final int hashCode() {
        MethodInterceptor cglib$CALLBACK_2;
        MethodInterceptor cglib$CALLBACK_0;
        if ((cglib$CALLBACK_0 = (cglib$CALLBACK_2 = this.CGLIB$CALLBACK_0)) == null) {
            CGLIB$BIND_CALLBACKS(this);
            cglib$CALLBACK_2 = (cglib$CALLBACK_0 = this.CGLIB$CALLBACK_0);
        }
        if (cglib$CALLBACK_0 != null) {
            final Object intercept = cglib$CALLBACK_2.intercept((Object)this, Car$$EnhancerByCGLIB$$a32fb71.CGLIB$hashCode$4$Method, Car$$EnhancerByCGLIB$$a32fb71.CGLIB$emptyArgs, Car$$EnhancerByCGLIB$$a32fb71.CGLIB$hashCode$4$Proxy);
            return (intercept == null) ? 0 : ((Number)intercept).intValue();
        }
        return super.hashCode();
    }
    
    final Object CGLIB$clone$5() throws CloneNotSupportedException {
        return super.clone();
    }
    
    protected final Object clone() throws CloneNotSupportedException {
        MethodInterceptor cglib$CALLBACK_2;
        MethodInterceptor cglib$CALLBACK_0;
        if ((cglib$CALLBACK_0 = (cglib$CALLBACK_2 = this.CGLIB$CALLBACK_0)) == null) {
            CGLIB$BIND_CALLBACKS(this);
            cglib$CALLBACK_2 = (cglib$CALLBACK_0 = this.CGLIB$CALLBACK_0);
        }
        if (cglib$CALLBACK_0 != null) {
            return cglib$CALLBACK_2.intercept((Object)this, Car$$EnhancerByCGLIB$$a32fb71.CGLIB$clone$5$Method, Car$$EnhancerByCGLIB$$a32fb71.CGLIB$emptyArgs, Car$$EnhancerByCGLIB$$a32fb71.CGLIB$clone$5$Proxy);
        }
        return super.clone();
    }
    
    public static MethodProxy CGLIB$findMethodProxy(final Signature signature) {
        final String string = signature.toString();
        switch (string.hashCode()) {
            case -508378822: {
                if (string.equals("clone()Ljava/lang/Object;")) {
                    return Car$$EnhancerByCGLIB$$a32fb71.CGLIB$clone$5$Proxy;
                }
                break;
            }
            case 817171083: {
                if (string.equals("accelerate(I)V")) {
                    return Car$$EnhancerByCGLIB$$a32fb71.CGLIB$accelerate$1$Proxy;
                }
                break;
            }
            case 1316742099: {
                if (string.equals("start()V")) {
                    return Car$$EnhancerByCGLIB$$a32fb71.CGLIB$start$0$Proxy;
                }
                break;
            }
            case 1826985398: {
                if (string.equals("equals(Ljava/lang/Object;)Z")) {
                    return Car$$EnhancerByCGLIB$$a32fb71.CGLIB$equals$2$Proxy;
                }
                break;
            }
            case 1913648695: {
                if (string.equals("toString()Ljava/lang/String;")) {
                    return Car$$EnhancerByCGLIB$$a32fb71.CGLIB$toString$3$Proxy;
                }
                break;
            }
            case 1984935277: {
                if (string.equals("hashCode()I")) {
                    return Car$$EnhancerByCGLIB$$a32fb71.CGLIB$hashCode$4$Proxy;
                }
                break;
            }
        }
        return null;
    }
    
    public Car$$EnhancerByCGLIB$$a32fb71() {
        CGLIB$BIND_CALLBACKS(this);
    }
    
    public static void CGLIB$SET_THREAD_CALLBACKS(final Callback[] array) {
        Car$$EnhancerByCGLIB$$a32fb71.CGLIB$THREAD_CALLBACKS.set(array);
    }
    
    public static void CGLIB$SET_STATIC_CALLBACKS(final Callback[] cglib$STATIC_CALLBACKS) {
        CGLIB$STATIC_CALLBACKS = cglib$STATIC_CALLBACKS;
    }
    
    private static final void CGLIB$BIND_CALLBACKS(final Object o) {
        final Car$$EnhancerByCGLIB$$a32fb71 car$$EnhancerByCGLIB$$a32fb71 = (Car$$EnhancerByCGLIB$$a32fb71)o;
        if (!car$$EnhancerByCGLIB$$a32fb71.CGLIB$BOUND) {
            car$$EnhancerByCGLIB$$a32fb71.CGLIB$BOUND = true;
            Object o2;
            if ((o2 = Car$$EnhancerByCGLIB$$a32fb71.CGLIB$THREAD_CALLBACKS.get()) != null || (o2 = Car$$EnhancerByCGLIB$$a32fb71.CGLIB$STATIC_CALLBACKS) != null) {
                car$$EnhancerByCGLIB$$a32fb71.CGLIB$CALLBACK_0 = (MethodInterceptor)((Callback[])o2)[0];
            }
        }
    }
    
    public Object newInstance(final Callback[] array) {
        CGLIB$SET_THREAD_CALLBACKS(array);
        final Car$$EnhancerByCGLIB$$a32fb71 car$$EnhancerByCGLIB$$a32fb71 = new Car$$EnhancerByCGLIB$$a32fb71();
        CGLIB$SET_THREAD_CALLBACKS(null);
        return car$$EnhancerByCGLIB$$a32fb71;
    }
    
    public Object newInstance(final Callback callback) {
        CGLIB$SET_THREAD_CALLBACKS(new Callback[] { callback });
        final Car$$EnhancerByCGLIB$$a32fb71 car$$EnhancerByCGLIB$$a32fb71 = new Car$$EnhancerByCGLIB$$a32fb71();
        CGLIB$SET_THREAD_CALLBACKS(null);
        return car$$EnhancerByCGLIB$$a32fb71;
    }
    
    public Object newInstance(final Class[] array, final Object[] array2, final Callback[] array3) {
        CGLIB$SET_THREAD_CALLBACKS(array3);
        switch (array.length) {
            case 0: {
                final Car$$EnhancerByCGLIB$$a32fb71 car$$EnhancerByCGLIB$$a32fb71 = new Car$$EnhancerByCGLIB$$a32fb71();
                CGLIB$SET_THREAD_CALLBACKS(null);
                return car$$EnhancerByCGLIB$$a32fb71;
            }
            default: {
                throw new IllegalArgumentException("Constructor not found");
            }
        }
    }
    
    public Callback getCallback(final int n) {
        CGLIB$BIND_CALLBACKS(this);
        Object cglib$CALLBACK_0 = null;
        switch (n) {
            case 0: {
                cglib$CALLBACK_0 = this.CGLIB$CALLBACK_0;
                break;
            }
            default: {
                cglib$CALLBACK_0 = null;
                break;
            }
        }
        return (Callback)cglib$CALLBACK_0;
    }
    
    public void setCallback(final int n, final Callback callback) {
        switch (n) {
            case 0: {
                this.CGLIB$CALLBACK_0 = (MethodInterceptor)callback;
                break;
            }
        }
    }
    
    public Callback[] getCallbacks() {
        CGLIB$BIND_CALLBACKS(this);
        return new Callback[] { (Callback)this.CGLIB$CALLBACK_0 };
    }
    
    public void setCallbacks(final Callback[] array) {
        this.CGLIB$CALLBACK_0 = (MethodInterceptor)array[0];
    }
    
    static {
        CGLIB$STATICHOOK1();
    }
}
