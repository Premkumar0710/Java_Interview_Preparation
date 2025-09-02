package JavaFundamentals.MultiThreading.SynchronizedAndAtomic;

public class CounterTask implements Runnable{
    private Counter counter;

    public CounterTask(Counter counter){
        this.counter = counter;
    }
    @Override
    public void run() {
        for(int i=1;i<=1000;i++){
            counter.increment();
        }
    }
}
