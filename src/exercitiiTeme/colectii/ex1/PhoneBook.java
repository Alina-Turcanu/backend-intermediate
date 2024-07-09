package exercitiiTeme.colectii.ex1;

import java.util.ArrayList;

public class PhoneBook {
    private ArrayList<String> contacts;
    private ArrayList<String> blackList;

    public PhoneBook() {
        this.contacts = new ArrayList<>();
        this.blackList = new ArrayList<>();
    }

    public static ArrayList<String> filterContacts(ArrayList<String> contacts, ArrayList<String> blackList) {
        for (int i = 0; i < contacts.size(); i++) {
            for (int j = 0; j < blackList.size(); j++) {
                if (contacts.get(i).equals(blackList.get(j))) {
                    contacts.remove(i);
                    i--;
                    break;
                }
            }
        }
        return contacts;
    }

    public void addToBlackList (String phoneNumber) {
        for (int i = 0; i < contacts.size(); i++) {
            if (!blackList.contains(phoneNumber)) {
                blackList.add(phoneNumber);
            }
            contacts.remove(phoneNumber);
        }
    }

    public void removeFromBlackList(String phoneNumber){
        if(blackList.contains(phoneNumber)){
            blackList.remove(phoneNumber);
        }
        if(!contacts.contains(phoneNumber)){
            contacts.add(phoneNumber);
        }
    }


    public ArrayList<String> getContacts() {
        return contacts;
    }

    public ArrayList<String> getBlackList() {
        return blackList;
    }
}
