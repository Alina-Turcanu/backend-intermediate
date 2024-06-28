package demo.exceptions;

public class Calculator {


    public static double divide (int firstNumber, int secondNumber) throws ArithmeticException{
        if (secondNumber == 0) {
            throw new ArithmeticException("nu poti imparti la 0. Ia ore de matematica");
        }
        return firstNumber / secondNumber;
    }
}
