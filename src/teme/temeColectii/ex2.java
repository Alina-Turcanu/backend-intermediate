package temeColectii;

import java.util.ArrayList;
import java.util.List;

public class ex2 {
    //. Scrie o metoda care:
    //primeste ca si parametru o lista de numere si returneaza o alta
    // lista de numere formata din numerele din lista primita ca parametru,
    // ridicate la patrat (puteti folosi Math.pow(2) pentru a ridica la patrat)
    //Exemplu:
    //Input: {2,3,4,5}
    //Output: {4,9,16,25}

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        List<Integer> squaredNumbers = squareNumbers(numbers);

        // Afișează rezultatele
        for (int num : squaredNumbers) {
            System.out.println(num);
        }
     }

    public static List<Integer> squareNumbers(List<Integer> numbers) {
        List<Integer> squaredNumbers = new ArrayList<>();
        for (int number : numbers) {
            squaredNumbers.add((int) Math.pow(number, 2));
        }
        return squaredNumbers;
    }
}