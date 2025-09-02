package JavaFundamentals.MultiThreading.Runnable;

public class EvenPrinter implements Runnable{

    int limit;

    public EvenPrinter(int limit){
        this.limit = limit;
    }

    @Override
    public void run() {
        for(int i=0; i<=limit; i+=2){
            System.out.println("Number is " + i + " from thread : " + Thread.currentThread().getName());
        }
    }
}
