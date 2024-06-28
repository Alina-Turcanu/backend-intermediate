package exercitii.ex7paymentsapp;

public class Main {

    //7.Creează o aplicație de plăți
    //In aceasta aplicatie voi putea stoca mai multe carduri personale si voi putea plati cu cel pe care il aleg. Construieste desing-ul si functionalitatile astfel:
    //
    //Interfața Payable
    //Metode:
    //
    //pay(double amount) - care primește ca parametru o valoare de tip double (suma plătită)
    //Clasa Card
    //Atribute:
    //
    //isActive
    //PIN
    //cardNumber
    //cardHolderName
    //cardBalance Metode:
    //changePin() - schimbă valoarea PIN-ului, dar doar dacă aceasta este o valoare formată din 4 cifre
    //freezeCard() - face ca cardul să fie inactiv
    //Clasa DebitCard, care va extinde Card și va implementa interfața Payable
    //Atribute:
    //
    //maxTransactionAmount Metode:
    //pay() - nu se va putea plăti mai mult decât maxTransactionAmount
    //changeTransactionLimit() - va da o nouă valoare atributului maxTransactionAmount
    //Clasa CreditCard, care va extinde Card și va implementa interfața Payable
    //Atribute:
    //
    //maxOverDraft - nu se va putea schimba valoarea acestui atribut Metode:
    //pay() - nu se va putea plăti mai mult decât cardBalance + maxOverDraft
    //Clasa Address
    //Atribute:
    //
    //street
    //number
    //city Metode: doar getteri și setteri
    //Clasa ShoppingAccount
    //Atribute:
    //
    //cardList - o listă de carduri
    //addressList - o listă de adrese
    //firstName
    //lastName
    //currentPaymentMethod - poate fi de fapt un CreditCard sau un DebitCard
    //currentBillingAddress Metode:
    //addPaymentMethod()
    //addAddress()
    //removePaymentMethod()
    //removeAddress()
    //selectPaymentMethod(String cardNumber) - setează currentPaymentMethod în funcție de numărul de card primit ca și parametru
    //selectAddress(String street) - setează currentBillingAddress în funcție de strada primită ca și parametru
    //generateInvoice(amount, address, card) - se va printa un mesaj în funcție de suma, cardul și adresa cu care a fost făcută tranzacția (de exemplu: “Nume: Olimpiu Stefan. Ați plătit suma 2300 RON folosind cardul cu numărul 1234 1234 1234 1234 pentru adresa: str. Republicii, nr. 12, Cluj-Napoca”)
    //Clasa Shop
    //Clasa Shop va avea o metodă main unde vor fi testate funcționalitățile implementate (se va crea un shopping account, se vor adăuga adrese și modalități de plată în el, se va selecta o adresă, se va selecta o modalitate de plată, se va plăti o anumită sumă de bani folosind metoda de plată selectată și apoi se va genera o factură)

    public static void main(String[] args) {
        ShoppingAccount account = new ShoppingAccount("Ionut");
        account.addAddress(new Address("Cluj","12","Republicii"));
        account.addAddress(new Address("Bucuresti","25","Primaverii"));
        account.addPaymentMethod(new DebitCard(1234,"414032425",4000));
        account.addPaymentMethod(new CreditCard(1234,"414032426",10000));
        account.selectPaymentMethod("414032425");
        account.selectCurrentAddress("Republicii");
        account.changeCardPin("414032425",3456);


        account.getCards()[0].changePin(2345);
        System.out.println(account.getCards()[0].getPin());



    }


}
