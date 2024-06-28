package sesiunea10.OOPintro.ex5;

public class BankAccount {
    //5. Creeaza un program care sa simuleze un cont bancar
    //Clasa BankAccount va avea urmatoarele atribute:
    //
    //sold curent
    //moneda contului
    //limita maxima de retragere din cont
    //Clasa BankAccount va avea urmatoarele functionalitati:
    //
    //retragerea unei anumite sume de bani (daca nu se depaseste limita maxima de retragere si daca exista suficienti bani)
    //depunerea unei anumite sume de bani
    //afisarea unui extras de cont cu situatia actuala a contului
    //afisarea limitei maxime de retragere din cont
    //Creeaza mai multe conturi bancare in Main si apeleaza-le comportamentele.


    int balance;
    String currency;
    int withdrawLimit;

    public BankAccount(int balance, String currency, int withdrawLimit) {
        this.balance = balance;
        this.currency = currency;
        this.withdrawLimit = withdrawLimit;
    }

    public void withdraw(int amount) {
        if (amount > this.balance || amount > this.withdrawLimit) {
            System.out.println("nu poti retrage");
        }
        this.balance -= amount;
    }

    public void depositMoney(int amount) {
        this.balance += amount;
    }

    public void displayBalance() {
        System.out.println("Soldul curent al contului este: " + balance);
    }

    public void displayWithDrawLimit(){
        System.out.println("Limita de retragere este:"+ withdrawLimit);
    }
}
