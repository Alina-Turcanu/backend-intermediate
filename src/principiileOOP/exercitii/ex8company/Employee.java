package exercitii.ex8company;

public class Employee {

    private String firstName;
    private String lastName;
    private double salary;
    private Address address;

    public Employee(String firstName, String lastName, double salary, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", address=" + address +
                '}';
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void printEmployeeAdressInfo() { //8.3
        System.out.println(address.getStreet());
        System.out.println(address.getNumber());
        System.out.println(address.getCity());
    }

    public void printEmployeeName() { //8.1
        System.out.println(firstName + lastName);

    }

    public void printEmployeeAdressStreet() { //8.2
        System.out.println(address.getStreet());

    }


}