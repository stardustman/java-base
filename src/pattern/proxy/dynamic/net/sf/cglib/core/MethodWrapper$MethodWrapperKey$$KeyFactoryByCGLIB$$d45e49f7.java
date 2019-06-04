package pattern.proxy.dynamic.net.sf.cglib.core;

import net.sf.cglib.core.KeyFactory;
// https://github.com/deathmarine/Luyten/releases/tag/v0.5.4
/**
 * ÖØÐ´ hashCode equals toString
 * @author young
 *
 */
public class MethodWrapper$MethodWrapperKey$$KeyFactoryByCGLIB$$d45e49f7 extends KeyFactory implements net.sf.cglib.core.MethodWrapper.MethodWrapperKey
{
    private final String FIELD_0;
    private final String[] FIELD_1;
    private final String FIELD_2;
    
    /*public MethodWrapper$MethodWrapperKey$$KeyFactoryByCGLIB$$d45e49f7() {
    }*/
    
    public Object newInstance(final String s, final String[] array, final String s2) {
        return new MethodWrapper$MethodWrapperKey$$KeyFactoryByCGLIB$$d45e49f7(s, array, s2);
    }
    
    public MethodWrapper$MethodWrapperKey$$KeyFactoryByCGLIB$$d45e49f7(final String field_0, final String[] field_2, final String field_3) {
        this.FIELD_0 = field_0;
        this.FIELD_1 = field_2;
        this.FIELD_2 = field_3;
    }
    
    public int hashCode() {
        final int n = 938313161;
        final String field_0 = this.FIELD_0;
        int n3;
        int n2 = n3 = n * 362693231 + ((field_0 != null) ? field_0.hashCode() : 0);
        final String[] field_2 = this.FIELD_1;
        if (field_2 != null) {
            final String[] array = field_2;
            for (int i = 0; i < array.length; ++i) {
                final String s = array[i];
                n2 = (n3 = n3 * 362693231 + ((s != null) ? s.hashCode() : 0));
            }
        }
        final String field_3 = this.FIELD_2;
        return n2 * 362693231 + ((field_3 != null) ? field_3.hashCode() : 0);
    }
    
    public boolean equals(final Object o) {
        if (o instanceof MethodWrapper$MethodWrapperKey$$KeyFactoryByCGLIB$$d45e49f7) {
            final String field_0 = this.FIELD_0;
            final String field_2 = ((MethodWrapper$MethodWrapperKey$$KeyFactoryByCGLIB$$d45e49f7)o).FIELD_0;
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
            final String[] field_4 = ((MethodWrapper$MethodWrapperKey$$KeyFactoryByCGLIB$$d45e49f7)o).FIELD_1;
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
            final String field_5 = this.FIELD_2;
            final String field_6 = ((MethodWrapper$MethodWrapperKey$$KeyFactoryByCGLIB$$d45e49f7)o).FIELD_2;
            if (field_6 == null) {
                if (field_5 == null) {
                    return true;
                }
            }
            else if (field_5 != null) {
                if (field_5.equals(field_6)) {
                    return true;
                }
            }
            return false;
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
        final String field_3 = this.FIELD_2;
        return ((field_3 != null) ? append2.append(field_3.toString()) : append2.append("null")).toString();
    }
}
