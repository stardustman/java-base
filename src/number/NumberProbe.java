package number;
/**
 * 
 * @author young
 *
 */
public class NumberProbe {
    public static void main(String[] args) {
		int a = -3;
		int b = 3;
		// two's complement ²¹Âë
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toHexString(a));
		System.out.println(Integer.toBinaryString(b));
		System.out.println(Integer.toHexString(b));
	}
}
