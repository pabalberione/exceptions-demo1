package ejercicio4;

public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) throws NegativeBalanceException{
        if(initialBalance < 0){
            throw new NegativeBalanceException("Initial balance cannot be negative");
        }
        this.balance = initialBalance;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withDraw(double amount) throws NegativeBalanceException{
        if(balance - amount < 0){
            throw new NegativeBalanceException("Insuficient funds for withdraw");
        }
        balance -= amount;
    }

    public double getBalance(){
        return balance;
    }
}
