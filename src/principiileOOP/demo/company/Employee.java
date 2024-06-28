package demo.company;

public class Employee implements DeveloperContract, ManagerContract {


    private String name;

    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public void implementFeatures() {
        System.out.println(name + "implements features as an employee");
    }

    @Override
    public void solveBugs() {
        System.out.println(name + "solve bugs as an employee");
    }

    @Override
    public void writeDocumentation() {
        System.out.println(name + "write documentation as an employee");
    }

    @Override
    public void evaluatePeople() {
        System.out.println(name + "evaluates people");
    }

    @Override
    public void delegateTaks() {
        System.out.println(name + "delegates tasks");
    }
}
