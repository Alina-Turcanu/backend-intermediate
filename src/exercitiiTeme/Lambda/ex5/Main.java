package exercitiiTeme.Lambda.ex5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    //Sterge persoanele care nu pot vota
    //Avand o lista de persoane, sterge din lista persoanele care au varsta mai mica decat 18 ani, folosind expresii lambda.
    public static void main(String[] args) {
        Person person1=new Person("Irina",18);
        Person person2=new Person("Maria",16);
        Person person3=new Person("Florina",20);
        Person person4=new Person("George",17);
        Person person5=new Person("Ana",23);
        Person person6=new Person("David",14);
        List<Person>listOfPersons=new ArrayList<>();
        listOfPersons.add(person1);
        listOfPersons.add(person2);
        listOfPersons.add(person3);
        listOfPersons.add(person4);
        listOfPersons.add(person5);
        listOfPersons.add(person6);

        List<String>newList=listOfPersons.stream()
                .filter(person->person.getAge()>18)
                .map(person->person.getName())
                .collect(Collectors.toList());
        System.out.println(newList);

    }
}
