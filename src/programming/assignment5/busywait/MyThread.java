package programming.assignment5.busywait;

public class MyThread extends Thread{
    boolean flag;

    public MyThread(boolean flag){
        this.flag = flag;
    }

    @Override
    public synchronized void run() {
        try {
            System.out.printf("Flag is initially set to %s %n", isFlag());
            Thread.sleep(3000);
            setFlag(true);
            System.out.printf("Flag is set to %s %n", isFlag());
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

}
