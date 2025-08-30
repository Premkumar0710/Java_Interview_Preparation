package InterviewPrep.Multithreading.WaysOfCreatingThread.Way03;

import InterviewPrep.Multithreading.WaysOfCreatingThread.Way01.MyThread;

import java.util.concurrent.*;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyThread myThread = new MyThread();
        ExecutorService e = Executors.newCachedThreadPool();
        Future<String> res = (Future<String>) e.submit(myThread);
        System.out.println(res.get());
        e.shutdown();

    }
}
