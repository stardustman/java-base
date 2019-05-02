package http;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

// �� ���� �ṹһ��
public class LatchTest2 {

    public static void main(String[] args) throws InterruptedException {

        Runnable taskTemp = new Runnable() {

            private int iCounter;

            @Override
            public void run() {
                // ��������
//              HttpClientOp.doGet("https://www.baidu.com/");
                iCounter++;
                System.out.println(System.nanoTime() + " [" + Thread.currentThread().getName() + "] iCounter = " + iCounter);
            }
        };

        LatchTest2 latchTest = new LatchTest2();
//        latchTest.startTaskAllInOnce(5, taskTemp);
        latchTest.startNThreadsByBarrier(500, taskTemp);
    }

    public void startNThreadsByBarrier(int threadNums, Runnable finishTask) throws InterruptedException {
        // ����դ�����ʱ�Ķ����������ʼ��ĳЩֵ
        CyclicBarrier barrier = new CyclicBarrier(threadNums, finishTask);
        // ���� n ���̣߳���դ����ֵһ�£������߳�׼�����ﵽҪ��ʱ��դ���պÿ������Ӷ��ﵽͳһ����Ч��
        for (int i = 0; i < threadNums; i++) {
            Thread.sleep(100);
            new Thread(new CounterTask(barrier)).start();
        }
        System.out.println(Thread.currentThread().getName() + " out over...");
    }
}

class CounterTask implements Runnable {

    // ����դ����һ�㿼�Ǹ����ŷ�ʽ
    private CyclicBarrier barrier;

    public CounterTask(final CyclicBarrier barrier) {
        this.barrier = barrier;
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + " - " + System.currentTimeMillis() + " is ready...");
        try {
            // ����դ����ʹ�ڴ˵ȴ�������λ�õ��̴߳ﵽҪ�󼴿ɿ�������
            barrier.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " - " + System.currentTimeMillis() + " started...");
    }
}