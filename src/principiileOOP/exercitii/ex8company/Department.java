package exercitii.ex8company;

import java.util.Arrays;

public class Department {
    private String name;

    private Employee[] employees;
    private int numberOfEmployees;

    public Department(String name, Employee[] employees, int numberOfEmployees) {
        this.name = name;
        this.employees = employees;
        this.numberOfEmployees = numberOfEmployees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", employees=" + Arrays.toString(employees) +
                ", numberOfEmployees=" + numberOfEmployees +
                '}';
    }

    public void printAllEmployeesStreets(){ //8.6
        for (int i = 0; i < numberOfEmployees; i++) {
            System.out.println(employees[i].getAddress().getStreet());
        }
    }

    public Employee findEmployeeByName(String lastName){ //8.7
        for (int i = 0; i < numberOfEmployees; i++) {
            if (lastName.equals(employees[i].getLastName())){
                return employees[i];
            }
        }
        return null;
    }

    public Address findEmployeeAdressByName(String lastName){ //8.8
        Employee foundEmployee = findEmployeeByName(lastName);
        if (foundEmployee == null){
            return null;
        }
        return foundEmployee.getAddress();
    }

    public Address findEmployeeAdressByStreet (String street){ //8.9
        for (int i = 0; i <= numberOfEmployees; i++) {
            if (street.equals(employees[i].getAddress().getStreet())){
                return employees[i].getAddress();
            }
        }
        return null;
    }

    public Employee findHighestSallaryByDepartment (){ //8.19
        double highestSalary = employees[0].getSalary();
        Employee maxSalaryEmployee = employees[0];
        for (int i = 0; i <numberOfEmployees ; i++) {
            if (highestSalary<employees[i].getSalary()){
                highestSalary = employees[i].getSalary();
                maxSalaryEmployee=employees[i];
            }
        }
        return maxSalaryEmployee;
    }
    public String findLowestSallaryByDepartment (){ //8.22
        double highestSalary = employees[numberOfEmployees-1].getSalary();
        for (int i = 0; i <numberOfEmployees ; i++) {
            if (highestSalary>employees[i].getSalary()){
                highestSalary = employees[i].getSalary();
            }
        }
        for (int i = 0; i < numberOfEmployees; i++) {
            if (employees[i].getSalary() == highestSalary){
                return employees[i].getFirstName();
            }
        }
        return null;
    }

    public void printNumberOfEmployeeByDepartment(){ //8.4
        System.out.println(numberOfEmployees);
    }

    public void printAllEmployeeByDepartment(){ //8.5
        for (int i = 0; i < numberOfEmployees; i++) {
            System.out.println(employees[i]);
        }

    }

        }

