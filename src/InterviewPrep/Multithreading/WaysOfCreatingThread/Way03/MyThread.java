package InterviewPrep.Multithreading.WaysOfCreatingThread.Way03;

import java.util.concurrent.Callable;

public class MyThread implements Callable {
    @Override
    public Object call() throws Exception {
        return "Hello all from Callable" + Thread.currentThread().getName();
    }
}
