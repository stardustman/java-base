package pattern.proxy.cglib;

import java.lang.reflect.InvocationTargetException;
import net.sf.cglib.reflect.FastClass;

public class TargetObject$$FastClassByCGLIB$$446d219b
  extends FastClass
{
  public TargetObject$$FastClassByCGLIB$$446d219b(Class paramClass)
  {
    super(paramClass);
  }
  
  /* Error */
  public int getIndex(net.sf.cglib.core.Signature arg1)
  {
	return 0;
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual 17	java/lang/Object:toString	()Ljava/lang/String;
    //   4: dup
    //   5: invokevirtual 21	java/lang/Object:hashCode	()I
    //   8: lookupswitch	default:+120->128, -1063114848:+60->68, -994256180:+70->78, 1826985398:+80->88, 1913648695:+90->98, 1984935277:+100->108, 2127621043:+110->118
    //   68: ldc 23
    //   70: invokevirtual 27	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   73: ifeq +56 -> 129
    //   76: iconst_2
    //   77: ireturn
    //   78: ldc 29
    //   80: invokevirtual 27	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   83: ifeq +46 -> 129
    //   86: iconst_0
    //   87: ireturn
    //   88: ldc 31
    //   90: invokevirtual 27	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   93: ifeq +36 -> 129
    //   96: iconst_4
    //   97: ireturn
    //   98: ldc 33
    //   100: invokevirtual 27	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   103: ifeq +26 -> 129
    //   106: iconst_1
    //   107: ireturn
    //   108: ldc 35
    //   110: invokevirtual 27	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   113: ifeq +16 -> 129
    //   116: iconst_5
    //   117: ireturn
    //   118: ldc 37
    //   120: invokevirtual 27	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   123: ifeq +6 -> 129
    //   126: iconst_3
    //   127: ireturn
    //   128: pop
    //   129: iconst_m1
    //   130: ireturn
  }
  
  /* Error */
  public int getIndex(String arg1, Class[] arg2)
  {
	return 0;
    // Byte code:
    //   0: aload_1
    //   1: aload_2
    //   2: swap
    //   3: dup
    //   4: invokevirtual 21	java/lang/Object:hashCode	()I
    //   7: lookupswitch	default:+319->326, -1776922004:+57->64, -1295482945:+91->98, 96511:+141->148, 3373707:+189->196, 109264530:+237->244, 147696667:+285->292
    //   64: ldc 43
    //   66: invokevirtual 27	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   69: ifeq +258 -> 327
    //   72: dup
    //   73: arraylength
    //   74: tableswitch	default:+21->95, 0:+18->92
    //   92: pop
    //   93: iconst_1
    //   94: ireturn
    //   95: goto +235 -> 330
    //   98: ldc 44
    //   100: invokevirtual 27	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   103: ifeq +224 -> 327
    //   106: dup
    //   107: arraylength
    //   108: tableswitch	default:+37->145, 1:+20->128
    //   128: dup
    //   129: iconst_0
    //   130: aaload
    //   131: invokevirtual 49	java/lang/Class:getName	()Ljava/lang/String;
    //   134: ldc 51
    //   136: invokevirtual 27	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   139: ifeq +191 -> 330
    //   142: pop
    //   143: iconst_4
    //   144: ireturn
    //   145: goto +185 -> 330
    //   148: ldc 53
    //   150: invokevirtual 27	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   153: ifeq +174 -> 327
    //   156: dup
    //   157: arraylength
    //   158: tableswitch	default:+35->193, 1:+18->176
    //   176: dup
    //   177: iconst_0
    //   178: aaload
    //   179: invokevirtual 49	java/lang/Class:getName	()Ljava/lang/String;
    //   182: ldc 55
    //   184: invokevirtual 27	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   187: ifeq +143 -> 330
    //   190: pop
    //   191: iconst_2
    //   192: ireturn
    //   193: goto +137 -> 330
    //   196: ldc 57
    //   198: invokevirtual 27	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   201: ifeq +126 -> 327
    //   204: dup
    //   205: arraylength
    //   206: tableswitch	default:+35->241, 1:+18->224
    //   224: dup
    //   225: iconst_0
    //   226: aaload
    //   227: invokevirtual 49	java/lang/Class:getName	()Ljava/lang/String;
    //   230: ldc 59
    //   232: invokevirtual 27	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   235: ifeq +95 -> 330
    //   238: pop
    //   239: iconst_0
    //   240: ireturn
    //   241: goto +89 -> 330
    //   244: ldc 61
    //   246: invokevirtual 27	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   249: ifeq +78 -> 327
    //   252: dup
    //   253: arraylength
    //   254: tableswitch	default:+35->289, 1:+18->272
    //   272: dup
    //   273: iconst_0
    //   274: aaload
    //   275: invokevirtual 49	java/lang/Class:getName	()Ljava/lang/String;
    //   278: ldc 55
    //   280: invokevirtual 27	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   283: ifeq +47 -> 330
    //   286: pop
    //   287: iconst_3
    //   288: ireturn
    //   289: goto +41 -> 330
    //   292: ldc 62
    //   294: invokevirtual 27	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   297: ifeq +30 -> 327
    //   300: dup
    //   301: arraylength
    //   302: tableswitch	default:+21->323, 0:+18->320
    //   320: pop
    //   321: iconst_5
    //   322: ireturn
    //   323: goto +7 -> 330
    //   326: pop
    //   327: goto +3 -> 330
    //   330: pop
    //   331: iconst_m1
    //   332: ireturn
  }
  
  /* Error */
  public int getIndex(Class[] arg1)
  {
	return 0;
    // Byte code:
    //   0: aload_1
    //   1: dup
    //   2: arraylength
    //   3: tableswitch	default:+20->23, 0:+17->20
    //   20: pop
    //   21: iconst_0
    //   22: ireturn
    //   23: goto +3 -> 26
    //   26: pop
    //   27: iconst_m1
    //   28: ireturn
  }
  
  /* Error */
  public Object invoke(int arg1, Object arg2, Object[] arg3)
    throws InvocationTargetException
  {
	return null; // for not error
    // Byte code:
    //   0: aload_2
    //   1: checkcast 71	pattern/proxy/cglib/TargetObject
    //   4: iload_1
    //   5: tableswitch	default:+122->127, 0:+39->44, 1:+49->54, 2:+53->58, 3:+74->79, 4:+95->100, 5:+110->115
    //   44: aload_3
    //   45: iconst_0
    //   46: aaload
    //   47: checkcast 41	java/lang/String
    //   50: invokevirtual 74	pattern/proxy/cglib/TargetObject:name	(Ljava/lang/String;)Ljava/lang/String;
    //   53: areturn
    //   54: invokevirtual 75	pattern/proxy/cglib/TargetObject:toString	()Ljava/lang/String;
    //   57: areturn
    //   58: aload_3
    //   59: iconst_0
    //   60: aaload
    //   61: checkcast 77	java/lang/Number
    //   64: invokevirtual 80	java/lang/Number:intValue	()I
    //   67: invokevirtual 83	pattern/proxy/cglib/TargetObject:age	(I)I
    //   70: new 85	java/lang/Integer
    //   73: dup_x1
    //   74: swap
    //   75: invokespecial 88	java/lang/Integer:<init>	(I)V
    //   78: areturn
    //   79: aload_3
    //   80: iconst_0
    //   81: aaload
    //   82: checkcast 77	java/lang/Number
    //   85: invokevirtual 80	java/lang/Number:intValue	()I
    //   88: invokevirtual 90	pattern/proxy/cglib/TargetObject:score	(I)I
    //   91: new 85	java/lang/Integer
    //   94: dup_x1
    //   95: swap
    //   96: invokespecial 88	java/lang/Integer:<init>	(I)V
    //   99: areturn
    //   100: aload_3
    //   101: iconst_0
    //   102: aaload
    //   103: invokevirtual 91	pattern/proxy/cglib/TargetObject:equals	(Ljava/lang/Object;)Z
    //   106: new 93	java/lang/Boolean
    //   109: dup_x1
    //   110: swap
    //   111: invokespecial 96	java/lang/Boolean:<init>	(Z)V
    //   114: areturn
    //   115: invokevirtual 97	pattern/proxy/cglib/TargetObject:hashCode	()I
    //   118: new 85	java/lang/Integer
    //   121: dup_x1
    //   122: swap
    //   123: invokespecial 88	java/lang/Integer:<init>	(I)V
    //   126: areturn
    //   127: goto +12 -> 139
    //   130: new 69	java/lang/reflect/InvocationTargetException
    //   133: dup_x1
    //   134: swap
    //   135: invokespecial 102	java/lang/reflect/InvocationTargetException:<init>	(Ljava/lang/Throwable;)V
    //   138: athrow
    //   139: new 104	java/lang/IllegalArgumentException
    //   142: dup
    //   143: ldc 106
    //   145: invokespecial 109	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   148: athrow
    // Exception table:
    //   from	to	target	type
    //   5	130	130	java/lang/Throwable
  }
  
  public Object newInstance(int paramInt, Object[] paramArrayOfObject)
    throws InvocationTargetException
  {
    try
    {
      switch (paramInt)
      {
      case 0: 
        return new TargetObject();
      }
    }
    catch (Throwable localThrowable)
    {
      throw new InvocationTargetException(localThrowable);
    }
    throw new IllegalArgumentException("Cannot find matching method/constructor");
  }
  
  public int getMaxIndex()
  {
    return 5;
  }
}
