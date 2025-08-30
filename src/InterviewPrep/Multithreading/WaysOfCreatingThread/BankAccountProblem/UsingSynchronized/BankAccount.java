package InterviewPrep.Multithreading.WaysOfCreatingThread.BankAccountProblem.UsingSynchronized;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {

  //  Lock lock = new ReentrantLock();

    double totalMoney = 10000.0;
    Double balance;

    public synchronized void withdraw(double requestedMoney){
        if(requestedMoney<=totalMoney){
         //   lock.lock();
            balance = totalMoney-requestedMoney;
            System.out.println(balance);
         //   lock.unlock();
        } else System.out.println("Invalid request");
    }


}
