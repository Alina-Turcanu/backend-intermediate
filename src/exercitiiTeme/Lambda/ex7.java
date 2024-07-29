package exercitiiTeme.Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ex7 {
    //. Suma numerelor divizibile cu x sau cu y
    //Scrie o metoda care sa calculeze suma numerelor divizibile cu x sau y (unde x si y sunt primiti ca parametri),
    // dintr-o lista de Integer-uri. HINT: foloseste filter si sum sau foloseste reduce
    //
    //Rezolva problema si fara expresii lambda.
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(0);
        int x = 2;
        int y = 3;

        Optional<Integer> sumOfNumbersDivizibleToXOrY = numbers.stream()
                .filter(number -> number % x == 0 || number % y == 0)
                .reduce(((sum, number) -> sum + number));
        System.out.println(sumOfNumbersDivizibleToXOrY.get());
    }
}
