package exercitii.ex6bankingapp;

public class SpendingAccount extends BankAccount {

    private int maxWithdrawalAmount;

    public SpendingAccount(String accountNumber, int maxWithdrawalAmount) {
        super(accountNumber);
        this.maxWithdrawalAmount = maxWithdrawalAmount;
    }

    public int getMaxWithdrawalAmount() {
        return maxWithdrawalAmount;
    }

    public void setMaxWithdrawalAmount(int maxWithdrawalAmount) {
        this.maxWithdrawalAmount = maxWithdrawalAmount;
    }

    @Override
    public void withdraw(int amount) {
        if (amount > getBalance() + maxWithdrawalAmount){
            System.out.println("te intreci prea mult cu gluma");
        } else {
            setBalance(getBalance() - amount);
        }
    }

    @Override
    public void deposit(int amount) {
        setBalance(getBalance()+amount);
    }


    @Override
    public String toString() {
        return "SpendingAccount{" +
                "maxWithdrawalAmount=" + maxWithdrawalAmount +
                "balance=" + getBalance() +
                "acccount number=" + getAccountNumber() +
                '}';
    }
}
