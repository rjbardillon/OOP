package programming.assignment5.busywait;

import java.util.ArrayList;
import java.util.List;

public class Wait{

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        int maxCount = 10;

        Thread producerThread = new Thread(new Producer(list, maxCount), "Producer");
        Thread consumerThread = new Thread(new Consumer(list), "Consumer");

        producerThread.start();
        consumerThread.start();
    }
}

class Producer implements  Runnable {

    List<Integer> sharedList;
    int maxCount;
    int elementCount = 0;

    public Producer(List<Integer> sharedList, int maxCount) {
        this.sharedList = sharedList;
        this.maxCount = maxCount;
    }

    public void run() {
        try {
            produce();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void produce() throws InterruptedException {
        while(elementCount < 20) {
            synchronized (sharedList) {
                while (sharedList.size() == maxCount) {
                    sharedList.wait();
                }

                while (sharedList.size() < maxCount) {
                    System.out.println(Thread.currentThread().getName()+ " producing: " + elementCount);
                    sharedList.add(elementCount++);
                    sharedList.notify();
                }
            }
        }

    }
}

class Consumer implements Runnable {
    List<Integer> sharedList;

    public Consumer(List<Integer> sharedList) {
        this.sharedList = sharedList;
    }

    public void run() {
        try {
            consume();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void consume() throws InterruptedException {
        while(true) {
            synchronized (sharedList) {
                while (sharedList.size() == 0) {
                    sharedList.wait();
                }

                System.out.println(Thread.currentThread().getName()+ " consumed: " + sharedList.remove(0));
                sharedList.notify();

            }
        }
    }
}
