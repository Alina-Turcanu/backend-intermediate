package temeColectii.ex1;

import java.util.ArrayList;

public class Main {
    //1. Implementeaza un PhoneBook
    //Atribute:
    //contacts: o lista de String-uri reprezentand numere de telefon
    //blackList: o lista de String-uri reprezentand numere de telefon blocate
    //Metode:
    //filterContacts()
    //Metoda statica
    //Acceptă ca și parametri:
    //o lista de contacte valide
    //o lista de contacte blocate
    //Trebuie să șteargă din lista de contacte valide toate numerele care se regăsesc în lista de contacte blocate
    //Returnează lista de contacte valide modificată
    //addToBlackList()
    //Metoda non-statică
    //Adaugă numărul primit ca parametru în lista de numere blocate și îl șterge din lista de contacte
    //removeFromBlackList()
    //Metoda non-statică
    //Adaugă numărul primit ca parametru în lista de numere și îl șterge din lista de numere blocate
    public static void main(String[] args) {


        PhoneBook phoneBook = new PhoneBook();

        phoneBook.getContacts().add("072485956");
        phoneBook.getContacts().add("098766556");
        phoneBook.getContacts().add("098765999");


        phoneBook.getBlackList().add("072485956");

        ArrayList<String> filteredContacts = PhoneBook.filterContacts(phoneBook.getContacts(), phoneBook.getBlackList());
        System.out.println("Filtered Contacts: " + filteredContacts);

        phoneBook.addToBlackList("098766556");

        System.out.println("Contacts after adding to blacklist: " + phoneBook.getContacts());
        System.out.println("Blacklist after adding to blacklist: " + phoneBook.getBlackList());

        phoneBook.removeFromBlackList("072485956");

        System.out.println("Contacts after removing from blacklist: " + phoneBook.getContacts());
        System.out.println("Blacklist after removing from blacklist: " + phoneBook.getBlackList());
    }
}