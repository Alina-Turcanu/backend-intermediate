package oop.ex2;

public class Student extends Person {
    //- `groupClass` (adică clasa în care este studentul)
    //
    //Metode:
    //
    //- Metoda `introduce()` - implementează metoda abstractă din
    // subclasă și afișează un mesaj. Exemplu: “I am Dave Brown, I am in 12A class and I am a student”
    public int groupClass;
    public String department;

    public Student(String firstName, String lastName,int groupClass, String department) {
        super(firstName, lastName);
        this.groupClass = groupClass;
        this.department = department;
    }

    @Override
    public void introduce() {
        System.out.println("I am "+" "+ getFirstName()+ " " + getLastName()+"," +" I am in "+groupClass + " and I am a " + department);
    }
}

