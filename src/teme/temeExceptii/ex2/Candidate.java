package temeExceptii.ex2;

public class Candidate {

    public String name;
    public int NumberOfVotes;

    public Candidate(String name, int numberOfVotes) {
        this.name = name;
        NumberOfVotes = numberOfVotes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfVotes() {
        return NumberOfVotes;
    }

    public void setNumberOfVotes(int numberOfVotes) {
        NumberOfVotes = numberOfVotes;
    }

    public static String getDayOfWeek2(int input){
        String[] days = {"Luni", "Marti", "Miercuri", "Joi", "Vineri", "Sambata", "Duminica"};
        if(input>=1 && input<=7){
            return days[input-1];
        }else{
            return "Numarul nu exista in baza de date";
        }
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "name='" + name + '\'' +
                ", NumberOfVotes=" + NumberOfVotes +
                '}';
    }
}
