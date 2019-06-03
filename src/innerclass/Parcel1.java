package innerclass;

public class Parcel1 {
    public class Contents{
        private int value = 0;

        public int getValue(){
            return value;
        }
    }
    
    public Contents contents(){
    	return new Contents();
    }
    
    public static void main(String[] args) {
		Parcel1 p1 = new Parcel1();
		Parcel1.Contents pc1 = p1.contents();
		System.out.println(pc1.getValue());
	}
}