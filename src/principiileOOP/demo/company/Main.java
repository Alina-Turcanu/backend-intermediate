package demo.company;

public class Main {

    public static void main(String[] args) {
        DevDepartament devDepartament = new DevDepartament();
        DeveloperContract developer1 = new Employee("Ionut",7800);
        DeveloperContract developer2 = new Employee("Andrei",15200);
        DeveloperContract developer3 = new Freelancer("George",300);

        devDepartament.addDeveloper(developer1);
        devDepartament.addDeveloper(developer2);
        devDepartament.addDeveloper(developer3);
        devDepartament.solveAllBugs();

    }
}
