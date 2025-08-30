package InterviewPrep.Multithreading.WaysOfCreatingThread.Way02;

public class MyThread implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
