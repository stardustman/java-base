package http;

import java.util.concurrent.CountDownLatch;

public class LatchTest {

    public static void main(String[] args) throws InterruptedException {
        Runnable taskTemp = new Runnable() {
            private int iCounter;

            @Override
            public void run() {
                for(int i = 0; i < 10; i++) {
                    // ��������
                	String res = HttpClientOp.doGet("https://www.baidu.com/");
                	System.out.println(res);
                    iCounter++;
                    System.out.println(System.nanoTime() + " [" + Thread.currentThread().getName() + "] iCounter = " + iCounter);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        LatchTest latchTest = new LatchTest();
        latchTest.startTaskAllInOnce(5, taskTemp);
    }

    public long startTaskAllInOnce(int threadNums, final Runnable task) throws InterruptedException {
        final CountDownLatch startGate = new CountDownLatch(1);
        final CountDownLatch endGate = new CountDownLatch(threadNums);
        for(int i = 0; i < threadNums; i++) {
            Thread t = new Thread() {
                public void run() {
                    try {
                        // ʹ�߳��ڴ˵ȴ�������ʼ�Ŵ�ʱ��һ��ӿ������
                        startGate.await();
                        try {
                            task.run();
                        } finally {
                            // �������ż�1������0ʱ���Ϳ��Կ�����������
                            endGate.countDown();
                        }
                    } catch (InterruptedException ie) {
                        ie.printStackTrace();
                    }
                }
            };
            t.start();
        }
        long startTime = System.nanoTime();
        System.out.println(startTime + " [" + Thread.currentThread() + "] All thread is ready, concurrent going...");
        // ������ֻ��һ�����أ���������Ϳ�����ʼ��
        startGate.countDown();
        // �ȵȽ����ſ���
        endGate.await();
        long endTime = System.nanoTime();
        System.out.println(endTime + " [" + Thread.currentThread() + "] All thread is completed.");
        return endTime - startTime;
    }
}