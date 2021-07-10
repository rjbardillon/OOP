/*
Bardillon, Romeo Jr, M.
BSIT 2-2
Main.java
 */
package programming.assignment5.busywait;

public class Main {
    static boolean flag;
    public static void main(String[] args) throws InterruptedException {
        Main main = new Main();
        System.out.printf("Flag is initially set to %s %n", flag);
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    main.thread1();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    main.thread2();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
    }

    public void thread1() throws InterruptedException {
        System.out.println("Thread1 started");
        Thread.sleep(5000);
        synchronized (this) {
            flag = true;
            System.out.printf("Thread1 set the Flag to %s %n", flag);
            notify();
        }
    }

    public void thread2() throws InterruptedException {
        long start;
        long end;

        System.out.println("Thread2 started");
        synchronized (this) {
            start = System.currentTimeMillis();
            wait();
            end = System.currentTimeMillis();
            flag = false;
            System.out.printf("Thread2 set the Flag to %s %n", flag);
            System.out.printf("Wasted Time is %s seconds", (double)(end - start)/1000);
        }
    }
}

