package pattern.proxy.jdk.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.UndeclaredThrowableException;


@SuppressWarnings("serial")
//��̬����������Proxy��,�Ƕ�̬���ɵĲ�����ȥд��
public final class $Proxy0 extends Proxy implements Subject {
	/**
	 * ��д {@link Object} �� equals, toString, hashCode
	 */
	private static Method m0; //hashCode
	private static Method m1; //equals
	private static Method m2; //toString
	// �õ�����  Subject �ӿڶ���ķ���
	private static Method m3;
	private static Method m4;

    
	//���캯��,���ݽ����� InvocationHandler
	public $Proxy0(InvocationHandler paramInvocationHandler) {
		super(paramInvocationHandler);
	}


	public final int hashCode() {
		try {
			return ((Integer) this.h.invoke(this, m0, null)).intValue();
		} catch (Error | RuntimeException localError) {
			throw localError;
		} catch (Throwable localThrowable) {
			throw new UndeclaredThrowableException(localThrowable);
		}
	}
	
	
	public final boolean equals(Object paramObject) {
		try {
			return ((Boolean) this.h.invoke(this, m1, new Object[] { paramObject })).booleanValue();
		} catch (Error | RuntimeException localError) {
			throw localError;
		} catch (Throwable localThrowable) {
			throw new UndeclaredThrowableException(localThrowable);
		}
	}

	public final String toString() {
		try {
			return (String) this.h.invoke(this, m2, null);
		} catch (Error | RuntimeException localError) {
			throw localError;
		} catch (Throwable localThrowable) {
			throw new UndeclaredThrowableException(localThrowable);
		}
	}



	public final void request(int paramInt) {
		try {
			//����InvacationHandler�ķ���,m3��request����
			this.h.invoke(this, m3, new Object[] { Integer.valueOf(paramInt) });
			return;
		} catch (Error | RuntimeException localError) {
			throw localError;
		} catch (Throwable localThrowable) {
			throw new UndeclaredThrowableException(localThrowable);
		}
	}
	
	public void response(int paramInt) {
		try
	    {
	      this.h.invoke(this, m4, new Object[] { Integer.valueOf(paramInt) });
	      return;
	    }
	    catch (Error|RuntimeException localError)
	    {
	      throw localError;
	    }
	    catch (Throwable localThrowable)
	    {
	      throw new UndeclaredThrowableException(localThrowable);
	    }
		
	}

	static {
		try {
			m1 = Class.forName("java.lang.Object").getMethod("equals",
					new Class[] { Class.forName("java.lang.Object") });
			m2 = Class.forName("java.lang.Object").getMethod("toString", new Class[0]);
			m3 = Class.forName("pattern.proxy.jdk.dynamic.Subject").getMethod("request", new Class[] { Integer.TYPE });
			m4 = Class.forName("pattern.proxy.jdk.dynamic.Subject").getMethod("response", new Class[] { Integer.TYPE });
			m0 = Class.forName("java.lang.Object").getMethod("hashCode", new Class[0]);
		} catch (NoSuchMethodException localNoSuchMethodException) {
			throw new NoSuchMethodError(localNoSuchMethodException.getMessage());
		} catch (ClassNotFoundException localClassNotFoundException) {
			throw new NoClassDefFoundError(localClassNotFoundException.getMessage());
		}
	}


}
