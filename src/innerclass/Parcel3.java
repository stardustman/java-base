package innerclass;
public class Parcel3 {

    public class Contents {

        public Parcel3 dotThis(){
            return Parcel3.this;
        }

        public String toString(){
            return "Contents";
        }
    }

    public Parcel3 contents(){
        return new Contents().dotThis();
    }

    public String toString(){
        return "Parcel3";
    }

    public static void main(String[] args) {
        Parcel3 pc3 = new Parcel3();
        Contents c = pc3.new Contents();
        Parcel3 parcel3 = pc3.contents();
        System.out.println(pc3);
        System.out.println(c);
        System.out.println(parcel3);
    }
}