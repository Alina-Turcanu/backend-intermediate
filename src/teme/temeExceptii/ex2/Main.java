package temeExceptii.ex2;

public class Main {
    public static void main(String[] args) {
        Candidate candidate=new Candidate("Maria",30);
        Candidate candidate2=new Candidate("Ioana",20);
        String day= Candidate.getDayOfWeek2(5);
        String day2= Candidate.getDayOfWeek2(9);
        System.out.println(day);
        System.out.println(day2);
        candidate.setName("Laura");
        candidate2.setName("George");
        System.out.println("Numele candidatului este "+ candidate.getName());
        System.out.println("Numele candidatului este " + candidate2.getName());
        Candidate candidate3=new Candidate("Ion", 100);
        System.out.println("Numele candidatului este "+ candidate3.getName());
        candidate3.setName("Marius");
        System.out.println(candidate3.getName());
        String day8= Candidate.getDayOfWeek2(3);
        System.out.println(day8);
    }
}
