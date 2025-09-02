package JavaFundamentals.MultiThreading.WaysOfCreatingThreads.Way01;

public class NumberPrinter extends Thread {
    int number;

    public NumberPrinter(int number) {
        this.number = number;
    }
    @Override
    public void run() {
        System.out.println("Printed value is " + number + " from Thread : " + Thread.currentThread().getName());
    }

}
