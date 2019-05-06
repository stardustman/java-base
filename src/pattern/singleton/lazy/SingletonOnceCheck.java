package pattern.singleton.lazy;
public class SingletonOnceCheck {
   private static SingletonOnceCheck instance = null;
   private SingletonOnceCheck(){
   }
   public static SingletonOnceCheck getInstance() {
       if (instance == null) {
           instance = new SingletonOnceCheck(); 
       }        
       return instance; 
  }

}