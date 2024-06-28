package exercitii.ex8company;

public class Main {
    //O companie are un nume, data infiintarii, o lista de departamente
    //
    //Un departament un nume si o lista de angajati.
    //
    //Un angajat are nume, prenume, salariu si o adresa.
    //
    //O adresa are oras, strada, numar.
    //8.1. Scrie o metoda care afiseaza numele angajatului ++++
    //8.2. Scrie o metoda care afiseaza strada adresei angajatului ++++
    //8.3. Scrie o metoda care afiseaza toate atributele adresei angajatului +++++
    //8.4. scrie un program care afiseaza numarul de angajati din departament+++++
    //8.5. scrie o metoda care printeaza toti angajatii din departament ++++++
    //8.6. scrie o metoda care printeaza toate strazile adreselor angajatilor din departament +++++
    //8.7. scrie o metoda care cauta un anumit angajat dupa nume in departament, si ii afiseaza numele daca il gaseste +++++
    //8.8. scrie o metoda care printeaza adresa unui anumit angajat din departament +++++
    //8.9. scrie o metoda care cauta o adresa (dupa strada) in lista de angajati a departamentului, si ii afiseaza strada daca o gaseste++++
    //8.10. scrie o metoda care printeaza toate departamentele din companie +++++
    //8.11. scrie o metoda care printeaza toti angajatii dintr-un anumit departament din companie
    //8.12. scrie o metoda care printeaza cati angajati are un anumit departament din companie
    //8.13. scrie o metoda care printeaza toate strazile adreselor angajatilor dintr-un anumit departament din companie
    //8.14. scrie o metoda care printeaza strada adresei unui anumit angajat din companie
    //8.15. scrie o metoda care cauta un angajat (dupa nume) intr-un anumit departament din companie si ii afiseaza numele, daca il gaseste
    //8.16. scrie o metoda care printeaza toti angajatii din toate departamentele din companie
    //8.17. scrie o metoda care printeaza numarul total de angajati din toate departamentele din companie ++++++++
    //8.18. scrie o metoda care cauta un angajat in toate departamentele din companie si ii afiseaza numele, daca il gaseste
    //8.19. scrie o metoda care printeaza numele angajatului cu cel mai mare salariu dintr-un anumit departament ++++
    //8.20. scrie o metoda care printeaza numele angajatului cu cel mai mare salariu din companie
    //8.21. scrie o metoda care printeaza numele angajatului cu cel mai mic salariu din companie
    //8.22. scrie o metoda care printeaza numele angajatului cu cel mai mic salariu dintr-un anumit departament; ++++


    public static void main(String[] args) {
        Address address1 = new Address("Cluj", "Primaverii", 15);
        Address address2 = new Address("Bucuresti", "Fericirii", 4);
        Address address3 = new Address("Timisioara", "Unirii", 10);
        Address address4 = new Address("Brasov", "Margelelor", 28);
        Address address5 = new Address("Oradea", "Visinului", 14);

        Employee employee1 = new Employee("Ionut", "Popescu", 4000, address1);
        Employee employee2 = new Employee("Jonathan", "Stefan", 3200, address2);
        Employee employee3 = new Employee("Vasile", "Georgel", 4500, address3);
        Employee employee4 = new Employee("Costel", "Iordache", 5800, address4);
        Employee employee5 = new Employee("FLorin", "Dumitrache", 21450, address5);
        Employee[] employeesIT = {employee1, employee2, employee3};
        Employee[] employeesHR = {employee4, employee5};

        Department department1 = new Department("IT", employeesIT, 3);
        Department department2 = new Department("HR", employeesHR, 2);
        Department[] allDepartaments = {department1, department2};

        Company company = new Company("Ubisoft", 1990, allDepartaments, 2);

        System.out.println(department1.findHighestSallaryByDepartment());
        //System.out.println(department.findLowestSallaryByDepartment());
        //department.printAllEmployeesStreets();

        //System.out.println(company.printAllDepartments());
        System.out.println(company.findEmployeeByNameInCompany("Iordache"));

        //System.out.println (department1.findEmployeeByName("Dumitrache"));
        //System.out.println(company.findEmployeeByNameInCompany("Iordache"));
        //company.printAllDepartments();
       // department2.printNumberOfEmployeeByDepartment();
        company.prinAllEmployeesByCompany();
    }
}



