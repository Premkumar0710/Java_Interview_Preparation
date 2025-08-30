package InterviewPrep.LearnJavaByImplementing.ExceptionHandling;

public class Client {
    public static void validateWithdrawal(double balance, double amount) throws InsufficientFundsException{
        if(amount > balance){
            throw new InsufficientFundsException("Balance is too low");
        }
    }
    public static void processWithdrawal(double balance, double amount) throws InsufficientFundsException{
        validateWithdrawal(balance,amount);
    }

    public static void main(String[] args){

        try {
            processWithdrawal(10,20);
            System.out.println("Transaction successfull");
        } catch (InsufficientFundsException e) {
            System.out.print("Trsansaction failed :" + e.getMessage());
        }

    }
}
