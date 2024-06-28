package oop.ex2;

public class School {
    public static void main(String[] args) {
       Person person=new Teacher("Popa","Maria","teacher","math");
        Person person2=new Student("Ion","Andrei",9,"Student");
        person.introduce();
        person2.introduce();
    }
}
