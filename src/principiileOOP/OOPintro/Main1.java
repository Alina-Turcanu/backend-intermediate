package sesiunea10.OOPintro;

import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        Student s = new Student("Ionut","Cluj");
        Student s2 = new Student("Ana","Bucuresti");
        System.out.println(s.toString());
        System.out.println(s2.toString());



//        System.out.println("cati studenti vrei sa adaugi?");
//        int n = scanner.nextInt();
//        //pregatesc un array in care voi baga studentii
//        Student[] students = new Student[n];
//        for (int i = 0; i < n; i++) {
//            students[i] = readStudent();
//        }
//
//        for (int i = 0; i < students.length; i++) {
//            System.out.println(students[i].toString());
//        }

    }
//    public static Student readStudent() {
//        Scanner scanner = new Scanner(System.in);
//        //citim de la tastatura nume si adresa
//        System.out.println("da-mi nume");
//        String name = scanner.nextLine();
//        System.out.println("da-mi adresa");
//        String address = scanner.nextLine();
//        Student student = new Student(name,address);
//        return student;
//    }
//

}
