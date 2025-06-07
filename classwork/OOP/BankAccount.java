public class BankAccount {
    private int accountNumber;
    private double balance;

    public void setAccountNumber(int accountNumber){
        this.accountNumber=accountNumber;
    }
    public int getAccountNumber(){
        return this.accountNumber;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
    public double getBalance(){
        return this.balance;
    }

}
class SavingsAccount extends BankAccount{
    private int rate;
    private int time;
    public SavingsAccount(int accountNumber, double balance){
    }
}