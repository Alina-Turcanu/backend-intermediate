package exercitii.ex7paymentsapp;

public abstract class Card {


    private boolean isActive;
    private int pin;
    private String cardNumber;
    private int balance;

    public Card(int pin, String cardNumber) {
        this.isActive = true;
        this.pin = pin;
        this.cardNumber = cardNumber;
        this.balance = 0;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public void freezeCard(){
        this.isActive = false;
    }

    public int getPin() {
        return pin;
    }

    public void changePin(int pin) {
        //TODO de implementat algoritmul
        if (String.valueOf(pin).length() != 4){
            System.out.println("Nu e bine ce faci. Da-ti tu seama de ce");
            return;
        }
        this.pin = pin;

    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }


    public abstract void pay(int amount);

    @Override
    public String toString() {
        return "Card{" +
                "isActive=" + isActive +
                ", pin=" + pin +
                ", cardNumber='" + cardNumber + '\'' +
                ", balance=" + balance +
                '}';
    }
}
