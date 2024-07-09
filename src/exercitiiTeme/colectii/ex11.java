package exercitiiTeme.colectii;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

    class Main {
        public static void main(String[] args) {
            List<Integer> numbers = List.of(2, 0, 7, 3, 8, 5, 1);

            int duplicate = findDuplicate(numbers);
            System.out.println("Elementul duplicat este: " + duplicate); // Va afișa 5
        }

        public static int findDuplicate(List<Integer> numbers) {
            Set<Integer> set = new HashSet<>();

            for (Integer number : numbers) {
                // Dacă elementul nu poate fi adăugat în set (deja există), atunci returnăm elementul duplicat
                if (!set.add(number)) {
                    return number;
                }
            }

            // În mod normal, acest cod nu va fi atins niciodată într-o listă validă cu un element duplicat
            throw new IllegalArgumentException("Lista nu conține un element duplicat.");
        }
    }
