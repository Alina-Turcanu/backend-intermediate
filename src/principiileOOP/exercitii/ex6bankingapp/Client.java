package exercitii.ex6bankingapp;

import exercitii.ex3animalshelter.Animal;

public class Client {

    private String firstName;
    private String lastName;

    private BankAccount[] accounts;

    private int numberOfAccounts;

    public Client(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accounts = new BankAccount[100];
    }

    public boolean addAccount(BankAccount account){

            this.accounts[numberOfAccounts] = account;
            this.numberOfAccounts++;
            return true;

    }

    public void listAccounts(){
        for (int i = 0; i < numberOfAccounts; i++) {
            System.out.println(accounts[i].toString());
        }
    }



    public void deposit (int amount, String accountNumber) throws OperationNotSupportedException{
        //caut contul cu numarul accountNumber in lista de conturi a clientului this
        //depun amount bani in acel cont (apelez deposit pe contul gasit)

        /*BankAccount foundAccount = getAccountByAccountNumber(accountNumber);
        if (foundAccount == null){
            System.out.println("nu pot sa depun banni daca nu ai cont. Esti nebun?");

        } else {
            foundAccount.deposit(amount);
        }*/

    }

    public void checkAccountDetails(String accountNumber){

    }




}
