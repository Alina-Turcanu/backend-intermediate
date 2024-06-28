package teme.ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introdu un sir de numere separate prin spatiu: ");
        String input = scanner.nextLine();

        try {
            int[] numbers = extractNumbers(input);
            System.out.print("Array-ul de numere este: ");
            for (int number : numbers) {
                System.out.print(number + " ");
            }
        } catch (NumberFormatException e) {
            System.err.println("Format invalid: " + e.getMessage());
        }
    }

    public static int[] extractNumbers(String input) throws NumberFormatException {
        String[] numberStrings = input.split(" ");
        int[] numbers = new int[numberStrings.length];

        for (int i = 0; i < numberStrings.length; i++) {
            numbers[i] = Integer.parseInt(numberStrings[i]);
        }

        return numbers;
    }
}
