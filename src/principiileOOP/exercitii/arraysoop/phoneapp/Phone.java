package exercitii.arraysoop.phoneapp;

import java.util.ArrayList;

public class Phone {

    private String myNumber;

    private ArrayList<Contact> contacts;

    public Phone(String myNumber, ArrayList<Contact> contacts) {
        this.myNumber = myNumber;
        this.contacts = contacts;
       }

    public void addNewContact (Contact contact) throws Exception{
        if (contacts.contains(contact)){
            throw new Exception("contact already exists");
        }
        contacts.add(contact);
    }

    public void removeContact (Contact contact){
        //int contactPosition = contacts.indexOf(contact);
        //contacts.remove(contactPosition);
        contacts.remove(contact);
    }


    public Contact queryContact (String name){
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getName().equals(name)){
                return contacts.get(i);
            }
        }
        return null;
    }


}
