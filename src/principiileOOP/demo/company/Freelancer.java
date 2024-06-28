package demo.company;

public class Freelancer implements DeveloperContract{


    private String name;

    private double hourlyRate;

    public Freelancer(String name, double hourlyRate) {
        this.name = name;
        this.hourlyRate = hourlyRate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public void implementFeatures() {
        System.out.println(name + "implement featutres as freelacner");
    }

    @Override
    public void solveBugs() {
        System.out.println(name + "solve Bugs as freelacner");
    }

    @Override
    public void writeDocumentation() {
        System.out.println(name + "write Documentation as freelacner");
    }
}
