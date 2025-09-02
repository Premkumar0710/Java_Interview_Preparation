package JavaFundamentals.MultiThreading.Runnable;

public class OddPrinter implements Runnable{

    int limit;

    public OddPrinter(int limit){
        this.limit = limit;
    }

    @Override
    public void run() {
        for(int i=1; i<=limit; i+=2){
            System.out.println("Number is " + i + " from thread : " + Thread.currentThread().getName());
        }
    }
}
