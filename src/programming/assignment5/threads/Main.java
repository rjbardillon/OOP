/*
Bardillon, Romeo Jr, M.
BSIT 2-2
Main.java
 */
package programming.assignment5.threads;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int sum = 0;
        MyRunnable myRunnable = new MyRunnable();
        Thread[] threads = new Thread[5];
        threads[0] = new Thread(myRunnable);
        threads[1] = new Thread(myRunnable);
        threads[2] = new Thread(myRunnable);
        threads[3] = new Thread(myRunnable);
        threads[4] = new Thread(myRunnable);

        for (Thread thread : threads) {
            thread.start();
            thread.join();
        }
        for (int number: myRunnable.numbers){
            sum += number;
        }
        System.out.printf("Sum is %s%n", sum);
    }
}
