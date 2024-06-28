package sesiunea10.OOPintro.ex5;

public class Main {
    public static void main(String[] args) {

        BankAccount bankAccount1= new BankAccount(500, "Ron", 200);
        BankAccount bankAccount2=new BankAccount(800,"Euro",300);
        bankAccount1.withdraw(50);
        bankAccount2.withdraw(100);
        System.out.println(bankAccount1.balance);
        System.out.println(bankAccount2.balance);
        bankAccount1.depositMoney(100);
        bankAccount2.depositMoney(300);
        System.out.println(bankAccount1.balance);
        System.out.println(bankAccount2.balance);
        bankAccount1.displayBalance();
        bankAccount2.displayBalance();
        bankAccount1.displayWithDrawLimit();
        bankAccount2.displayWithDrawLimit();
    }
}
