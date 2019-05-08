package pattern.observer;

import java.util.Observable;
import java.util.Observer;

//读者类，要实现观察者接口,相当于是订阅者
public class Reader implements Observer{
    
    private String readerName;
    
    public Reader(String name) {
        super();
        this.readerName = name;
    }

    public String getName() {
        return readerName;
    }
    
    //读者可以关注某一位作者，关注则代表把自己加到作者的观察者列表里
    public void subscribe(String writerName){
    	//addObserver方法使用的是Observable
        WriterManager.getInstance().getWriter(writerName).addObserver(this);
    }
    
    //读者可以取消关注某一位作者，取消关注则代表把自己从作者的观察者列表里删除
    public void unsubscribe(String writerName){
    	//deleteObserver方法使用的是Observable
        WriterManager.getInstance().getWriter(writerName).deleteObserver(this);
    }
    
    //当关注的作者发表新小说时，会通知读者去看,Observable是可观察的意思.也就是发布者.
    public void update(Observable o, Object obj) {
        if (o instanceof Writer) {
            Writer writer = (Writer) o;
            System.out.println(readerName+"知道" + writer.getName() + "发布了新书《" + writer.getLastNovel() + "》，非要去看！");
        }
    }

    
}