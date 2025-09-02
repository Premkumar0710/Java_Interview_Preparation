package JavaFundamentals.MultiThreading.WaysOfCreatingThreads.Way03;

import JavaFundamentals.MultiThreading.WaysOfCreatingThreads.Way02.NumberPrinter;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(10);

        for(int i=1;i<=100;i++){
            NumbPrint n = new NumbPrint(i);
            executorService.submit(n);
        }

        executorService.shutdown();
    }
}
