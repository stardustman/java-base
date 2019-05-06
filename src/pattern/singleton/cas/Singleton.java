package pattern.singleton.cas;

import java.util.concurrent.atomic.AtomicReference;

public class Singleton {
    private static final AtomicReference<Singleton> INSTANCE = new AtomicReference<Singleton>();

    private Singleton() {}

    public static Singleton getInstance() {
        while(true){
            Singleton singleton = INSTANCE.get();
            if (null != singleton) {
                return singleton;
            }

            singleton = new Singleton();
            if (INSTANCE.compareAndSet(null, singleton)) {
                return singleton;
            }
        }
    }
}