package pattern.observer;

import java.util.Observable;

//作者类，要继承自被观察者类
public class Writer extends Observable{
    
    private String writerName;//作者的名称
    
    private String lastNovel;//记录作者最新发布的小说

    public Writer(String name) {
        super();
        this.writerName = name;
        WriterManager.getInstance().add(this);
    }

    //作者发布新小说了，要通知所有关注自己的读者
    public void addNovel(String novel) {
        System.out.println(writerName + "发布了新书《" + novel + "》！");
        lastNovel = novel;
        //新发布了小说,发生了改变.
        setChanged();
        notifyObservers();
    }
    
    public String getLastNovel() {
        return lastNovel;
    }

    public String getName() {
        return writerName;
    }

}