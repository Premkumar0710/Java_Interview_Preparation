package InterviewPrep.Multithreading.WaysOfCreatingThread.Way01;

public class MyThread extends Thread {
    public MyThread(){

    }

    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
}
