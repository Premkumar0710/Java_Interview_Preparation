package JavaFundamentals.MultiThreading.WaysOfCreatingThreads.Way02;

public class NumberPrinter implements Runnable{

    private int number;
    public NumberPrinter(int number){
        this.number = number;
    }
    @Override
    public void run() {
            System.out.println("Printed value is " + number + " from Thread : " + Thread.currentThread().getName());
    }
}
