package pattern.proxy.jdk.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 根据这个类 提供给 java.lang.reflect.Proxy.newProxyInstance 这个方法使用生成 代理类.
 * @author young
 *
 */
public class InvocationSubject implements InvocationHandler {
    Subject target;

    public InvocationSubject(Subject subject) {
        target = subject;
    }

    //
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable {
        System.out.println("log : " + method.getName() + " invoked with " + args);
        System.out.println("相当于后门,改变生成的代理对象的行为!");
        
        //调用原来对象的方法
        return method.invoke(target, args);
    }
}