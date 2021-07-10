/*
Bardillon, Romeo Jr, M.
BSIT 2-2
BusyWait.java
 */
package programming.assignment5.busywait;

public class BusyWait {
    static boolean flag;

    public static void main(String[] args) throws InterruptedException {
        MyThread thread1 = new MyThread();
        MyRunnable myRunnable = new MyRunnable();
        Thread thread2 = new Thread(myRunnable);

        System.out.printf("Flag is initially set to %s %n", isFlag());

        thread1.start();
        thread2.start();

    }

    public static boolean isFlag() {
        return flag;
    }

    public static void setFlag(boolean flag) {
        BusyWait.flag = flag;
    }

}
