package demo.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SmartHome {

    public static void main(String[] args) {
        File file = new File("/sensor_data.csv");

        SensorEntryData[] sensorEntreies = new SensorEntryData[700];

        try {
            Scanner scanner = new Scanner(file);
            //citim cu scanner cate o linie din fisier
            //facem un obiec cu valorile citite din acea linie
            ///il adaugam in array

        } catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }

        /*User[] users = new User[10];
        users[0]=new User("Ionut");
        printUsers(users);*/
    }

    public static void printUsers(User[] users){
        for (int i = 0; i < users.length; i++) {
            System.out.println(users[i].getName());
        }
    }
}
