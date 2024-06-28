package colections.exercitii.ex8companymanagement;

import java.util.*;

public class Company {
    public static List<Employee> employeeList;

    public Company(List<Employee> employeeList) {
    }


    //O metoda care returneaza angajatii care au peste 50 de ani, din companie

    public static List<Employee> getOlderEmployees(List<Employee> employeeList) {
        //creeam o lista noua pentru angajatii care depasesc varsta de 50 ani;
        //pentru fiecare angajat din lista de angajati verificam daca varsta este mai mare de 50;
        List<Employee> olderEmployees = new ArrayList<>();
        for (Employee employee : employeeList) {
            //daca vasrta este mai mare de 50 ,adaugam angajatul la noua lista creata;
            if (employee.getAge() > 50) {
                olderEmployees.add(employee);
            }
        }
        return olderEmployees;
    }


    //O metoda care returneaza o lista cu angajatii din Romania

    public static List<Employee> getEmployeesFromRomania(List<Employee> employeeList) {
        //creeam o lista noua pentru angajatii din romania
        //pentru fiecare angajat din lista de angajati verificam daca tara fiecarui angajat este Romania
        List<Employee> employeesFromRomania = new ArrayList<>();
        for (Employee employee : employeeList) {
            //daca angajatul este din Romania se adauga la lista noua creata;
            if (employee.getCountry() == "Romania") {
                employeesFromRomania.add(employee);
            }
        }
        return employeesFromRomania;
    }

    //O metoda care sorteaza angajatii dupa tara

    public static void sortEmployeesByCountry(List <Employee> employeeList) {
        //trebuie sa sortam angajatii in functie de tara,in ordine alfabetica
          //ne vom folosi de metoda de sortare din clasa Colections,si vom specifica
          // cum anume trebuie sa procedam apeland la interfata comparator

        Collections.sort(employeeList, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.getCountry().compareTo(e2.getCountry());
            }
        });
    }


    //O metoda care sorteaza angajatii dupa nume

    public static void sortEmployeesByName(List<Employee> employeeList) {
        ////trebuie sa sortam angajatii in functie de nume,in ordine alfabetica
        //ne vom folosi de metoda de sortare din clasa Colections,si vom specifica
        // cum anume trebuie sa procedam apeland la interfata comparator
        Collections.sort(employeeList, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.getName().compareTo(e2.getName());
            }
        });
    }

    ;

    //O metoda care returneaza o mapa, in care cheia este tara si valoarea
    // este numarul de angajati din acea tara

    public static Map<String, Integer> countEmployeesByCountry(List<Employee> employeeList) {
        //creeam o mapa goala
        Map<String, Integer> countryCountMap = new HashMap<>();
        //vrem sa numaram angajatii din fiecare tara
        //penru fiecare angajat din lista vom verifica daca tara fiecarui angajat este cheia din mapa
           //daca este vom adauga tara la cheia respectiva si se va adauga la numaratoare;
           //daca nu este vom face o noua cheie cu tara nou gasita
        //se returneaza valoarea fiecarei chei in functie de tara;
        for (Employee employee : employeeList) {
            String country = employee.getCountry();
            if (countryCountMap.containsKey(country)) {
                countryCountMap.put(country, countryCountMap.get(country) + 1);
            } else {
                countryCountMap.put(country, 1);
            }
        }
        return countryCountMap;
    }

    //O metoda care returneaza o mapa, in care cheia este tara
    // si valoarea o lista cu toti angajatii din acea tara

    public static Map<String, List<Employee>> groupEmployeesByCountry(List<Employee> employeeList) {
        //penru fiecare angajat din lista vom verifica daca tara fiecarui angajat este cheia din mapa
        //daca tara exista ca si cheie vom adauga inca un angajat
        //daca nu este vom face o noua lista si vom adauga angajatul
        //se va crea o noua lista in mapa in functie de tara de fiecare data cand va aparea un nou angajat
       // dintr-o noua tara;
        Map<String, List<Employee>> countryEmployeeMap = new HashMap<>();
        for (Employee employee : employeeList) {
            String country = employee.getCountry();
            if (countryEmployeeMap.containsKey(country)) {
                countryEmployeeMap.get(country).add(employee);
            } else {
                List<Employee> employeesInCountry = new ArrayList<>();
                employeesInCountry.add(employee);
                countryEmployeeMap.put(country, employeesInCountry);
            }
        }
        return countryEmployeeMap;
    }
}