package InterviewPrep.Multithreading.WaysOfCreatingThread.BankAccountProblem.UsingSynchronized;

public class Client {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();
        Thread t1 = new Thread(()-> bankAccount.withdraw(9000.0));
        Thread t2 = new Thread(()-> bankAccount.withdraw(7000.0));

        t1.start();
        t2.start();

    }


}
