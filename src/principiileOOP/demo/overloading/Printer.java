package demo.overloading;

public class Printer {


    public static void print(String s){
        System.out.println(s);
    }

    public static void print (String s, int times){
        for (int i = 0; i < times; i++) {
            System.out.println(s);
        }
    }

    public static void print (int x){
        System.out.println(x);
    }
}
