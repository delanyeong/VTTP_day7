package vttp2022.day07;

//implement runnable interface
public class ThrMain implements Runnable {
    private final String msg;
    private final int sec;

    public ThrMain(String msg, int sec) {
        this.msg = msg;
        this.sec = sec;

    }

    @Override
    public void run() {
        System.out.printf(">>> Start %s\n ", msg);
        try {
            Thread.sleep (sec*1000);
        } catch (InterruptedException e) {
            System.out.printf("<<< End %s\n,%s\n", msg, sec);
        }
    }
}
