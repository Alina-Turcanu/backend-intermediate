package oop.ex2;

public abstract class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
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

    public abstract void introduce();

    //### 2. Creează o aplicație care să simuleze o școală
    //
    //### Clasa `Person` (abstractă)
    //
    //Atribute:
    //
    //- `firstName`
    //- `lastName`
    //
    //Metode:
    //
    //- Metoda abstractă `introduce()`
    //
    //### Clasa `Teacher` (extinde `Person`)
    //
    //Atribute:
    //
    //- `department`
    //- `subject` (adică ce predă profesorul)
    //
    //Metode:
    //
    //- Metoda `introduce()` - implementează metoda abstractă din subclasă și afișează un mesaj. Exemplu: “I am John Decker, I teach Math and I am a teacher”
    //
    //### Clasa `Student` (extinde `Person`)
    //
    //Atribute:
    //
    //- `groupClass` (adică clasa în care este studentul)
    //
    //Metode:
    //
    //- Metoda `introduce()` - implementează metoda abstractă din subclasă și afișează un mesaj. Exemplu: “I am Dave Brown, I am in 12A class and I am a student”
}
