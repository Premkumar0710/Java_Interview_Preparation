package JavaFundamentals.MultiThreading.WaysOfCreatingThreads.Way02;

import JavaFundamentals.MultiThreading.WaysOfCreatingThreads.Way01.NumberPrinter;

public class Client {
    public static void main(String[] args) {
        for(int i=1;i<=100;i++){
            Runnable task = new NumberPrinter(i);
            Thread thread = new Thread(task);
            thread.start();
        }
    }
}
