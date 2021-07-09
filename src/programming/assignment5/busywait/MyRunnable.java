package programming.assignment5.busywait;

public class MyRunnable implements Runnable {
    boolean flag;

    public MyRunnable(boolean flag){
        this.flag = flag;
    }

    @Override
    public void run() {
        System.out.println("Thread2 is running");
        while (isFlag()){
            setFlag(false);
            System.out.printf("Thread2 set the flag to %s %n", isFlag());
        }
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
