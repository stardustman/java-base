package pattern.proxy.dynamic.net.sf.cglib.proxy;

import net.sf.cglib.core.*;
import org.objectweb.asm.*;

/**
 * ‘ˆ«ø∞Ê ÷ÿ–¥ hashCode toString equals
 * @author young
 *
 */
public class Enhancer$EnhancerKey$$KeyFactoryByCGLIB$$7fb24d72 extends KeyFactory implements net.sf.cglib.proxy.Enhancer.EnhancerKey
{
    private final String FIELD_0;
    private final String[] FIELD_1;
    private final WeakCacheKey FIELD_2;
    private final Type[] FIELD_3;
    private final boolean FIELD_4;
    private final boolean FIELD_5;
    private final Long FIELD_6;
    
    /*public Enhancer$EnhancerKey$$KeyFactoryByCGLIB$$7fb24d72() {
    }*/
    
    public Object newInstance(final String s, final String[] array, final WeakCacheKey weakCacheKey, final Type[] array2, final boolean b, final boolean b2, final Long n) {
        return new Enhancer$EnhancerKey$$KeyFactoryByCGLIB$$7fb24d72(s, array, weakCacheKey, array2, b, b2, n);
    }
    
    public Enhancer$EnhancerKey$$KeyFactoryByCGLIB$$7fb24d72(final String field_0, final String[] field_2, final WeakCacheKey field_3, final Type[] field_4, final boolean field_5, final boolean field_6, final Long field_7) {
        this.FIELD_0 = field_0;
        this.FIELD_1 = field_2;
        this.FIELD_2 = field_3;
        this.FIELD_3 = field_4;
        this.FIELD_4 = field_5;
        this.FIELD_5 = field_6;
        this.FIELD_6 = field_7;
    }
    
    public int hashCode() {
        final int n = 19289;
        final String field_0 = this.FIELD_0;
        int n3;
        int n2 = n3 = n * 641371 + ((field_0 != null) ? field_0.hashCode() : 0);
        final String[] field_2 = this.FIELD_1;
        if (field_2 != null) {
            final String[] array = field_2;
            for (int i = 0; i < array.length; ++i) {
                final String s = array[i];
                n2 = (n3 = n3 * 641371 + ((s != null) ? s.hashCode() : 0));
            }
        }
        final WeakCacheKey field_3 = this.FIELD_2;
        int n5;
        int n4 = n5 = n2 * 641371 + ((field_3 != null) ? field_3.hashCode() : 0);
        final Type[] field_4 = this.FIELD_3;
        if (field_4 != null) {
            final Type[] array2 = field_4;
            for (int j = 0; j < array2.length; ++j) {
                final Type type = array2[j];
                n4 = (n5 = n5 * 641371 + ((type != null) ? type.hashCode() : 0));
            }
        }
        final int n6 = (n4 * 641371 + ((this.FIELD_4 ^ true) ? 1 : 0)) * 641371 + ((this.FIELD_5 ^ true) ? 1 : 0);
        final Long field_5 = this.FIELD_6;
        return n6 * 641371 + ((field_5 != null) ? field_5.hashCode() : 0);
    }
    
