package innerclass;
public class Parcel4 {

    private class Dog implements Animal {

        @Override
        public void eat() {
            System.out.println("啃骨头");
        }
    }

    public Animal getDog(){
        return new Dog();
    }

    public static void main(String[] args) {
        Parcel4 p4 = new Parcel4();
        //Animal dog = p4.new Dog();
        Animal dog = p4.getDog();
        dog.eat();
    }
}