package pattern.proxy.dynamic.pattern.proxy.dynamic;

import net.sf.cglib.reflect.*;
import net.sf.cglib.core.*;
import net.sf.cglib.proxy.*;
import java.lang.reflect.*;

public class Car$$EnhancerByCGLIB$$a32fb71$$FastClassByCGLIB$$ae5edcf7 extends FastClass
{
    public Car$$EnhancerByCGLIB$$a32fb71$$FastClassByCGLIB$$ae5edcf7(final Class clazz) {
        super(clazz);
    }
    
    public int getIndex(final Signature signature) {
        final String string = signature.toString();
        switch (string.hashCode()) {
            case -2055565910: {
                if (string.equals("CGLIB$SET_THREAD_CALLBACKS([Lnet/sf/cglib/proxy/Callback;)V")) {
                    return 15;
                }
                break;
            }
            case -1861326518: {
                if (string.equals("CGLIB$start$0()V")) {
                    return 18;
                }
                break;
            }
            case -1457535688: {
                if (string.equals("CGLIB$STATICHOOK1()V")) {
                    return 21;
                }
                break;
            }
            case -1411812934: {
                if (string.equals("CGLIB$hashCode$4()I")) {
                    return 16;
                }
                break;
            }
            case -894172689: {
                if (string.equals("newInstance(Lnet/sf/cglib/proxy/Callback;)Ljava/lang/Object;")) {
                    return 4;
                }
                break;
            }
            case -623122092: {
                if (string.equals("CGLIB$findMethodProxy(Lnet/sf/cglib/core/Signature;)Lnet/sf/cglib/proxy/MethodProxy;")) {
                    return 10;
                }
                break;
            }
            case -508378822: {
                if (string.equals("clone()Ljava/lang/Object;")) {
                    return 3;
                }
                break;
            }
            case -419626537: {
                if (string.equals("setCallbacks([Lnet/sf/cglib/proxy/Callback;)V")) {
                    return 13;
                }
                break;
            }
            case -234662885: {
                if (string.equals("CGLIB$accelerate$1(I)V")) {
                    return 22;
                }
                break;
            }
            case 374345669: {
                if (string.equals("CGLIB$equals$2(Ljava/lang/Object;)Z")) {
                    return 17;
                }
                break;
            }
            case 560567118: {
                if (string.equals("setCallback(ILnet/sf/cglib/proxy/Callback;)V")) {
                    return 8;
                }
                break;
            }
            case 811063227: {
                if (string.equals("newInstance([Ljava/lang/Class;[Ljava/lang/Object;[Lnet/sf/cglib/proxy/Callback;)Ljava/lang/Object;")) {
                    return 6;
                }
                break;
            }
            case 817171083: {
                if (string.equals("accelerate(I)V")) {
                    return 9;
                }
                break;
            }
            case 973717575: {
                if (string.equals("getCallbacks()[Lnet/sf/cglib/proxy/Callback;")) {
                    return 12;
                }
                break;
            }
            case 1221173700: {
                if (string.equals("newInstance([Lnet/sf/cglib/proxy/Callback;)Ljava/lang/Object;")) {
                    return 5;
                }
                break;
            }
            case 1230699260: {
                if (string.equals("getCallback(I)Lnet/sf/cglib/proxy/Callback;")) {
                    return 11;
                }
                break;
            }
            case 1316742099: {
                if (string.equals("start()V")) {
                    return 7;
                }
                break;
            }
            case 1517819849: {
                if (string.equals("CGLIB$toString$3()Ljava/lang/String;")) {
                    return 20;
                }
                break;
            }
            case 1584330438: {
                if (string.equals("CGLIB$SET_STATIC_CALLBACKS([Lnet/sf/cglib/proxy/Callback;)V")) {
                    return 14;
                }
                break;
            }
            case 1826985398: {
                if (string.equals("equals(Ljava/lang/Object;)Z")) {
                    return 0;
                }
                break;
            }
            case 1913648695: {
                if (string.equals("toString()Ljava/lang/String;")) {
                    return 1;
                }
                break;
            }
            case 1984935277: {
                if (string.equals("hashCode()I")) {
                    return 2;
                }
                break;
            }
            case 2011844968: {
                if (string.equals("CGLIB$clone$5()Ljava/lang/Object;")) {
                    return 19;
                }
                break;
            }
        }
        return -1;
    }
    
