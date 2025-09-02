package JavaFundamentals.MultiThreading.WaysOfCreatingThreads.Way01;

public class Client {
    public static void main(String[] args) {

        // uses same thread (thread-0) to print 1-100
//        NumberPrinter numberPrinter = new NumberPrinter();
//        numberPrinter.start();

        // uses multiple threads to print 1-100
        for(int i=1;i<=100;i++){
            NumberPrinter np = new NumberPrinter(i); // here i is the number passed & this object will invoke new thread as well since Number printer extends threads
            np.start();
        }

    }
}
