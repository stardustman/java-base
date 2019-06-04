package pattern.proxy.cglib.net.sf.cglib.core;

import net.sf.cglib.core.KeyFactory;

public class MethodWrapper$MethodWrapperKey$$KeyFactoryByCGLIB$$d45e49f7
  extends KeyFactory
  implements net.sf.cglib.core.MethodWrapper.MethodWrapperKey
{
	// remove all final keys
  private  String FIELD_0;
  private  String[] FIELD_1;
  private  String FIELD_2;
  
  public MethodWrapper$MethodWrapperKey$$KeyFactoryByCGLIB$$d45e49f7() {}
  
  public Object newInstance(String paramString1, String[] paramArrayOfString, String paramString2)
  {
	  return new MethodWrapper$MethodWrapperKey$$KeyFactoryByCGLIB$$d45e49f7(paramString1, paramArrayOfString, paramString2);
    //return new d45e49f7(paramString1, paramArrayOfString, paramString2);

  }
  
  public MethodWrapper$MethodWrapperKey$$KeyFactoryByCGLIB$$d45e49f7(String paramString1, String[] paramArrayOfString, String paramString2)
  {
    this.FIELD_0 = paramString1;
    this.FIELD_1 = paramArrayOfString;
    this.FIELD_2 = paramString2;
  }
  
  /* Error */
  public int hashCode()
  {
	return 0; // for not report error
    // Byte code:
    //   0: ldc 30
    //   2: aload_0
    //   3: getfield 20	net/sf/cglib/core/MethodWrapper$MethodWrapperKey$$KeyFactoryByCGLIB$$d45e49f7:FIELD_0	Ljava/lang/String;
    //   6: swap
    //   7: ldc 31
    //   9: imul
    //   10: swap
    //   11: dup
    //   12: ifnull +9 -> 21
    //   15: invokevirtual 35	java/lang/Object:hashCode	()I
    //   18: goto +5 -> 23
    //   21: pop
    //   22: iconst_0
    //   23: iadd
    //   24: aload_0
    //   25: getfield 24	net/sf/cglib/core/MethodWrapper$MethodWrapperKey$$KeyFactoryByCGLIB$$d45e49f7:FIELD_1	[Ljava/lang/String;
    //   28: dup
    //   29: ifnull +42 -> 71
    //   32: astore_1
    //   33: iconst_0
    //   34: istore_2
    //   35: goto +27 -> 62
    //   38: aload_1
    //   39: iload_2
    //   40: aaload
    //   41: swap
    //   42: ldc 31
    //   44: imul
    //   45: swap
    //   46: dup
    //   47: ifnull +9 -> 56
    //   50: invokevirtual 35	java/lang/Object:hashCode	()I
    //   53: goto +5 -> 58
    //   56: pop
    //   57: iconst_0
    //   58: iadd
    //   59: iinc 2 1
    //   62: iload_2
    //   63: aload_1
    //   64: arraylength
    //   65: if_icmplt -27 -> 38
    //   68: goto +4 -> 72
    //   71: pop
    //   72: aload_0
    //   73: getfield 27	net/sf/cglib/core/MethodWrapper$MethodWrapperKey$$KeyFactoryByCGLIB$$d45e49f7:FIELD_2	Ljava/lang/String;
    //   76: swap
    //   77: ldc 31
    //   79: imul
    //   80: swap
    //   81: dup
    //   82: ifnull +9 -> 91
    //   85: invokevirtual 35	java/lang/Object:hashCode	()I
    //   88: goto +5 -> 93
    //   91: pop
    //   92: iconst_0
    //   93: iadd
    //   94: ireturn
  }
  
  /* Error */
  public boolean equals(Object arg1)
  {
	return false; // for not report error
    // Byte code:
    //   0: aload_1
    //   1: instanceof 2
    //   4: ifeq +177 -> 181
    //   7: aload_0
    //   8: getfield 20	net/sf/cglib/core/MethodWrapper$MethodWrapperKey$$KeyFactoryByCGLIB$$d45e49f7:FIELD_0	Ljava/lang/String;
    //   11: aload_1
    //   12: checkcast 2	net/sf/cglib/core/MethodWrapper$MethodWrapperKey$$KeyFactoryByCGLIB$$d45e49f7
    //   15: getfield 20	net/sf/cglib/core/MethodWrapper$MethodWrapperKey$$KeyFactoryByCGLIB$$d45e49f7:FIELD_0	Ljava/lang/String;
    //   18: dup2
    //   19: ifnonnull +10 -> 29
    //   22: ifnonnull +13 -> 35
    //   25: pop2
    //   26: goto +19 -> 45
    //   29: ifnull +6 -> 35
    //   32: goto +7 -> 39
    //   35: pop2
    //   36: goto +145 -> 181
    //   39: invokevirtual 42	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   42: ifeq +139 -> 181
    //   45: aload_0
    //   46: getfield 24	net/sf/cglib/core/MethodWrapper$MethodWrapperKey$$KeyFactoryByCGLIB$$d45e49f7:FIELD_1	[Ljava/lang/String;
    //   49: aload_1
    //   50: checkcast 2	net/sf/cglib/core/MethodWrapper$MethodWrapperKey$$KeyFactoryByCGLIB$$d45e49f7
    //   53: getfield 24	net/sf/cglib/core/MethodWrapper$MethodWrapperKey$$KeyFactoryByCGLIB$$d45e49f7:FIELD_1	[Ljava/lang/String;
    //   56: dup2
    //   57: ifnonnull +10 -> 67
    //   60: ifnonnull +13 -> 73
    //   63: pop2
    //   64: goto +77 -> 141
    //   67: ifnull +6 -> 73
    //   70: goto +7 -> 77
    //   73: pop2
    //   74: goto +107 -> 181
    //   77: dup2
    //   78: arraylength
    //   79: swap
    //   80: arraylength
    //   81: if_icmpeq +7 -> 88
    //   84: pop2
    //   85: goto +96 -> 181
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
    //   122: goto +59 -> 181
    //   125: invokevirtual 42	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   128: ifeq +53 -> 181
    //   131: iinc 4 1
    //   134: iload 4
    //   136: aload_2
    //   137: arraylength
    //   138: if_icmplt -42 -> 96
    //   141: aload_0
    //   142: getfield 27	net/sf/cglib/core/MethodWrapper$MethodWrapperKey$$KeyFactoryByCGLIB$$d45e49f7:FIELD_2	Ljava/lang/String;
    //   145: aload_1
    //   146: checkcast 2	net/sf/cglib/core/MethodWrapper$MethodWrapperKey$$KeyFactoryByCGLIB$$d45e49f7
    //   149: getfield 27	net/sf/cglib/core/MethodWrapper$MethodWrapperKey$$KeyFactoryByCGLIB$$d45e49f7:FIELD_2	Ljava/lang/String;
    //   152: dup2
    //   153: ifnonnull +10 -> 163
    //   156: ifnonnull +13 -> 169
    //   159: pop2
    //   160: goto +19 -> 179
    //   163: ifnull +6 -> 169
    //   166: goto +7 -> 173
    //   169: pop2
    //   170: goto +11 -> 181
    //   173: invokevirtual 42	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   176: ifeq +5 -> 181
    //   179: iconst_1
    //   180: ireturn
    //   181: iconst_0
    //   182: ireturn
  }
  
  /* Error */
  public String toString()
  {
	return null; // for not report error
    // Byte code:
    //   0: new 46	java/lang/StringBuffer
    //   3: dup
    //   4: invokespecial 47	java/lang/StringBuffer:<init>	()V
    //   7: aload_0
    //   8: getfield 20	net/sf/cglib/core/MethodWrapper$MethodWrapperKey$$KeyFactoryByCGLIB$$d45e49f7:FIELD_0	Ljava/lang/String;
    //   11: dup
    //   12: ifnull +12 -> 24
    //   15: invokevirtual 49	java/lang/Object:toString	()Ljava/lang/String;
    //   18: invokevirtual 53	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   21: goto +9 -> 30
    //   24: pop
    //   25: ldc 55
    //   27: invokevirtual 53	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   30: ldc 57
    //   32: invokevirtual 53	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   35: aload_0
    //   36: getfield 24	net/sf/cglib/core/MethodWrapper$MethodWrapperKey$$KeyFactoryByCGLIB$$d45e49f7:FIELD_1	[Ljava/lang/String;
    //   39: dup
    //   40: ifnull +70 -> 110
    //   43: swap
    //   44: ldc 59
    //   46: invokevirtual 53	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
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
    //   63: invokevirtual 49	java/lang/Object:toString	()Ljava/lang/String;
    //   66: invokevirtual 53	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   69: goto +9 -> 78
    //   72: pop
    //   73: ldc 55
    //   75: invokevirtual 53	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   78: ldc 57
    //   80: invokevirtual 53	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   83: iinc 2 1
    //   86: iload_2
    //   87: aload_1
    //   88: arraylength
    //   89: if_icmplt -33 -> 56
    //   92: dup
    //   93: dup
    //   94: invokevirtual 62	java/lang/StringBuffer:length	()I
    //   97: iconst_2
    //   98: isub
    //   99: invokevirtual 66	java/lang/StringBuffer:setLength	(I)V
    //   102: ldc 68
    //   104: invokevirtual 53	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   107: goto +9 -> 116
    //   110: pop
    //   111: ldc 55
    //   113: invokevirtual 53	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   116: ldc 57
    //   118: invokevirtual 53	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   121: aload_0
    //   122: getfield 27	net/sf/cglib/core/MethodWrapper$MethodWrapperKey$$KeyFactoryByCGLIB$$d45e49f7:FIELD_2	Ljava/lang/String;
    //   125: dup
    //   126: ifnull +12 -> 138
    //   129: invokevirtual 49	java/lang/Object:toString	()Ljava/lang/String;
    //   132: invokevirtual 53	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   135: goto +9 -> 144
    //   138: pop
    //   139: ldc 55
    //   141: invokevirtual 53	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   144: invokevirtual 69	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   147: areturn
  }
}
