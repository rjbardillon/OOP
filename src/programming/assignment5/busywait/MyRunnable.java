package programming.assignment5.busywait;

public class MyRunnable implements Runnable{
    boolean flag;
    @Override
    public void run() {
        try {
            Thread.sleep(5000);
            setFlag(true);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
