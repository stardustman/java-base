package pattern.proxy.dynamic.pattern.proxy.dynamic;

import net.sf.cglib.reflect.*;
import net.sf.cglib.core.*;
import java.lang.reflect.*;

public class Car$$FastClassByCGLIB$$565e2f27 extends FastClass
{
    public Car$$FastClassByCGLIB$$565e2f27(final Class clazz) {
        super(clazz);
    }
    
    public int getIndex(final Signature signature) {
        final String string = signature.toString();
        switch (string.hashCode()) {
            case 817171083: {
                if (string.equals("accelerate(I)V")) {
                    return 1;
                }
                break;
            }
            case 1316742099: {
                if (string.equals("start()V")) {
                    return 0;
                }
                break;
            }
            case 1826985398: {
                if (string.equals("equals(Ljava/lang/Object;)Z")) {
                    return 2;
                }
                break;
            }
            case 1913648695: {
                if (string.equals("toString()Ljava/lang/String;")) {
                    return 3;
                }
                break;
            }
            case 1984935277: {
                if (string.equals("hashCode()I")) {
                    return 4;
                }
                break;
            }
        }
        return -1;
    }
    
    public int getIndex(final String s, final Class[] array) {
        Label_0262: {
            switch (s.hashCode()) {
                case -1776922004: {
                    if (!s.equals("toString")) {
                        break;
                    }
                    switch (array.length) {
                        case 0: {
                            return 3;
                        }
                        default: {
                            break Label_0262;
                        }
                    }
                    break;
                }
                case -1354466595: {
                    if (!s.equals("accelerate")) {
                        break;
                    }
                    switch (array.length) {
                        case 1: {
                            if (array[0].getName().equals("int")) {
                                return 1;
                            }
                            break Label_0262;
                        }
                        default: {
                            break Label_0262;
                        }
                    }
                    break;
                }
                case -1295482945: {
                    if (!s.equals("equals")) {
                        break;
                    }
                    switch (array.length) {
                        case 1: {
                            if (array[0].getName().equals("java.lang.Object")) {
                                return 2;
                            }
                            break Label_0262;
                        }
                        default: {
                            break Label_0262;
                        }
                    }
                    break;
                }
                case 109757538: {
                    if (!s.equals("start")) {
                        break;
                    }
                    switch (array.length) {
                        case 0: {
                            return 0;
                        }
                        default: {
                            break Label_0262;
                        }
                    }
                    break;
                }
                case 147696667: {
                    if (!s.equals("hashCode")) {
                        break;
                    }
                    switch (array.length) {
                        case 0: {
                            return 4;
                        }
                        default: {
                            break Label_0262;
                        }
                    }
                    break;
                }
            }
        }
        return -1;
    }
    
    public int getIndex(final Class[] array) {
        switch (array.length) {
            case 0: {
                return 0;
            }
            default: {
                return -1;
            }
        }
    }
    
    public Object invoke(final int n, final Object o, final Object[] array) throws InvocationTargetException {
        final Car car = (Car)o;
        try {
            switch (n) {
                case 0: {
                    car.start();
                    return null;
                }
                case 1: {
                    car.accelerate(((Number)array[0]).intValue());
                    return null;
                }
                case 2: {
                    return new Boolean(car.equals(array[0]));
                }
                case 3: {
                    return car.toString();
                }
                case 4: {
                    return new Integer(car.hashCode());
                }
            }
        }
        catch (Throwable t) {
            throw new InvocationTargetException(t);
        }
        throw new IllegalArgumentException("Cannot find matching method/constructor");
    }
    
    public Object newInstance(final int n, final Object[] array) throws InvocationTargetException {
        try {
            switch (n) {
                case 0: {
                    return new Car();
                }
            }
        }
        catch (Throwable t) {
            throw new InvocationTargetException(t);
        }
        throw new IllegalArgumentException("Cannot find matching method/constructor");
    }
    
    public int getMaxIndex() {
        return 4;
    }
}
