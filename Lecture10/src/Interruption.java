public class Interruption {
    public static void main(String[] args) {
        SimpleThread t = new SimpleThread();

        t.run();
        t.interrupt();
    }
}

class SimpleThread extends Thread {
    @Override
    public void run() {
        int i = 0;

        while (true) {
            System.out.println(i++);
        }
    }
}
