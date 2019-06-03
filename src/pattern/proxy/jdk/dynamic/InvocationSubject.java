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

    // 这个实际上方法供 $Proxy0 实现 Subject 接口里面的方法调用.
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable {
    	// args 是 Subject 接口 定义的方法的参数列表,由  $Proxy0  的实现的方法传递.
    	// 实际上也就是调用生成的代理对象的方法时的参数.
        System.out.println("log : " + method.getName() + " invoked with arguments object is:" + args);
        System.out.println("相当于后门,改变生成的代理对象的行为!");
        
        //调用原来对象的方法
        return method.invoke(target, args);
    }
}