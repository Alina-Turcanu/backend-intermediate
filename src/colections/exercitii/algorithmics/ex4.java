package colections.exercitii.algorithmics;

import java.util.Arrays;

public class ex4 {
    //Sunt afisate n-1 numere dintr-un interval de la 1 la n. Sa se gaseasca numarul care lipseste.
    //Exemplu:
    //
    //Input: n=7, a=[3,2,1,6,5,7]
    //Output: 4 - lipseste doar 4 din array.
    //(hint: sorteaza array-ul si verifica daca gasesti o diferenta de 2 intre 2 elemente consecutive.
    // Un gasesti diferenta, acolo va fi si numarul care lipseste. Gandeste-te apoi si la alta metoda de rezolvare)
    public static void main(String[] args) {
        int n = 7;
        int[] numbers = {1, 3, 2, 5, 6, 4};
        int missingNumber = findMissingNumberBySorting(numbers, n);

        if (missingNumber != -1) {
            System.out.println("Numarul care lipseste este:" +missingNumber);
        }else {
            System.out.println("Nu exista nici un numar care lipseste");
        }
    }

    public static int findMissingNumberBySorting(int[] numbers, int n) {
        // Sortarea array-ului
        Arrays.sort(numbers);

        // Verificarea diferențelor dintre elementele consecutive
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i + 1] != numbers[i] + 1) {
                return numbers[i] + 1;
            }
        }

        // Dacă nu s-a găsit niciun număr lipsă între elementele array-ului, înseamnă că numărul lipsă este n
        // Aceasta se întâmplă doar dacă ultimul element este mai mic decât n
        if (numbers[numbers.length - 1] != n) {
            return n;
        }

        return -1; // În cazul în care toate numerele sunt prezente
    }
}



