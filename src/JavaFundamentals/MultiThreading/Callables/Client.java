package JavaFundamentals.MultiThreading.Callables;

import java.util.concurrent.*;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        int start , end;

        Callable<Integer> task1 = new SumPrinter(1,50);
        Callable<Integer> task2 = new SumPrinter(51,100);

        Future<Integer> getTask1 = executorService.submit(task1);
        Future<Integer> getTask2 = executorService.submit(task2);

        // No matter what if we use sout in main method ; it will be printed by main thread only ; so use sout in sumprinter class
        System.out.println(getTask1.get() + " from " + Thread.currentThread().getName());
        System.out.println(getTask2.get() + " from " + Thread.currentThread().getName());

        executorService.shutdown();

    }
}
