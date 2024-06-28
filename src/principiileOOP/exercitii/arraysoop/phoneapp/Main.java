package exercitii.arraysoop.phoneapp;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Phone phone = new Phone("12",new ArrayList<>());
        try {
            phone.addNewContact(new Contact("Ionut", "23"));
            phone.addNewContact(new Contact("sdfdfg", "23"));
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
