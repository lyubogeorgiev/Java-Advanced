package L03BankAccount;

public class BankAccount {
    private static int counter = 0;
    private final int id;
    private double balance;
    private static double DEFAULT_INTEREST_RATE = 0.02;

    public BankAccount(){
        this.balance = 0;
        this.id = ++counter;
    }

    public static void setInterestRate(double interestRate) {
        BankAccount.DEFAULT_INTEREST_RATE = interestRate;
    }

    public double getInterest(int years){
        return BankAccount.DEFAULT_INTEREST_RATE * this.balance * years;
    }

    public void deposit(double amount){
        this.balance += amount;
    }
}