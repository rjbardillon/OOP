package programming.assignment5.busywait;

public class BusyWait {
    public static void main(String[] args){
        MyRunnable myRunnable = new MyRunnable();
        Thread[] threads = new Thread[2];
        threads[0] = new Thread(myRunnable);
        threads[1] = new Thread(myRunnable);

        threads[0].start();
        }
}
