package exercitii.ex7paymentsapp;

public class ShoppingAccount {

    private String name;

    private Address[] addresses;

    private int numberOfAddresses;

    private Card[] cards;

    private int numberOfCards;

    private Card currentCard;

    private Address currentAddress;

    public ShoppingAccount(String name) {
        this.name = name;
        this.addresses = new Address[10];
        this.cards = new Card[10];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address[] getAddresses() {
        return addresses;
    }

    public void setAddresses(Address[] addresses) {
        this.addresses = addresses;
    }

    public int getNumberOfAddresses() {
        return numberOfAddresses;
    }

    public void setNumberOfAddresses(int numberOfAddresses) {
        this.numberOfAddresses = numberOfAddresses;
    }

    public Card[] getCards() {
        return cards;
    }

    public void setCards(Card[] cards) {
        this.cards = cards;
    }

    public int getNumberOfCards() {
        return numberOfCards;
    }

    public void setNumberOfCards(int numberOfCards) {
        this.numberOfCards = numberOfCards;
    }

    public Card getCurrentCard() {
        return currentCard;
    }

    public void setCurrentCard(Card currentCard) {
        this.currentCard = currentCard;
    }

    public Address getCurrentAddress() {
        return currentAddress;
    }

    public void setCurrentAddress(Address currentAddress) {
        this.currentAddress = currentAddress;
    }

    public void addPaymentMethod(Card card){
        cards[numberOfCards]= card;
        numberOfCards++;
    }

    public void addAddress(Address address){
        addresses[numberOfAddresses]=address;
        numberOfAddresses++;
    }

    public void removePaymentMethod(String cardNumber){

    }

    public void removeAddress(String street){

    }

    public void selectPaymentMethod(String cardNumber){

    }

    public void selectCurrentAddress(String street){

    }

    public void changeCardPin(String cardNumber, int newPin){
        int cardPosition = findCardIndexByCardNuber(cardNumber);
        cards[cardPosition].changePin(newPin);
    }

    public int findCardIndexByCardNuber(String cardNumber){
        return 0;
    }



}
