/*
Bardillon, Romeo Jr, M.
BSIT 2-2
MyRunnable.java
 */
package programming.assignment5.threads;

import java.util.ArrayList;

public class MyRunnable implements Runnable{
    ArrayList<Integer> numbers = new ArrayList<>();
    @Override
    public void run() {
        int randomNumber = 1 + (int) (Math.random() * 10);
        System.out.println(randomNumber);
        numbers.add(randomNumber);
    }
}
