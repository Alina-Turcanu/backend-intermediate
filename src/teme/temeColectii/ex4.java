package temeColectii;

import java.util.HashSet;
import java.util.Set;

public class ex4 {
    //Primeste ca parametru 2 liste de numere si returneaza un set format
    // din numerele pozitive din ambele liste primite ca parametru
    //Exemplu:
    //Input: {1, -2, 3, 4, 4, -5}, {1, -7, 2}
    //Output: {1, 3, 4, 2}

    public static void main(String[] args) {
        Set<Integer> numbers1 = new HashSet<>();
        numbers1.add(-1);
        numbers1.add(2);
        numbers1.add(-3);
        numbers1.add(4);
        numbers1.add(5);
        Set<Integer> numbers2 = new HashSet<>();
        numbers2.add(6);
        numbers2.add(-7);
        numbers2.add(8);
        numbers2.add(-9);
        numbers2.add(10);
        System.out.println("Numerele pozitive sunt: " + getPositiveNumbers(numbers1,numbers2));
    }

    public static Set<Integer> getPositiveNumbers(Set<Integer> numbers1, Set<Integer> numbers2) {
      Set <Integer> positiveNumbers = new HashSet<>();
        for (int number:numbers1) {
            if (number >= 0) {
                positiveNumbers.add(number);
            }
        }
        for (int number:numbers2) {
            if (number >= 0) {
                positiveNumbers.add(number);
            }
        }
        return positiveNumbers;
    }
}
