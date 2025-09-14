// Advanced: Multithreading Example
public class CounterThread extends Thread {
    private int count;

    public CounterThread(int count) {
        this.count = count;
    }

    public void run() {
        for (int i = 1; i <= count; i++) {
            System.out.println(getName() + ": " + i);
        }
    }

    public static void main(String[] args) {
        CounterThread t1 = new CounterThread(5);
        CounterThread t2 = new CounterThread(5);
        t1.start();
        t2.start();
    }
}
