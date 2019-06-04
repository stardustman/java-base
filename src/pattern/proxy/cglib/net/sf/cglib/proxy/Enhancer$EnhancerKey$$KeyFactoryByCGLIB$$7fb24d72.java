package pattern.proxy.cglib.net.sf.cglib.proxy;

import net.sf.cglib.core.KeyFactory;
import net.sf.cglib.core.WeakCacheKey;
import org.objectweb.asm.Type;

public class Enhancer$EnhancerKey$$KeyFactoryByCGLIB$$7fb24d72
  extends KeyFactory
  implements net.sf.cglib.proxy.Enhancer.EnhancerKey
{
  // remove all final keys   
  private  String FIELD_0;
  private  String[] FIELD_1;
  private  WeakCacheKey FIELD_2;
  private  Type[] FIELD_3;
  private  boolean FIELD_4;
  private  boolean FIELD_5;
  private  Long FIELD_6;
  
  public Enhancer$EnhancerKey$$KeyFactoryByCGLIB$$7fb24d72() {}
  
  public Object newInstance(String paramString, String[] paramArrayOfString, WeakCacheKey paramWeakCacheKey, Type[] paramArrayOfType, boolean paramBoolean1, boolean paramBoolean2, Long paramLong)
  {
	  return new Enhancer$EnhancerKey$$KeyFactoryByCGLIB$$7fb24d72(paramString, paramArrayOfString, paramWeakCacheKey, paramArrayOfType, paramBoolean1, paramBoolean2, paramLong);
   // return new 7fb24d72(paramString, paramArrayOfString, paramWeakCacheKey, paramArrayOfType, paramBoolean1, paramBoolean2, paramLong);
  }
  
  public Enhancer$EnhancerKey$$KeyFactoryByCGLIB$$7fb24d72(String paramString, String[] paramArrayOfString, WeakCacheKey paramWeakCacheKey, Type[] paramArrayOfType, boolean paramBoolean1, boolean paramBoolean2, Long paramLong)
  {
    this.FIELD_0 = paramString;
    this.FIELD_1 = paramArrayOfString;
    this.FIELD_2 = paramWeakCacheKey;
    this.FIELD_3 = paramArrayOfType;
    this.FIELD_4 = paramBoolean1;
    this.FIELD_5 = paramBoolean2;
    this.FIELD_6 = paramLong;
  }
  
  /* Error */
  public int hashCode()
  {
	  return 0;
    // Byte code:
    //   0: sipush 19289
    //   3: aload_0
    //   4: getfield 20	net/sf/cglib/proxy/Enhancer$EnhancerKey$$KeyFactoryByCGLIB$$7fb24d72:FIELD_0	Ljava/lang/String;
    //   7: swap
    //   8: ldc 46
    //   10: imul
    //   11: swap
    //   12: dup
    //   13: ifnull +9 -> 22
    //   16: invokevirtual 50	java/lang/Object:hashCode	()I
    //   19: goto +5 -> 24
    //   22: pop
    //   23: iconst_0
    //   24: iadd
    //   25: aload_0
    //   26: getfield 24	net/sf/cglib/proxy/Enhancer$EnhancerKey$$KeyFactoryByCGLIB$$7fb24d72:FIELD_1	[Ljava/lang/String;
    //   29: dup
    //   30: ifnull +42 -> 72
    //   33: astore_1
    //   34: iconst_0
    //   35: istore_2
    //   36: goto +27 -> 63
    //   39: aload_1
    //   40: iload_2
    //   41: aaload
    //   42: swap
    //   43: ldc 46
    //   45: imul
    //   46: swap
    //   47: dup
    //   48: ifnull +9 -> 57
    //   51: invokevirtual 50	java/lang/Object:hashCode	()I
    //   54: goto +5 -> 59
    //   57: pop
    //   58: iconst_0
    //   59: iadd
    //   60: iinc 2 1
    //   63: iload_2
    //   64: aload_1
    //   65: arraylength
    //   66: if_icmplt -27 -> 39
    //   69: goto +4 -> 73
    //   72: pop
    //   73: aload_0
    //   74: getfield 28	net/sf/cglib/proxy/Enhancer$EnhancerKey$$KeyFactoryByCGLIB$$7fb24d72:FIELD_2	Lnet/sf/cglib/core/WeakCacheKey;
    //   77: swap
    //   78: ldc 46
    //   80: imul
    //   81: swap
    //   82: dup
    //   83: ifnull +9 -> 92
    //   86: invokevirtual 50	java/lang/Object:hashCode	()I
    //   89: goto +5 -> 94
    //   92: pop
    //   93: iconst_0
    //   94: iadd
    //   95: aload_0
    //   96: getfield 32	net/sf/cglib/proxy/Enhancer$EnhancerKey$$KeyFactoryByCGLIB$$7fb24d72:FIELD_3	[Lorg/objectweb/asm/Type;
    //   99: dup
    //   100: ifnull +45 -> 145
    //   103: astore_3
    //   104: iconst_0
    //   105: istore 4
    //   107: goto +28 -> 135
    //   110: aload_3
    //   111: iload 4
    //   113: aaload
    //   114: swap
    //   115: ldc 46
    //   117: imul
    //   118: swap
    //   119: dup
    //   120: ifnull +9 -> 129
    //   123: invokevirtual 50	java/lang/Object:hashCode	()I
    //   126: goto +5 -> 131
    //   129: pop
    //   130: iconst_0
    //   131: iadd
    //   132: iinc 4 1
    //   135: iload 4
    //   137: aload_3
    //   138: arraylength
    //   139: if_icmplt -29 -> 110
    //   142: goto +4 -> 146
    //   145: pop
    //   146: aload_0
    //   147: getfield 36	net/sf/cglib/proxy/Enhancer$EnhancerKey$$KeyFactoryByCGLIB$$7fb24d72:FIELD_4	Z
    //   150: swap
    //   151: ldc 46
    //   153: imul
    //   154: swap
    //   155: iconst_1
    //   156: ixor
    //   157: iadd
    //   158: aload_0
    //   159: getfield 39	net/sf/cglib/proxy/Enhancer$EnhancerKey$$KeyFactoryByCGLIB$$7fb24d72:FIELD_5	Z
    //   162: swap
    //   163: ldc 46
    //   165: imul
    //   166: swap
    //   167: iconst_1
    //   168: ixor
    //   169: iadd
    //   170: aload_0
    //   171: getfield 43	net/sf/cglib/proxy/Enhancer$EnhancerKey$$KeyFactoryByCGLIB$$7fb24d72:FIELD_6	Ljava/lang/Long;
    //   174: swap
    //   175: ldc 46
    //   177: imul
    //   178: swap
    //   179: dup
    //   180: ifnull +9 -> 189
    //   183: invokevirtual 50	java/lang/Object:hashCode	()I
    //   186: goto +5 -> 191
    //   189: pop
    //   190: iconst_0
    //   191: iadd
    //   192: ireturn
  }
  
  /* Error */
  public boolean equals(Object arg1)
  {
	return false;  // for not report error
    // Byte code:
    //   0: aload_1
    //   1: instanceof 2
    //   4: ifeq +344 -> 348
    //   7: aload_0
    //   8: getfield 20	net/sf/cglib/proxy/Enhancer$EnhancerKey$$KeyFactoryByCGLIB$$7fb24d72:FIELD_0	Ljava/lang/String;
    //   11: aload_1
    //   12: checkcast 2	net/sf/cglib/proxy/Enhancer$EnhancerKey$$KeyFactoryByCGLIB$$7fb24d72
    //   15: getfield 20	net/sf/cglib/proxy/Enhancer$EnhancerKey$$KeyFactoryByCGLIB$$7fb24d72:FIELD_0	Ljava/lang/String;
    //   18: dup2
    //   19: ifnonnull +10 -> 29
    //   22: ifnonnull +13 -> 35
    //   25: pop2
    //   26: goto +19 -> 45
    //   29: ifnull +6 -> 35
    //   32: goto +7 -> 39
    //   35: pop2
    //   36: goto +312 -> 348
    //   39: invokevirtual 64	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   42: ifeq +306 -> 348
    //   45: aload_0
    //   46: getfield 24	net/sf/cglib/proxy/Enhancer$EnhancerKey$$KeyFactoryByCGLIB$$7fb24d72:FIELD_1	[Ljava/lang/String;
    //   49: aload_1
    //   50: checkcast 2	net/sf/cglib/proxy/Enhancer$EnhancerKey$$KeyFactoryByCGLIB$$7fb24d72
    //   53: getfield 24	net/sf/cglib/proxy/Enhancer$EnhancerKey$$KeyFactoryByCGLIB$$7fb24d72:FIELD_1	[Ljava/lang/String;
    //   56: dup2
    //   57: ifnonnull +10 -> 67
    //   60: ifnonnull +13 -> 73
    //   63: pop2
    //   64: goto +77 -> 141
    //   67: ifnull +6 -> 73
    //   70: goto +7 -> 77
    //   73: pop2
    //   74: goto +274 -> 348
    //   77: dup2
    //   78: arraylength
    //   79: swap
    //   80: arraylength
    //   81: if_icmpeq +7 -> 88
    //   84: pop2
    //   85: goto +263 -> 348
    //   88: astore_2
    //   89: astore_3
    //   90: iconst_0
    //   91: istore 4
    //   93: goto +41 -> 134
    //   96: aload_2
    //   97: iload 4
    //   99: aaload
    //   100: aload_3
    //   101: iload 4
    //   103: aaload
    //   104: dup2
    //   105: ifnonnull +10 -> 115
    //   108: ifnonnull +13 -> 121
    //   111: pop2
    //   112: goto +19 -> 131
    //   115: ifnull +6 -> 121
    //   118: goto +7 -> 125
    //   121: pop2
    //   122: goto +226 -> 348
    //   125: invokevirtual 64	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   128: ifeq +220 -> 348
    //   131: iinc 4 1
    //   134: iload 4
    //   136: aload_2
    //   137: arraylength
    //   138: if_icmplt -42 -> 96
    //   141: aload_0
    //   142: getfield 28	net/sf/cglib/proxy/Enhancer$EnhancerKey$$KeyFactoryByCGLIB$$7fb24d72:FIELD_2	Lnet/sf/cglib/core/WeakCacheKey;
    //   145: aload_1
    //   146: checkcast 2	net/sf/cglib/proxy/Enhancer$EnhancerKey$$KeyFactoryByCGLIB$$7fb24d72
    //   149: getfield 28	net/sf/cglib/proxy/Enhancer$EnhancerKey$$KeyFactoryByCGLIB$$7fb24d72:FIELD_2	Lnet/sf/cglib/core/WeakCacheKey;
    //   152: dup2
    //   153: ifnonnull +10 -> 163
    //   156: ifnonnull +13 -> 169
    //   159: pop2
    //   160: goto +19 -> 179
    //   163: ifnull +6 -> 169
    //   166: goto +7 -> 173
    //   169: pop2
    //   170: goto +178 -> 348
    //   173: invokevirtual 64	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   176: ifeq +172 -> 348
    //   179: aload_0
    //   180: getfield 32	net/sf/cglib/proxy/Enhancer$EnhancerKey$$KeyFactoryByCGLIB$$7fb24d72:FIELD_3	[Lorg/objectweb/asm/Type;
    //   183: aload_1
    //   184: checkcast 2	net/sf/cglib/proxy/Enhancer$EnhancerKey$$KeyFactoryByCGLIB$$7fb24d72
    //   187: getfield 32	net/sf/cglib/proxy/Enhancer$EnhancerKey$$KeyFactoryByCGLIB$$7fb24d72:FIELD_3	[Lorg/objectweb/asm/Type;
    //   190: dup2
    //   191: ifnonnull +10 -> 201
    //   194: ifnonnull +13 -> 207
    //   197: pop2
    //   198: goto +82 -> 280
    //   201: ifnull +6 -> 207
    //   204: goto +7 -> 211
    //   207: pop2
    //   208: goto +140 -> 348
    //   211: dup2
    //   212: arraylength
    //   213: swap
    //   214: arraylength
    //   215: if_icmpeq +7 -> 222
    //   218: pop2
    //   219: goto +129 -> 348
    //   222: astore 5
    //   224: astore 6
    //   226: iconst_0
    //   227: istore 7
    //   229: goto +43 -> 272
    //   232: aload 5
    //   234: iload 7
    //   236: aaload
    //   237: aload 6
    //   239: iload 7
    //   241: aaload
    //   242: dup2
    //   243: ifnonnull +10 -> 253
    //   246: ifnonnull +13 -> 259
    //   249: pop2
    //   250: goto +19 -> 269
    //   253: ifnull +6 -> 259
    //   256: goto +7 -> 263
    //   259: pop2
    //   260: goto +88 -> 348
    //   263: invokevirtual 64	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   266: ifeq +82 -> 348
    //   269: iinc 7 1
    //   272: iload 7
    //   274: aload 5
    //   276: arraylength
    //   277: if_icmplt -45 -> 232
    //   280: aload_0
    //   281: getfield 36	net/sf/cglib/proxy/Enhancer$EnhancerKey$$KeyFactoryByCGLIB$$7fb24d72:FIELD_4	Z
    //   284: aload_1
    //   285: checkcast 2	net/sf/cglib/proxy/Enhancer$EnhancerKey$$KeyFactoryByCGLIB$$7fb24d72
    //   288: getfield 36	net/sf/cglib/proxy/Enhancer$EnhancerKey$$KeyFactoryByCGLIB$$7fb24d72:FIELD_4	Z
    //   291: if_icmpne +57 -> 348
    //   294: aload_0
    //   295: getfield 39	net/sf/cglib/proxy/Enhancer$EnhancerKey$$KeyFactoryByCGLIB$$7fb24d72:FIELD_5	Z
    //   298: aload_1
    //   299: checkcast 2	net/sf/cglib/proxy/Enhancer$EnhancerKey$$KeyFactoryByCGLIB$$7fb24d72
    //   302: getfield 39	net/sf/cglib/proxy/Enhancer$EnhancerKey$$KeyFactoryByCGLIB$$7fb24d72:FIELD_5	Z
    //   305: if_icmpne +43 -> 348
    //   308: aload_0
    //   309: getfield 43	net/sf/cglib/proxy/Enhancer$EnhancerKey$$KeyFactoryByCGLIB$$7fb24d72:FIELD_6	Ljava/lang/Long;
    //   312: aload_1
    //   313: checkcast 2	net/sf/cglib/proxy/Enhancer$EnhancerKey$$KeyFactoryByCGLIB$$7fb24d72
    //   316: getfield 43	net/sf/cglib/proxy/Enhancer$EnhancerKey$$KeyFactoryByCGLIB$$7fb24d72:FIELD_6	Ljava/lang/Long;
    //   319: dup2
    //   320: ifnonnull +10 -> 330
    //   323: ifnonnull +13 -> 336
    //   326: pop2
    //   327: goto +19 -> 346
    //   330: ifnull +6 -> 336
    //   333: goto +7 -> 340
    //   336: pop2
    //   337: goto +11 -> 348
    //   340: invokevirtual 64	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   343: ifeq +5 -> 348
    //   346: iconst_1
    //   347: ireturn
    //   348: iconst_0
    //   349: ireturn
  }
  
  /* Error */
  public String toString()
  {
	  return null;// for not report error
    // Byte code:
    //   0: new 68	java/lang/StringBuffer
    //   3: dup
    //   4: invokespecial 69	java/lang/StringBuffer:<init>	()V
    //   7: aload_0
    //   8: getfield 20	net/sf/cglib/proxy/Enhancer$EnhancerKey$$KeyFactoryByCGLIB$$7fb24d72:FIELD_0	Ljava/lang/String;
    //   11: dup
    //   12: ifnull +12 -> 24
    //   15: invokevirtual 71	java/lang/Object:toString	()Ljava/lang/String;
    //   18: invokevirtual 75	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   21: goto +9 -> 30
    //   24: pop
    //   25: ldc 77
    //   27: invokevirtual 75	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   30: ldc 79
    //   32: invokevirtual 75	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   35: aload_0
    //   36: getfield 24	net/sf/cglib/proxy/Enhancer$EnhancerKey$$KeyFactoryByCGLIB$$7fb24d72:FIELD_1	[Ljava/lang/String;
    //   39: dup
    //   40: ifnull +70 -> 110
    //   43: swap
    //   44: ldc 81
    //   46: invokevirtual 75	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   49: swap
    //   50: astore_1
    //   51: iconst_0
    //   52: istore_2
    //   53: goto +33 -> 86
    //   56: aload_1
    //   57: iload_2
    //   58: aaload
    //   59: dup
    //   60: ifnull +12 -> 72
    //   63: invokevirtual 71	java/lang/Object:toString	()Ljava/lang/String;
    //   66: invokevirtual 75	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   69: goto +9 -> 78
    //   72: pop
    //   73: ldc 77
    //   75: invokevirtual 75	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   78: ldc 79
    //   80: invokevirtual 75	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   83: iinc 2 1
    //   86: iload_2
    //   87: aload_1
    //   88: arraylength
    //   89: if_icmplt -33 -> 56
    //   92: dup
    //   93: dup
    //   94: invokevirtual 84	java/lang/StringBuffer:length	()I
    //   97: iconst_2
    //   98: isub
    //   99: invokevirtual 88	java/lang/StringBuffer:setLength	(I)V
    //   102: ldc 90
    //   104: invokevirtual 75	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   107: goto +9 -> 116
    //   110: pop
    //   111: ldc 77
    //   113: invokevirtual 75	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   116: ldc 79
    //   118: invokevirtual 75	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   121: aload_0
    //   122: getfield 28	net/sf/cglib/proxy/Enhancer$EnhancerKey$$KeyFactoryByCGLIB$$7fb24d72:FIELD_2	Lnet/sf/cglib/core/WeakCacheKey;
    //   125: dup
    //   126: ifnull +12 -> 138
    //   129: invokevirtual 71	java/lang/Object:toString	()Ljava/lang/String;
    //   132: invokevirtual 75	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   135: goto +9 -> 144
    //   138: pop
    //   139: ldc 77
    //   141: invokevirtual 75	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   144: ldc 79
    //   146: invokevirtual 75	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   149: aload_0
    //   150: getfield 32	net/sf/cglib/proxy/Enhancer$EnhancerKey$$KeyFactoryByCGLIB$$7fb24d72:FIELD_3	[Lorg/objectweb/asm/Type;
    //   153: dup
    //   154: ifnull +73 -> 227
    //   157: swap
    //   158: ldc 81
    //   160: invokevirtual 75	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   163: swap
    //   164: astore_3
    //   165: iconst_0
    //   166: istore 4
    //   168: goto +34 -> 202
    //   171: aload_3
    //   172: iload 4
    //   174: aaload
    //   175: dup
    //   176: ifnull +12 -> 188
    //   179: invokevirtual 71	java/lang/Object:toString	()Ljava/lang/String;
    //   182: invokevirtual 75	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   185: goto +9 -> 194
    //   188: pop
    //   189: ldc 77
    //   191: invokevirtual 75	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   194: ldc 79
    //   196: invokevirtual 75	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   199: iinc 4 1
    //   202: iload 4
    //   204: aload_3
    //   205: arraylength
    //   206: if_icmplt -35 -> 171
    //   209: dup
    //   210: dup
    //   211: invokevirtual 84	java/lang/StringBuffer:length	()I
    //   214: iconst_2
    //   215: isub
    //   216: invokevirtual 88	java/lang/StringBuffer:setLength	(I)V
    //   219: ldc 90
    //   221: invokevirtual 75	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   224: goto +9 -> 233
    //   227: pop
    //   228: ldc 77
    //   230: invokevirtual 75	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   233: ldc 79
    //   235: invokevirtual 75	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   238: aload_0
    //   239: getfield 36	net/sf/cglib/proxy/Enhancer$EnhancerKey$$KeyFactoryByCGLIB$$7fb24d72:FIELD_4	Z
    //   242: invokevirtual 93	java/lang/StringBuffer:append	(Z)Ljava/lang/StringBuffer;
    //   245: goto +9 -> 254
    //   248: nop
    //   249: nop
    //   250: nop
    //   251: nop
    //   252: nop
    //   253: athrow
    //   254: ldc 79
    //   256: invokevirtual 75	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   259: aload_0
    //   260: getfield 39	net/sf/cglib/proxy/Enhancer$EnhancerKey$$KeyFactoryByCGLIB$$7fb24d72:FIELD_5	Z
    //   263: invokevirtual 93	java/lang/StringBuffer:append	(Z)Ljava/lang/StringBuffer;
    //   266: goto +9 -> 275
    //   269: nop
    //   270: nop
    //   271: nop
    //   272: nop
    //   273: nop
    //   274: athrow
    //   275: ldc 79
    //   277: invokevirtual 75	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   280: aload_0
    //   281: getfield 43	net/sf/cglib/proxy/Enhancer$EnhancerKey$$KeyFactoryByCGLIB$$7fb24d72:FIELD_6	Ljava/lang/Long;
    //   284: dup
    //   285: ifnull +12 -> 297
    //   288: invokevirtual 71	java/lang/Object:toString	()Ljava/lang/String;
    //   291: invokevirtual 75	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   294: goto +9 -> 303
    //   297: pop
    //   298: ldc 77
    //   300: invokevirtual 75	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   303: invokevirtual 94	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   306: areturn
  }
}
