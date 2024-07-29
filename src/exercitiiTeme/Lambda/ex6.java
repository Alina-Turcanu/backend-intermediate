package exercitiiTeme.Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ex6 {
    //suma numerelor pare
    //Calculeaza suma numerelor pare dintr-o lista de Integer-uri. HINT: foloseste filter si sum sau foloseste reduce
    //
    //Rezolva problema si fara expresii lambda.

    public static void main(String[] args) {
        List<Integer> numbers=new ArrayList<>();
        numbers.add(5);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(0);
       Optional<Integer> sumOfNumbers= numbers.stream()
                .filter(number -> number % 2==0 )
                .reduce(((sum, number)->sum+number));

        System.out.println("Suma numerelor pare este:" + sumOfNumbers.get());
        System.out.println("Suma numerelor pare este:" + getSumOfNumbers(numbers));
    }

    public static Integer getSumOfNumbers(List <Integer> numbers){
        int sum=0;
        for( Integer number: numbers){
            if(number % 2==0){
                sum += number;
            }
        }
        return sum;
    }
}