    public boolean equals(final Object o) {
        if (o instanceof Enhancer$EnhancerKey$$KeyFactoryByCGLIB$$7fb24d72) {
            final String field_0 = this.FIELD_0;
            final String field_2 = ((Enhancer$EnhancerKey$$KeyFactoryByCGLIB$$7fb24d72)o).FIELD_0;
            Label_0045: {
                if (field_2 == null) {
                    if (field_0 == null) {
                        break Label_0045;
                    }
                }
                else if (field_0 != null) {
                    if (field_0.equals(field_2)) {
                        break Label_0045;
                    }
                }
                return false;
            }
            final String[] field_3 = this.FIELD_1;
            final String[] field_4 = ((Enhancer$EnhancerKey$$KeyFactoryByCGLIB$$7fb24d72)o).FIELD_1;
            Label_0141: {
                if (field_4 == null) {
                    if (field_3 == null) {
                        break Label_0141;
                    }
                }
                else if (field_3 != null) {
                    if (field_4.length == field_3.length) {
                        final String[] array = field_4;
                        final String[] array2 = field_3;
                        for (int i = 0; i < array.length; ++i) {
                            final String s = array[i];
                            final String s2 = array2[i];
                            if (s2 == null) {
                                if (s != null) {
                                    return false;
                                }
                            }
                            else {
                                if (s == null) {
                                    return false;
                                }
                                if (!s.equals(s2)) {
                                    return false;
                                }
                            }
                        }
                        break Label_0141;
                    }
                }
                return false;
            }
            final WeakCacheKey field_5 = this.FIELD_2;
            final WeakCacheKey field_6 = ((Enhancer$EnhancerKey$$KeyFactoryByCGLIB$$7fb24d72)o).FIELD_2;
            Label_0179: {
                if (field_6 == null) {
                    if (field_5 == null) {
                        break Label_0179;
                    }
                }
                else if (field_5 != null) {
                    if (field_5.equals(field_6)) {
                        break Label_0179;
                    }
                }
                return false;
            }
            final Type[] field_7 = this.FIELD_3;
            final Type[] field_8 = ((Enhancer$EnhancerKey$$KeyFactoryByCGLIB$$7fb24d72)o).FIELD_3;
            Label_0280: {
                if (field_8 == null) {
                    if (field_7 == null) {
                        break Label_0280;
                    }
                }
                else if (field_7 != null) {
                    if (field_8.length == field_7.length) {
                        final Type[] array3 = field_8;
                        final Type[] array4 = field_7;
                        for (int j = 0; j < array3.length; ++j) {
                            final Type type = array3[j];
                            final Type type2 = array4[j];
                            if (type2 == null) {
                                if (type != null) {
                                    return false;
                                }
                            }
                            else {
                                if (type == null) {
                                    return false;
                                }
                                if (!type.equals(type2)) {
                                    return false;
                                }
                            }
                        }
                        break Label_0280;
                    }
                }
                return false;
            }
            if (this.FIELD_4 == ((Enhancer$EnhancerKey$$KeyFactoryByCGLIB$$7fb24d72)o).FIELD_4 && this.FIELD_5 == ((Enhancer$EnhancerKey$$KeyFactoryByCGLIB$$7fb24d72)o).FIELD_5) {
                final Long field_9 = this.FIELD_6;
                final Long field_10 = ((Enhancer$EnhancerKey$$KeyFactoryByCGLIB$$7fb24d72)o).FIELD_6;
                if (field_10 == null) {
                    if (field_9 == null) {
                        return true;
                    }
                }
                else if (field_9 != null) {
                    if (field_9.equals(field_10)) {
                        return true;
                    }
                }
                return false;
            }
        }
        return false;
    }
    
    public String toString() {
        final StringBuffer sb = new StringBuffer();
        final String field_0 = this.FIELD_0;
        final StringBuffer append = ((field_0 != null) ? sb.append(field_0.toString()) : sb.append("null")).append(", ");
        final String[] field_2 = this.FIELD_1;
        StringBuffer sb7;
        if (field_2 != null) {
            StringBuffer sb6;
            StringBuffer sb5;
            StringBuffer sb4;
            StringBuffer sb3;
            StringBuffer sb2 = sb3 = (sb4 = (sb5 = (sb6 = append.append("{"))));
            final String[] array = field_2;
            for (int i = 0; i < array.length; ++i) {
                final String s = array[i];
                sb2 = (sb3 = (sb4 = (sb5 = (sb6 = ((s != null) ? sb3.append(s.toString()) : sb2.append("null")).append(", ")))));
            }
            sb5.setLength(sb4.length() - 2);
            sb7 = sb6.append("}");
        }
        else {
            sb7 = append.append("null");
        }
        final StringBuffer append2 = sb7.append(", ");
        final WeakCacheKey field_3 = this.FIELD_2;
        final StringBuffer append3 = ((field_3 != null) ? append2.append(field_3.toString()) : append2.append("null")).append(", ");
        final Type[] field_4 = this.FIELD_3;
        StringBuffer sb13;
        if (field_4 != null) {
            StringBuffer sb12;
            StringBuffer sb11;
            StringBuffer sb10;
            StringBuffer sb9;
            StringBuffer sb8 = sb9 = (sb10 = (sb11 = (sb12 = append3.append("{"))));
            final Type[] array2 = field_4;
            for (int j = 0; j < array2.length; ++j) {
                final Type type = array2[j];
                sb8 = (sb9 = (sb10 = (sb11 = (sb12 = ((type != null) ? sb9.append(type.toString()) : sb8.append("null")).append(", ")))));
            }
            sb11.setLength(sb10.length() - 2);
            sb13 = sb12.append("}");
        }
        else {
            sb13 = append3.append("null");
        }
        final StringBuffer append4 = sb13.append(", ").append(this.FIELD_4).append(", ").append(this.FIELD_5).append(", ");
        final Long field_5 = this.FIELD_6;
        return ((field_5 != null) ? append4.append(field_5.toString()) : append4.append("null")).toString();
    }
}
