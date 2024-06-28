package oop.ex2;

public class Teacher extends Person {
    public String department;
    public String subject;
    //Metoda introduce() - implementează metoda abstractă
   // din subclasă și afișează un mesaj. Exemplu: “I am John Decker, I teach Math and I am a teacher”


    public Teacher(String firstName, String lastName,String department,String subject) {
        super(firstName, lastName);
        this.department = department;
        this.subject = subject;
    }

    public void introduce(){
     System.out.println("I am "+ getFirstName()+" " + getLastName() +"," +" I teach "+ subject+" and I am a "+ department);
 }

}
