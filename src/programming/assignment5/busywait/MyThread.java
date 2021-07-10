/*
Bardillon, Romeo Jr, M.
BSIT 2-2
MyThread.java
 */
package programming.assignment5.busywait;

public class MyThread extends Thread {

    @Override
    public void run() {
        try {
            new BusyWait();
            System.out.println("Thread1 started");
            Thread.sleep(5000);
            BusyWait.setFlag(true);
            System.out.printf("Thread1 set the Flag to %s %n", BusyWait.isFlag());
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
