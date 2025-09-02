package JavaFundamentals.MultiThreading.WaysOfCreatingThreads.Way03;

public class NumbPrint implements Runnable{

    private int num;

    public NumbPrint(int num){
        this.num = num;
    }
    @Override
    public void run() {
        System.out.println("Printed value is " + num + " from Thread : " + Thread.currentThread().getName());
    }
}
