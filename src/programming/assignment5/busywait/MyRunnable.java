/*
Bardillon, Romeo Jr, M.
BSIT 2-2
MyRunnable.java
 */
package programming.assignment5.busywait;


public class MyRunnable implements Runnable {

    @Override
    public void run() {
        new BusyWait();
        long start;
        long end;

        System.out.println("Thread2 started");
        start = System.currentTimeMillis();
        while (!BusyWait.isFlag()) {
            System.out.print("");
            if (BusyWait.isFlag()) {
                BusyWait.setFlag(false);
                System.out.printf("Thread2 set the Flag back to %s %n", false);
                break;
            }
        }
        end = System.currentTimeMillis();
        System.out.printf("Wasted Time is %s seconds", (double)(end - start)/1000);
    }
}
