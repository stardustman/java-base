package pattern.proxy.dynamic;
 
public class Car {
    public void start(){
        System.out.println("car is starting");
    }
 
    public void accelerate(int to){
        System.out.println("car is accelerating "+to+" mph");
    }
}