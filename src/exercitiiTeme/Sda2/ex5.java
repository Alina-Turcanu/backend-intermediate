package exercitiiTeme.Sda2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ex5 {
    // Scrie o functie care primeste un array si un numar n.
    //Returneaza decate ori apare numarul n in array.

    //Acum transforma functia in felul urmator: functia va primi, in plus si un numar k.
    // Returneaza index-ul celei de-a k aparitii a numarului n in array.
    // De exemplu, pentru 19 14 17 15 17, indexul celei de-a 2-a aparitii a lui 17 in array este 5.
    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5, 3, 2, 1, 1, 1};
//        System.out.println(getTheNumberOfOccurances(numbers,1));
//    }
//
//    public static int getTheNumberOfOccurances(int[] numbers, int n) {
//        int counter = 0;
//
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] == n) {
//                counter++;
//                positions.add(i);
//            }
//        }
//        return counter;
//    }
//    public static int getTheIndexOfkApparition(int[]numbers,int n,int k){
//        int numberOfOccurences=getTheNumberOfOccurances(numbers,n);
//        List<Integer> positions = new ArrayList<>();
//          for (int i = 0; i <numbers.length ; i++) {
//
//
//
//
//        }
//
//    }
//}
//                int[] numbers = {1, 2, 3, 2, 4, 2, 5, 2};
//                int target = 2;
//
//                // Apelăm metoda findOccurrences și obținem rezultatul
//                int[] occurrences = findOccurrences(numbers, target);
//
//                // Afișăm rezultatul
//                System.out.println("Number " + target + " appears " + occurrences.length + " times.");
//                System.out.println("Positions: " + Arrays.toString(occurrences));
//            }
//
//            public static int[] findOccurrences(int[] arr, int target) {
//                List<Integer> positionsList = new ArrayList<>();
//
//                // Parcurgem array-ul și adăugăm pozițiile în listă
//                for (int i = 0; i < arr.length; i++) {
//                    if (arr[i] == target) {
//                        positionsList.add(i);
//                    }
//                }
//
//                // Convertim lista de poziții într-un array de int-uri
//                int[] positionsArray = new int[positionsList.size()];
//                for (int i = 0; i < positionsList.size(); i++) {
//                    positionsArray[i] = positionsList.get(i);
//                }
//
//                return positionsArray;
//            }
//
//            public static int getIndex(int[]occurrences,int k){
//        int index=-1;
//                for (int i = 0; i <occurrences.length ; i++) {
//                    if(k==occurrences[i]){
//
//                    }
//
//
//                }
//            }

        int[] numbers = {19, 14, 17, 17, 17, 17};
        int n = 17;
        int k = 2;

        System.out.println("Number " + n + " appears " + countOccurrences(numbers, n) + " times.");

        int index = findKthOccurrenceIndex(numbers, n, k);
        if (index != -1) {
            System.out.println("The index of the " + k + "-th occurrence of number " + n + " is " + index + ".");
        } else {
            System.out.println("The " + k + "-th occurrence of number " + n + " does not exist in the array.");
        }
    }

    // Funcția pentru a număra aparițiile unui număr într-un array
    public static int countOccurrences(int[] arr, int n) {
        int count = 0;
        for (int num : arr) {
            if (num == n) {
                count++;
            }
        }
        return count;
    }

    // Funcția pentru a găsi index-ul celei de-a k-a apariții a unui număr în array
    public static int findKthOccurrenceIndex(int[] arr, int n, int k) {
        int occurrence = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                occurrence++;
                if (occurrence == k) {
                    return i;
                }
            }
        }
        return -1; // Returnăm -1 dacă a k-a apariție nu există
    }
}