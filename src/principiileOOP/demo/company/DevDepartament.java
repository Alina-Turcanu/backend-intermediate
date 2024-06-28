package demo.company;

public class DevDepartament {

    DeveloperContract[] developers;

    int numberOfDevelopers;

    public DevDepartament() {


        this.developers = new DeveloperContract[100];
    }

    public boolean addDeveloper(DeveloperContract product){
        this.developers[numberOfDevelopers] = product;
        this.numberOfDevelopers++;
        return true;
    }

    public void solveAllBugs(){
        for (int i = 0; i < numberOfDevelopers; i++) {
            developers[i].solveBugs();
        }
    }
}
