package pattern.proxy.cglib;

import java.lang.reflect.Method;
import net.sf.cglib.proxy.Callback;
import net.sf.cglib.proxy.Factory;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * 生成的真正的代理类
 * @author young
 *
 */
public class TargetObject$$EnhancerByCGLIB$$68429eed
  extends TargetObject
  implements Factory
{
  private boolean CGLIB$BOUND;
  public static Object CGLIB$FACTORY_DATA;
  // delete all final
  private static  ThreadLocal CGLIB$THREAD_CALLBACKS;
  private static Callback[] CGLIB$STATIC_CALLBACKS;
  private MethodInterceptor CGLIB$CALLBACK_0;
  private static Object CGLIB$CALLBACK_FILTER;
  private static  Method CGLIB$name$0$Method;
  private static  MethodProxy CGLIB$name$0$Proxy;
  private static  Object[] CGLIB$emptyArgs;
  private static  Method CGLIB$toString$1$Method;
  private static  MethodProxy CGLIB$toString$1$Proxy;
  private static  Method CGLIB$age$2$Method;
  private static  MethodProxy CGLIB$age$2$Proxy;
  private static  Method CGLIB$score$3$Method;
  private static  MethodProxy CGLIB$score$3$Proxy;
  private static  Method CGLIB$equals$4$Method;
  private static  MethodProxy CGLIB$equals$4$Proxy;
  private static  Method CGLIB$hashCode$5$Method;
  private static  MethodProxy CGLIB$hashCode$5$Proxy;
  private static  Method CGLIB$clone$6$Method;
  private static  MethodProxy CGLIB$clone$6$Proxy;
  
  /* Error */
  static void CGLIB$STATICHOOK1()
  {
    // Byte code:
    //   0: new 22	java/lang/ThreadLocal
    //   3: dup
    //   4: invokespecial 25	java/lang/ThreadLocal:<init>	()V
    //   7: putstatic 27	pattern/proxy/cglib/TargetObject$$EnhancerByCGLIB$$68429eed:CGLIB$THREAD_CALLBACKS	Ljava/lang/ThreadLocal;
    //   10: iconst_0
    //   11: anewarray 48	java/lang/Object
    //   14: putstatic 69	pattern/proxy/cglib/TargetObject$$EnhancerByCGLIB$$68429eed:CGLIB$emptyArgs	[Ljava/lang/Object;
    //   17: ldc -90
    //   19: invokestatic 172	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   22: astore_0
    //   23: bipush 6
    //   25: anewarray 58	java/lang/String
    //   28: dup
    //   29: iconst_0
    //   30: ldc -83
    //   32: aastore
    //   33: dup
    //   34: iconst_1
    //   35: ldc -82
    //   37: aastore
    //   38: dup
    //   39: iconst_2
    //   40: ldc -81
    //   42: aastore
    //   43: dup
    //   44: iconst_3
    //   45: ldc -80
    //   47: aastore
    //   48: dup
    //   49: iconst_4
    //   50: ldc -79
    //   52: aastore
    //   53: dup
    //   54: iconst_5
    //   55: ldc -78
    //   57: aastore
    //   58: ldc -76
    //   60: invokestatic 172	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   63: dup
    //   64: astore_1
    //   65: invokevirtual 184	java/lang/Class:getDeclaredMethods	()[Ljava/lang/reflect/Method;
    //   68: invokestatic 190	net/sf/cglib/core/ReflectUtils:findMethods	([Ljava/lang/String;[Ljava/lang/reflect/Method;)[Ljava/lang/reflect/Method;
    //   71: dup
    //   72: iconst_0
    //   73: aaload
    //   74: putstatic 112	pattern/proxy/cglib/TargetObject$$EnhancerByCGLIB$$68429eed:CGLIB$equals$4$Method	Ljava/lang/reflect/Method;
    //   77: aload_1
    //   78: aload_0
    //   79: ldc -82
    //   81: ldc -83
    //   83: ldc -65
    //   85: invokestatic 197	net/sf/cglib/proxy/MethodProxy:create	(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lnet/sf/cglib/proxy/MethodProxy;
    //   88: putstatic 114	pattern/proxy/cglib/TargetObject$$EnhancerByCGLIB$$68429eed:CGLIB$equals$4$Proxy	Lnet/sf/cglib/proxy/MethodProxy;
    //   91: dup
    //   92: iconst_1
    //   93: aaload
    //   94: putstatic 128	pattern/proxy/cglib/TargetObject$$EnhancerByCGLIB$$68429eed:CGLIB$hashCode$5$Method	Ljava/lang/reflect/Method;
    //   97: aload_1
    //   98: aload_0
    //   99: ldc -80
    //   101: ldc -81
    //   103: ldc -58
    //   105: invokestatic 197	net/sf/cglib/proxy/MethodProxy:create	(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lnet/sf/cglib/proxy/MethodProxy;
    //   108: putstatic 130	pattern/proxy/cglib/TargetObject$$EnhancerByCGLIB$$68429eed:CGLIB$hashCode$5$Proxy	Lnet/sf/cglib/proxy/MethodProxy;
    //   111: dup
    //   112: iconst_2
    //   113: aaload
    //   114: putstatic 141	pattern/proxy/cglib/TargetObject$$EnhancerByCGLIB$$68429eed:CGLIB$clone$6$Method	Ljava/lang/reflect/Method;
    //   117: aload_1
    //   118: aload_0
    //   119: ldc -78
    //   121: ldc -79
    //   123: ldc -57
    //   125: invokestatic 197	net/sf/cglib/proxy/MethodProxy:create	(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lnet/sf/cglib/proxy/MethodProxy;
    //   128: putstatic 143	pattern/proxy/cglib/TargetObject$$EnhancerByCGLIB$$68429eed:CGLIB$clone$6$Proxy	Lnet/sf/cglib/proxy/MethodProxy;
    //   131: pop
    //   132: bipush 8
    //   134: anewarray 58	java/lang/String
    //   137: dup
    //   138: iconst_0
    //   139: ldc -56
    //   141: aastore
    //   142: dup
    //   143: iconst_1
    //   144: ldc -55
    //   146: aastore
    //   147: dup
    //   148: iconst_2
    //   149: ldc -54
    //   151: aastore
    //   152: dup
    //   153: iconst_3
    //   154: ldc -53
    //   156: aastore
    //   157: dup
    //   158: iconst_4
    //   159: ldc -52
    //   161: aastore
    //   162: dup
    //   163: iconst_5
    //   164: ldc -51
    //   166: aastore
    //   167: dup
    //   168: bipush 6
    //   170: ldc -50
    //   172: aastore
    //   173: dup
    //   174: bipush 7
    //   176: ldc -51
    //   178: aastore
    //   179: ldc -48
    //   181: invokestatic 172	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   184: dup
    //   185: astore_1
    //   186: invokevirtual 184	java/lang/Class:getDeclaredMethods	()[Ljava/lang/reflect/Method;
    //   189: invokestatic 190	net/sf/cglib/core/ReflectUtils:findMethods	([Ljava/lang/String;[Ljava/lang/reflect/Method;)[Ljava/lang/reflect/Method;
    //   192: dup
    //   193: iconst_0
    //   194: aaload
    //   195: putstatic 46	pattern/proxy/cglib/TargetObject$$EnhancerByCGLIB$$68429eed:CGLIB$name$0$Method	Ljava/lang/reflect/Method;
    //   198: aload_1
    //   199: aload_0
    //   200: ldc -55
    //   202: ldc -56
    //   204: ldc -47
    //   206: invokestatic 197	net/sf/cglib/proxy/MethodProxy:create	(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lnet/sf/cglib/proxy/MethodProxy;
    //   209: putstatic 50	pattern/proxy/cglib/TargetObject$$EnhancerByCGLIB$$68429eed:CGLIB$name$0$Proxy	Lnet/sf/cglib/proxy/MethodProxy;
    //   212: dup
    //   213: iconst_1
    //   214: aaload
    //   215: putstatic 67	pattern/proxy/cglib/TargetObject$$EnhancerByCGLIB$$68429eed:CGLIB$toString$1$Method	Ljava/lang/reflect/Method;
    //   218: aload_1
    //   219: aload_0
    //   220: ldc -53
    //   222: ldc -54
    //   224: ldc -46
    //   226: invokestatic 197	net/sf/cglib/proxy/MethodProxy:create	(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lnet/sf/cglib/proxy/MethodProxy;
    //   229: putstatic 71	pattern/proxy/cglib/TargetObject$$EnhancerByCGLIB$$68429eed:CGLIB$toString$1$Proxy	Lnet/sf/cglib/proxy/MethodProxy;
    //   232: dup
    //   233: iconst_2
    //   234: aaload
    //   235: putstatic 80	pattern/proxy/cglib/TargetObject$$EnhancerByCGLIB$$68429eed:CGLIB$age$2$Method	Ljava/lang/reflect/Method;
    //   238: aload_1
    //   239: aload_0
    //   240: ldc -51
    //   242: ldc -52
    //   244: ldc -45
    //   246: invokestatic 197	net/sf/cglib/proxy/MethodProxy:create	(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lnet/sf/cglib/proxy/MethodProxy;
    //   249: putstatic 87	pattern/proxy/cglib/TargetObject$$EnhancerByCGLIB$$68429eed:CGLIB$age$2$Proxy	Lnet/sf/cglib/proxy/MethodProxy;
    //   252: dup
    //   253: iconst_3
    //   254: aaload
    //   255: putstatic 101	pattern/proxy/cglib/TargetObject$$EnhancerByCGLIB$$68429eed:CGLIB$score$3$Method	Ljava/lang/reflect/Method;
    //   258: aload_1
    //   259: aload_0
    //   260: ldc -51
    //   262: ldc -50
    //   264: ldc -44
    //   266: invokestatic 197	net/sf/cglib/proxy/MethodProxy:create	(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lnet/sf/cglib/proxy/MethodProxy;
    //   269: putstatic 103	pattern/proxy/cglib/TargetObject$$EnhancerByCGLIB$$68429eed:CGLIB$score$3$Proxy	Lnet/sf/cglib/proxy/MethodProxy;
    //   272: pop
    //   273: return
    //   274: athrow
  }
  
  final String CGLIB$name$0(String paramString)
  {
    return super.name(paramString);
  }
  
  public final String name(String paramString)
  {
    MethodInterceptor tmp4_1 = this.CGLIB$CALLBACK_0;
    if (tmp4_1 == null)
    {
      //tmp4_1;
      CGLIB$BIND_CALLBACKS(this);
    }
    MethodInterceptor tmp17_14 = this.CGLIB$CALLBACK_0;
    if (tmp17_14 != null) {
     // for not report error
      try {
		return (String)tmp17_14.intercept(this, CGLIB$name$0$Method, new Object[] { paramString }, CGLIB$name$0$Proxy);
	} catch (Throwable e) {
		e.printStackTrace();
	}
    }
    return super.name(paramString);
  }
  
  final String CGLIB$toString$1()
  {
    return super.toString();
  }
  
  public final String toString()
  {
    MethodInterceptor tmp4_1 = this.CGLIB$CALLBACK_0;
    if (tmp4_1 == null)
    {
      //tmp4_1; // for not report error
      CGLIB$BIND_CALLBACKS(this);
    }
    MethodInterceptor tmp17_14 = this.CGLIB$CALLBACK_0;
    if (tmp17_14 != null) {
    	// for not report error
     try {
		return (String)tmp17_14.intercept(this, CGLIB$toString$1$Method, CGLIB$emptyArgs, CGLIB$toString$1$Proxy);
	} catch (Throwable e) {
		e.printStackTrace();
	}
    }
    return super.toString();
  }
  
  final int CGLIB$age$2(int paramInt)
  {
    return super.age(paramInt);
  }
  
  public final int age(int paramInt)
  {
    MethodInterceptor tmp4_1 = this.CGLIB$CALLBACK_0;
    if (tmp4_1 == null)
    {
      //tmp4_1;
      CGLIB$BIND_CALLBACKS(this);
    }
    MethodInterceptor tmp17_14 = this.CGLIB$CALLBACK_0;
    if (tmp17_14 != null)
    {
    	Object tmp49_44 = null;
     try {
		tmp49_44 = tmp17_14.intercept(this, CGLIB$age$2$Method, new Object[] { new Integer(paramInt) }, CGLIB$age$2$Proxy);
	} catch (Throwable e) {
		e.printStackTrace();
	}
      //tmp49_44;
      return tmp49_44 == null ? 0 : ((Number)tmp49_44).intValue();
    }
    return super.age(paramInt);
  }
  
  final int CGLIB$score$3(int paramInt)
  {
    return super.score(paramInt);
  }
  
  public final int score(int paramInt)
  {
    MethodInterceptor tmp4_1 = this.CGLIB$CALLBACK_0;
    if (tmp4_1 == null)
    {
      //tmp4_1;
      CGLIB$BIND_CALLBACKS(this);
    }
    MethodInterceptor tmp17_14 = this.CGLIB$CALLBACK_0;
    if (tmp17_14 != null)
    {
    	Object tmp49_44 = null;
      try {
		tmp49_44 = tmp17_14.intercept(this, CGLIB$score$3$Method, new Object[] { new Integer(paramInt) }, CGLIB$score$3$Proxy);
	} catch (Throwable e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      //tmp49_44;
     return tmp49_44 == null ? 0 : ((Number)tmp49_44).intValue();
    }
    return super.score(paramInt);
  }
  
  final boolean CGLIB$equals$4(Object paramObject)
  {
    return super.equals(paramObject);
  }
  
  public final boolean equals(Object paramObject)
  {
    MethodInterceptor tmp4_1 = this.CGLIB$CALLBACK_0;
    if (tmp4_1 == null)
    {
      //tmp4_1;
      CGLIB$BIND_CALLBACKS(this);
    }
    MethodInterceptor tmp17_14 = this.CGLIB$CALLBACK_0;
    if (tmp17_14 != null)
    {
    	Object tmp41_36 = null;
      try {
		tmp41_36 = tmp17_14.intercept(this, CGLIB$equals$4$Method, new Object[] { paramObject }, CGLIB$equals$4$Proxy);
	} catch (Throwable e) {
		e.printStackTrace();
	}
      // tmp41_36;
     return tmp41_36 == null ? false : ((Boolean)tmp41_36).booleanValue();
    }
    return super.equals(paramObject);
  }
  
  final int CGLIB$hashCode$5()
  {
    return super.hashCode();
  }
  
  public final int hashCode()
  {
    MethodInterceptor tmp4_1 = this.CGLIB$CALLBACK_0;
    if (tmp4_1 == null)
    {
      //tmp4_1;
      CGLIB$BIND_CALLBACKS(this);
    }
    MethodInterceptor tmp17_14 = this.CGLIB$CALLBACK_0;
    if (tmp17_14 != null)
    {
    	Object tmp36_31 = null;
     try {
    	 tmp36_31 = tmp17_14.intercept(this, CGLIB$hashCode$5$Method, CGLIB$emptyArgs, CGLIB$hashCode$5$Proxy);
	} catch (Throwable e) {
		e.printStackTrace();
	}
      //tmp36_31;
     return tmp36_31 == null ? 0 : ((Number)tmp36_31).intValue();
    }
    return super.hashCode();
  }
  
  final Object CGLIB$clone$6()
    throws CloneNotSupportedException
  {
    return super.clone();
  }
  
  protected final Object clone()
    throws CloneNotSupportedException
  {
    MethodInterceptor tmp4_1 = this.CGLIB$CALLBACK_0;
    if (tmp4_1 == null)
    {
     // tmp4_1;
      CGLIB$BIND_CALLBACKS(this);
    }
    MethodInterceptor tmp17_14 = this.CGLIB$CALLBACK_0;
    if (tmp17_14 != null) {
      try {
		return tmp17_14.intercept(this, CGLIB$clone$6$Method, CGLIB$emptyArgs, CGLIB$clone$6$Proxy);
	} catch (Throwable e) {
		e.printStackTrace();
	}
    }
    return super.clone();
  }
  
  /* Error */
  public static MethodProxy CGLIB$findMethodProxy(net.sf.cglib.core.Signature arg0)
  {
	return null; // for not report error
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 146	java/lang/Object:toString	()Ljava/lang/String;
    //   4: dup
    //   5: invokevirtual 147	java/lang/Object:hashCode	()I
    //   8: lookupswitch	default:+152->160, -1063114848:+68->76, -994256180:+80->88, -508378822:+92->100, 1826985398:+104->112, 1913648695:+116->124, 1984935277:+128->136, 2127621043:+140->148
    //   76: ldc -107
    //   78: invokevirtual 150	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   81: ifeq +80 -> 161
    //   84: getstatic 87	pattern/proxy/cglib/TargetObject$$EnhancerByCGLIB$$68429eed:CGLIB$age$2$Proxy	Lnet/sf/cglib/proxy/MethodProxy;
    //   87: areturn
    //   88: ldc -104
    //   90: invokevirtual 150	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   93: ifeq +68 -> 161
    //   96: getstatic 50	pattern/proxy/cglib/TargetObject$$EnhancerByCGLIB$$68429eed:CGLIB$name$0$Proxy	Lnet/sf/cglib/proxy/MethodProxy;
    //   99: areturn
    //   100: ldc -102
    //   102: invokevirtual 150	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   105: ifeq +56 -> 161
    //   108: getstatic 143	pattern/proxy/cglib/TargetObject$$EnhancerByCGLIB$$68429eed:CGLIB$clone$6$Proxy	Lnet/sf/cglib/proxy/MethodProxy;
    //   111: areturn
    //   112: ldc -100
    //   114: invokevirtual 150	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   117: ifeq +44 -> 161
    //   120: getstatic 114	pattern/proxy/cglib/TargetObject$$EnhancerByCGLIB$$68429eed:CGLIB$equals$4$Proxy	Lnet/sf/cglib/proxy/MethodProxy;
    //   123: areturn
    //   124: ldc -98
    //   126: invokevirtual 150	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   129: ifeq +32 -> 161
    //   132: getstatic 71	pattern/proxy/cglib/TargetObject$$EnhancerByCGLIB$$68429eed:CGLIB$toString$1$Proxy	Lnet/sf/cglib/proxy/MethodProxy;
    //   135: areturn
    //   136: ldc -96
    //   138: invokevirtual 150	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   141: ifeq +20 -> 161
    //   144: getstatic 130	pattern/proxy/cglib/TargetObject$$EnhancerByCGLIB$$68429eed:CGLIB$hashCode$5$Proxy	Lnet/sf/cglib/proxy/MethodProxy;
    //   147: areturn
    //   148: ldc -94
    //   150: invokevirtual 150	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   153: ifeq +8 -> 161
    //   156: getstatic 103	pattern/proxy/cglib/TargetObject$$EnhancerByCGLIB$$68429eed:CGLIB$score$3$Proxy	Lnet/sf/cglib/proxy/MethodProxy;
    //   159: areturn
    //   160: pop
    //   161: aconst_null
    //   162: areturn
  }
  
  public TargetObject$$EnhancerByCGLIB$$68429eed()
  {
    CGLIB$BIND_CALLBACKS(this);
  }
  
  public static void CGLIB$SET_THREAD_CALLBACKS(Callback[] paramArrayOfCallback)
  {
    CGLIB$THREAD_CALLBACKS.set(paramArrayOfCallback);
  }
  
  public static void CGLIB$SET_STATIC_CALLBACKS(Callback[] paramArrayOfCallback)
  {
    CGLIB$STATIC_CALLBACKS = paramArrayOfCallback;
  }
  
  private static final void CGLIB$BIND_CALLBACKS(Object paramObject)
  {
   // 68429eed local68429eed = (68429eed)paramObject;
    TargetObject$$EnhancerByCGLIB$$68429eed  local68429eed = (TargetObject$$EnhancerByCGLIB$$68429eed)paramObject;
    if (!local68429eed.CGLIB$BOUND)
    {
      local68429eed.CGLIB$BOUND = true;
      Object tmp23_20 = CGLIB$THREAD_CALLBACKS.get();
      if (tmp23_20 == null)
      {
        //tmp23_20;
       // CGLIB$STATIC_CALLBACKS;
      }
      //local68429eed.CGLIB$CALLBACK_0 = (tmp31_28 == null ? tmp31_28 : (MethodInterceptor)((Callback[])tmp23_20)[0]);
    }
  }
  
  public Object newInstance(Callback[] paramArrayOfCallback)
  {
    CGLIB$SET_THREAD_CALLBACKS(paramArrayOfCallback);
    CGLIB$SET_THREAD_CALLBACKS(null);
    return new TargetObject$$EnhancerByCGLIB$$68429eed();
    //return new 68429eed();
  }
  
  public Object newInstance(Callback paramCallback)
  {
    CGLIB$SET_THREAD_CALLBACKS(new Callback[] { paramCallback });
    CGLIB$SET_THREAD_CALLBACKS(null);
    return new TargetObject$$EnhancerByCGLIB$$68429eed();
    //return new 68429eed();
  }
  
  /* Error */
  public Object newInstance(Class[] arg1, Object[] arg2, Callback[] arg3)
  {
	return null; // for not report error
    // Byte code:
    //   0: aload_3
    //   1: invokestatic 231	pattern/proxy/cglib/TargetObject$$EnhancerByCGLIB$$68429eed:CGLIB$SET_THREAD_CALLBACKS	([Lnet/sf/cglib/proxy/Callback;)V
    //   4: new 2	pattern/proxy/cglib/TargetObject$$EnhancerByCGLIB$$68429eed
    //   7: dup
    //   8: aload_1
    //   9: dup
    //   10: arraylength
    //   11: tableswitch	default:+24->35, 0:+17->28
    //   28: pop
    //   29: invokespecial 232	pattern/proxy/cglib/TargetObject$$EnhancerByCGLIB$$68429eed:<init>	()V
    //   32: goto +17 -> 49
    //   35: goto +3 -> 38
    //   38: pop
    //   39: new 238	java/lang/IllegalArgumentException
    //   42: dup
    //   43: ldc -16
    //   45: invokespecial 243	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   48: athrow
    //   49: aconst_null
    //   50: invokestatic 231	pattern/proxy/cglib/TargetObject$$EnhancerByCGLIB$$68429eed:CGLIB$SET_THREAD_CALLBACKS	([Lnet/sf/cglib/proxy/Callback;)V
    //   53: areturn
  }
  
  public Callback getCallback(int paramInt)
  {
    CGLIB$BIND_CALLBACKS(this);
    switch (paramInt)
    {
    case 0: 
      break;
    }
    return null;
  }
  
  public void setCallback(int paramInt, Callback paramCallback)
  {
    switch (paramInt)
    {
    case 0: 
      this.CGLIB$CALLBACK_0 = ((MethodInterceptor)paramCallback);
      break;
    }
  }
  
  public Callback[] getCallbacks()
  {
    CGLIB$BIND_CALLBACKS(this);
    return new Callback[] { this.CGLIB$CALLBACK_0 };
  }
  
  public void setCallbacks(Callback[] paramArrayOfCallback)
  {
    this.CGLIB$CALLBACK_0 = ((MethodInterceptor)paramArrayOfCallback[0]);
  }
  
  static {}
}
