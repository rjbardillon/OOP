package programming.assignment5.busywait;

public class BusyWait {
    public static void main(String[] args) {
        boolean flag = false;
        MyThread thread1 = new MyThread(flag);
        MyRunnable myRunnable = new MyRunnable(flag);
        Thread thread2 = new Thread(myRunnable, "name");

        thread1.start();
        thread2.start();

    }
}
