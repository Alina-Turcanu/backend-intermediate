package sesiunea10.OOPintro;

public class Student {
    String name;
    String address;

    public Student(){}

    public Student(String name, String address){
        this.address = address;
        this.name = name;
    }


    public String toString() {
        return "Student{" +
                "name='" + this.name + '\'' +
                ", address='" + this.address + '\'' +
                '}';
    }
}
