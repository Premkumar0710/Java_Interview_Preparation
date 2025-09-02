package JavaFundamentals.MultiThreading.SynchronizedAndAtomic;

public class Counter {

    private int count;
    // private AtomicInteger count = new AtomicInteger(0);

   public synchronized void increment(){
       count++;
       // count.incrementAndGet();   atomic operation
   }

    public int getCount() {
        return count;
    }


}
