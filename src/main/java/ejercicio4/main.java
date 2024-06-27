package ejercicio4;

public class main {
    public static void main(String[] args) {
        try {
            BankAccount bankAccount = new BankAccount(100);
            bankAccount.deposit(50);
            System.out.println("Balance after deposit: " + bankAccount.getBalance());

            bankAccount.withDraw(30);
            System.out.println("Balance after withdraw: " + bankAccount.getBalance());

            //Intentar retirar mas de lo que hay en el balance
            bankAccount.withDraw(150);
        }catch (NegativeBalanceException e){
            System.out.println(e.getMessage());
        }

        //Intentar crear una cuenta con saldo negativo
        try {
            BankAccount bankAccount2 = new BankAccount(-10);

        }catch (NegativeBalanceException e){
            System.out.println("Account cannot initialize with negative balance");
        }
    }
}
