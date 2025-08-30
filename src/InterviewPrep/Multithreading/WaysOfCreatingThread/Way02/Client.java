package InterviewPrep.Multithreading.WaysOfCreatingThread.Way02;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {

    public static void main(String[] args) {
        // Using normal method
        MyThread myThread = new MyThread();
        myThread.run();

        // Using executor service
        ExecutorService e = Executors.newCachedThreadPool();
        e.submit(myThread);
        e.shutdown();
    }
}
