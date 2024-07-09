package colections.exercitii.algorithmics;

import java.util.HashMap;
import java.util.Map;

public class ex3 {
    //3.Sa se verifice daca un array contine duplicate
    //Exemplu:
    //
    //Input: [6,5,6,2,3,1]
    //Output: true, pentru ca 6 apare de doua ori
    //(hint: construieste o mapa care sa numere de cate ori apare fiecare element din lista)

    public static void main(String[] args) {
        Integer[] numbers = {3, 4, 3, 8, 3, 8, 3};
        Map<Integer, Integer> duplicatedNumbers = checkIfAreDuplicateNumbers(numbers);
        boolean containsDuplicates = false;
        for (int value : duplicatedNumbers.values()) {
            if (value > 1) {
                containsDuplicates = true;
                break;
            }
        }

        if (containsDuplicates) {
            System.out.println("Array-ul conține duplicate");
        } else {
            System.out.println("Array-ul nu conține duplicate");
        }
    }

    public static Map<Integer, Integer> checkIfAreDuplicateNumbers(Integer[] numbers) {
        Map<Integer, Integer> duplicatedNumbers = new HashMap<>();
        for (Integer number : numbers) {
            if (!duplicatedNumbers.containsKey(number)) {
                duplicatedNumbers.put(number, 1);
            } else {
                duplicatedNumbers.put(number, duplicatedNumbers.get(number) + 1);
            }
        }
        return duplicatedNumbers;
    }
}
