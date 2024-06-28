package exercitii.ex7paymentsapp;

public class DebitCard extends Card {

    private int maxTransactionAmount;

    public DebitCard(int pin, String cardNumber, int maxTransactionAmount) {
        super(pin, cardNumber);
        this.maxTransactionAmount = maxTransactionAmount;
    }

    public int getMaxTransactionAmount() {
        return maxTransactionAmount;
    }

    public void setMaxTransactionAmount(int maxTransactionAmount) {
        this.maxTransactionAmount = maxTransactionAmount;
    }

    @Override
    public void pay(int amount) {

    }
}
