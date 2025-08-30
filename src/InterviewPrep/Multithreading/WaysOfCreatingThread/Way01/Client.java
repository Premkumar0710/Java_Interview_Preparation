package InterviewPrep.Multithreading.WaysOfCreatingThread.Way01;

public class Client {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }

}
