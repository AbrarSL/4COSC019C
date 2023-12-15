import java.util.concurrent.FutureTask;
public class Main {
    public static void main(String[] args) throws Exception {
        MyThread t = new MyThread("Thread 1 running!");
        Thread t1 = new Thread(t);

        t1.start();
        Thread.sleep(1000);
        t.suspend();
        Thread.sleep(1000);
        t.resume();
        Thread.sleep(1000);
        t.suspend();
        Thread.sleep(1000);
        t.resume();
        Thread.sleep(1000);

        t.stop();
    }
}

class MyThread implements Runnable {

    private final String output;
    private boolean stop;
    private boolean suspend;

    public MyThread(String output) {
        this.output = output;
        this.stop = false;
        this.suspend = false;
    }

    public void run() {
        System.out.println("Thread start!");

        try {
            for (int i = 0; i < 1000; i++) {
                System.out.println(i);
                Thread.sleep(500);

                synchronized(this) {
                    while (suspend)
                        wait();
                }

                if (stop)
                    break;
            }
        } catch (InterruptedException exception) {
            System.out.println("Thread interrupted!");
        }

        System.out.println("Exiting thread!");
    }

    public synchronized void stop() {
        this.stop = true;
        this.suspend = false;
        notify();
    }

    public synchronized void suspend() {
        this.suspend = true;
    }

    public synchronized void resume() {
        this.suspend = false;
        notify();
    }
}