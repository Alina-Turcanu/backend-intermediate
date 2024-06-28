package colections.exercitii.ex8companymanagement;

import java.util.ArrayList;
import java.util.List;

import static colections.exercitii.ex8companymanagement.Company.sortEmployeesByCountry;
import static colections.exercitii.ex8companymanagement.Company.sortEmployeesByName;

public class Main {

    public static void main(String[] args) {
        //8. Gestiunea angajatilor din companie
        //O companie multinationala are o lista de angajati,
        // iar fiecare angajat este caracterizat de: varsta, tara, nume.


        //clasa company care are ca atribut list<Employee>
        //clasa employee care are ca atribute varsta, tara, nume
        //
        //Scrie urmatoarele metode in clasa company:
        //
        //O metoda care returneaza angajatii care au peste 50 de ani, din companie
        //O metoda care returneaza o lista cu angajatii din Romania
        //O metoda care sorteaza angajatii dupa tara
        //O metoda care sorteaza angajatii dupa nume
        //O metoda care returneaza o mapa, in care cheia este tara si valoarea este numarul de angajati din acea tara
        //O metoda care returneaza o mapa, in care cheia este tara si valoarea o lista cu toti angajatii din acea tara
        Employee employee1 = new Employee("Alina", 30, "Romania");
        Employee employee2 = new Employee("Mirabela", 56, "Olanda");
        Employee employee3 = new Employee("Ion", 61, "Olanda");
        Employee employee4 = new Employee("Mircea", 35, "Norvegia");
        Employee employee5 = new Employee("Laura", 55, "Romania");
        List<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);
       // System.out.println(employee4.getAge());

        employee4.setAge(55);
        System.out.println(employee2.getAge());
        System.out.println("Angajati asezati alfabetic in funtie de tara si numar " + Company.countEmployeesByCountry(employees).toString());
        System.out.println("Angajatii din Romania " + Company.getEmployeesFromRomania(employees).toString());
        System.out.println("Angajatii trecuti de 50 ani " + Company.getOlderEmployees(employees).toString());
        System.out.println("Angajatii grupati in functie de tara " + Company.groupEmployeesByCountry(employees).toString());
        sortEmployeesByCountry(employees);
        System.out.println("Angajati sortati dupa tara: ");
        for (Employee employee : employees) {
            System.out.println(employee.getName() + ", Tara: " + employee.getCountry() + ", Varsta: " + employee.getAge());
        }
        sortEmployeesByName(employees);
        System.out.println("Angajati sortati dupa nume: ");
        for (Employee employee : employees) {

            System.out.println(employee.getName() + ",Tara: " + employee.getCountry() + ",Varsta: " + employee.getAge());
        }
    }
}
