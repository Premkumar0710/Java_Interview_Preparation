package JavaFundamentals.MultiThreading.SynchronizedAndAtomic;

public class Client {
    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();
        CounterTask counterTask = new CounterTask(counter);

        Thread t1 = new Thread(counterTask);
        Thread t2 = new Thread(counterTask);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("final count : " + counter.getCount());

    }
}