    public int getIndex(final String s, final Class[] array) {
        Label_1191: {
            switch (s.hashCode()) {
                case -1776922004: {
                    if (!s.equals("toString")) {
                        break;
                    }
                    switch (array.length) {
                        case 0: {
                            return 1;
                        }
                        default: {
                            break Label_1191;
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
                                return 9;
                            }
                            break Label_1191;
                        }
                        default: {
                            break Label_1191;
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
                                return 0;
                            }
                            break Label_1191;
                        }
                        default: {
                            break Label_1191;
                        }
                    }
                    break;
                }
                case -1053468136: {
                    if (!s.equals("getCallbacks")) {
                        break;
                    }
                    switch (array.length) {
                        case 0: {
                            return 12;
                        }
                        default: {
                            break Label_1191;
                        }
                    }
                    break;
                }
                case -811595189: {
                    if (!s.equals("CGLIB$start$0")) {
                        break;
                    }
                    switch (array.length) {
                        case 0: {
                            return 18;
                        }
                        default: {
                            break Label_1191;
                        }
                    }
                    break;
                }
                case -124978608: {
                    if (!s.equals("CGLIB$equals$2")) {
                        break;
                    }
                    switch (array.length) {
                        case 1: {
                            if (array[0].getName().equals("java.lang.Object")) {
                                return 17;
                            }
                            break Label_1191;
                        }
                        default: {
                            break Label_1191;
                        }
                    }
                    break;
                }
                case -60403779: {
                    if (!s.equals("CGLIB$SET_STATIC_CALLBACKS")) {
                        break;
                    }
                    switch (array.length) {
                        case 1: {
                            if (array[0].getName().equals("[Lnet.sf.cglib.proxy.Callback;")) {
                                return 14;
                            }
                            break Label_1191;
                        }
                        default: {
                            break Label_1191;
                        }
                    }
                    break;
                }
                case -29025554: {
                    if (!s.equals("CGLIB$hashCode$4")) {
                        break;
                    }
                    switch (array.length) {
                        case 0: {
                            return 16;
                        }
                        default: {
                            break Label_1191;
                        }
                    }
                    break;
                }
                case 85179481: {
                    if (!s.equals("CGLIB$SET_THREAD_CALLBACKS")) {
                        break;
                    }
                    switch (array.length) {
                        case 1: {
                            if (array[0].getName().equals("[Lnet.sf.cglib.proxy.Callback;")) {
                                return 15;
                            }
                            break Label_1191;
                        }
                        default: {
                            break Label_1191;
                        }
                    }
                    break;
                }
                case 94756189: {
                    if (!s.equals("clone")) {
                        break;
                    }
                    switch (array.length) {
                        case 0: {
                            return 3;
                        }
                        default: {
                            break Label_1191;
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
                            return 7;
                        }
                        default: {
                            break Label_1191;
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
                            return 2;
                        }
                        default: {
                            break Label_1191;
                        }
                    }
                    break;
                }
                case 161998109: {
                    if (!s.equals("CGLIB$STATICHOOK1")) {
                        break;
                    }
                    switch (array.length) {
                        case 0: {
                            return 21;
                        }
                        default: {
                            break Label_1191;
                        }
                    }
                    break;
                }
                case 495524492: {
                    if (!s.equals("setCallbacks")) {
                        break;
                    }
                    switch (array.length) {
                        case 1: {
                            if (array[0].getName().equals("[Lnet.sf.cglib.proxy.Callback;")) {
                                return 13;
                            }
                            break Label_1191;
                        }
                        default: {
                            break Label_1191;
                        }
                    }
                    break;
                }
                case 500567149: {
                    if (!s.equals("CGLIB$accelerate$1")) {
                        break;
                    }
                    switch (array.length) {
                        case 1: {
                            if (array[0].getName().equals("int")) {
                                return 22;
                            }
                            break Label_1191;
                        }
                        default: {
                            break Label_1191;
                        }
                    }
                    break;
                }
                case 1154623345: {
                    if (!s.equals("CGLIB$findMethodProxy")) {
                        break;
                    }
                    switch (array.length) {
                        case 1: {
                            if (array[0].getName().equals("net.sf.cglib.core.Signature")) {
                                return 10;
                            }
                            break Label_1191;
                        }
                        default: {
                            break Label_1191;
                        }
                    }
                    break;
                }
                case 1543336190: {
                    if (!s.equals("CGLIB$toString$3")) {
                        break;
                    }
                    switch (array.length) {
                        case 0: {
                            return 20;
                        }
                        default: {
                            break Label_1191;
                        }
                    }
                    break;
                }
                case 1811874389: {
                    if (!s.equals("newInstance")) {
                        break;
                    }
                    switch (array.length) {
                        case 1: {
                            final String name = array[0].getName();
                            switch (name.hashCode()) {
                                case -845341380: {
                                    if (name.equals("net.sf.cglib.proxy.Callback")) {
                                        return 4;
                                    }
                                    break;
                                }
                                case 1730110032: {
                                    if (name.equals("[Lnet.sf.cglib.proxy.Callback;")) {
                                        return 5;
                                    }
                                    break;
                                }
                            }
                            break Label_1191;
                        }
                        case 3: {
                            if (array[0].getName().equals("[Ljava.lang.Class;") && array[1].getName().equals("[Ljava.lang.Object;") && array[2].getName().equals("[Lnet.sf.cglib.proxy.Callback;")) {
                                return 6;
                            }
                            break Label_1191;
                        }
                        default: {
                            break Label_1191;
                        }
                    }
                    break;
                }
                case 1817099975: {
                    if (!s.equals("setCallback")) {
                        break;
                    }
                    switch (array.length) {
                        case 2: {
                            if (array[0].getName().equals("int") && array[1].getName().equals("net.sf.cglib.proxy.Callback")) {
                                return 8;
                            }
                            break Label_1191;
                        }
                        default: {
                            break Label_1191;
                        }
                    }
                    break;
                }
                case 1905679803: {
                    if (!s.equals("getCallback")) {
                        break;
                    }
                    switch (array.length) {
                        case 1: {
                            if (array[0].getName().equals("int")) {
                                return 11;
                            }
                            break Label_1191;
                        }
                        default: {
                            break Label_1191;
                        }
                    }
                    break;
                }
                case 1951977611: {
                    if (!s.equals("CGLIB$clone$5")) {
                        break;
                    }
                    switch (array.length) {
                        case 0: {
                            return 19;
                        }
                        default: {
                            break Label_1191;
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
        final Car$$EnhancerByCGLIB$$a32fb71 car$$EnhancerByCGLIB$$a32fb71 = (Car$$EnhancerByCGLIB$$a32fb71)o;
        try {
            switch (n) {
                case 0: {
                    return new Boolean(car$$EnhancerByCGLIB$$a32fb71.equals(array[0]));
                }
                case 1: {
                    return car$$EnhancerByCGLIB$$a32fb71.toString();
                }
                case 2: {
                    return new Integer(car$$EnhancerByCGLIB$$a32fb71.hashCode());
                }
                case 3: {
                    return car$$EnhancerByCGLIB$$a32fb71.clone();
                }
                case 4: {
                    return car$$EnhancerByCGLIB$$a32fb71.newInstance((Callback)array[0]);
                }
                case 5: {
                    return car$$EnhancerByCGLIB$$a32fb71.newInstance((Callback[])array[0]);
                }
                case 6: {
                    return car$$EnhancerByCGLIB$$a32fb71.newInstance((Class[])array[0], (Object[])array[1], (Callback[])array[2]);
                }
                case 7: {
                    car$$EnhancerByCGLIB$$a32fb71.start();
                    return null;
                }
                case 8: {
                    car$$EnhancerByCGLIB$$a32fb71.setCallback(((Number)array[0]).intValue(), (Callback)array[1]);
                    return null;
                }
                case 9: {
                    car$$EnhancerByCGLIB$$a32fb71.accelerate(((Number)array[0]).intValue());
                    return null;
                }
                case 10: {
                    return Car$$EnhancerByCGLIB$$a32fb71.CGLIB$findMethodProxy((Signature)array[0]);
                }
                case 11: {
                    return car$$EnhancerByCGLIB$$a32fb71.getCallback(((Number)array[0]).intValue());
                }
                case 12: {
                    return car$$EnhancerByCGLIB$$a32fb71.getCallbacks();
                }
                case 13: {
                    car$$EnhancerByCGLIB$$a32fb71.setCallbacks((Callback[])array[0]);
                    return null;
                }
                case 14: {
                    Car$$EnhancerByCGLIB$$a32fb71.CGLIB$SET_STATIC_CALLBACKS((Callback[])array[0]);
                    return null;
                }
                case 15: {
                    Car$$EnhancerByCGLIB$$a32fb71.CGLIB$SET_THREAD_CALLBACKS((Callback[])array[0]);
                    return null;
                }
                case 16: {
                    return new Integer(car$$EnhancerByCGLIB$$a32fb71.CGLIB$hashCode$4());
                }
                case 17: {
                    return new Boolean(car$$EnhancerByCGLIB$$a32fb71.CGLIB$equals$2(array[0]));
                }
                case 18: {
                    car$$EnhancerByCGLIB$$a32fb71.CGLIB$start$0();
                    return null;
                }
                case 19: {
                    return car$$EnhancerByCGLIB$$a32fb71.CGLIB$clone$5();
                }
                case 20: {
                    return car$$EnhancerByCGLIB$$a32fb71.CGLIB$toString$3();
                }
                case 21: {
                    Car$$EnhancerByCGLIB$$a32fb71.CGLIB$STATICHOOK1();
                    return null;
                }
                case 22: {
                    car$$EnhancerByCGLIB$$a32fb71.CGLIB$accelerate$1(((Number)array[0]).intValue());
                    return null;
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
                    return new Car$$EnhancerByCGLIB$$a32fb71();
                }
            }
        }
        catch (Throwable t) {
            throw new InvocationTargetException(t);
        }
        throw new IllegalArgumentException("Cannot find matching method/constructor");
    }
    
    public int getMaxIndex() {
        return 22;
    }
}
