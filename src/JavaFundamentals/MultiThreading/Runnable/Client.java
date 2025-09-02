package JavaFundamentals.MultiThreading.Runnable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {

    public static void main(String[] args) {
        int limit = 20;

        Runnable oddTask = new OddPrinter(limit);
        Runnable evenTask = new EvenPrinter(limit);

        Thread t1 = new Thread(oddTask);
        Thread t2 = new Thread(evenTask);

        t1.start();
        t2.start();

        /* using executor
        ExecutorService es = Executors.newFixedThreadPool(2);
        int limit = 20;

        Runnable oddTask = new OddPrinter(limit);
        Runnable evenTask = new EvenPrinter(limit);

        es.submit(oddTask);
        es.submit(evenTask);

        es.shutdown();

         */
    }
}
