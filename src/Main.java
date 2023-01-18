public class Main {
    public static void main (String[] arg) throws InterruptedException {
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();
        Thread t = new Thread(new MyRunnable(counter1));
        Thread t2 = new Thread(new MyRunnable(counter2));
        t.start();
        t2.start();
        t.join();
        t2.join();

        int counter = counter1.value() + counter2.value();
        System.out.println("Final value: " + counter);
    }
}