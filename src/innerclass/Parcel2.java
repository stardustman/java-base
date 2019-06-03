package innerclass;
public class Parcel2 {

    private static int i = 11;

    public class Parcel2Inner {

        public Parcel2Inner(){
            i++;
        }

        public int getValue(){
            return i;
        }

    }

    public Parcel2Inner parcel2Inner(){
        return new Parcel2Inner();
    }

    public static void main(String[] args) {
        Parcel2 p2 = new Parcel2();
        for(int i = 0;i < 5;i++){
            p2.parcel2Inner();
        }
        System.out.println("p2.i = " + p2.i);
    }
}