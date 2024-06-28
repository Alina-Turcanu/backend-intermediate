package exercitii.ex8company;

import java.util.Arrays;

public class Company {

    private String name;
    private int yearFounded;
    private Department[] departments;
    private int numberOfDepartments;

    public Company(String name, int yearFounded, Department[] departments, int numberOfDepartments) {
        this.name = name;
        this.yearFounded = yearFounded;
        this.departments = departments;
        this.numberOfDepartments = numberOfDepartments;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearFounded() {
        return yearFounded;
    }

    public void setYearFounded(int yearFounded) {
        this.yearFounded = yearFounded;
    }

    public Department[] getDepartments() {
        return departments;
    }

    public void setDepartments(Department[] departments) {
        this.departments = departments;
    }

    public int getNumberOfDepartments() {
        return numberOfDepartments;
    }

    public void setNumberOfDepartments(int numberOfDepartments) {
        this.numberOfDepartments = numberOfDepartments;
    }


    public void printAllDepartments() { //8.10

        for (int i = 0; i <= numberOfDepartments; i++) {
            System.out.println(departments[i]);
        }
    }

    public void prinAllEmployeesByCompany() { //8.17
        for (int i = 0; i < numberOfDepartments; i++) {
            departments[i].printAllEmployeeByDepartment();
        }
    }

    public Employee findEmployeeByNameInCompany(String lastName) { //merge doar pe primul departament     8.18
        //parcurg fiecare departament
        for (int i = 0; i < numberOfDepartments; i++) {

            // creez o variabila de tip Employee si adaug in ea output-ul metodei findEmployeeByName aplicata pe departamentul de la pozitia i
            Employee foundEmployee = departments[i].findEmployeeByName(lastName);

            // adaug conditia ca daca mi-a gasit angajatul in departamentul curent, sa il returneze
            if (foundEmployee != null) {

                //returnez
                return foundEmployee;
            }
            // caut in lista de angajati a departamentului curent angajatul cu numele lastName
            /*Employee[] currentDepartmentEmployees = departments[i].getEmployees();
            for (int j = 0; j < departments[i].getNumberOfEmployees(); j++) {
                if (lastName.equals(currentDepartmentEmployees[j].getLastName())){
                    return currentDepartmentEmployees[j];
                }
            }*/
        }

        return null;
    }


}


