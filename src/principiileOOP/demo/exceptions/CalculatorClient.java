package demo.exceptions;

import java.util.Scanner;

public class CalculatorClient {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double result = 0;
        int firsNumber = s.nextInt();
        int secondNumber = s.nextInt();

        /*try {
            result = firsNumber / secondNumber;
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
            System.out.println("baaaa nu poti imparti la 0");
        }
        System.out.println(result);
        System.out.println("programul continua");*/

        try {
             result = Calculator.divide(firsNumber, secondNumber);
             System.out.println(result);
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        System.out.println("programul continua");

    }
}
