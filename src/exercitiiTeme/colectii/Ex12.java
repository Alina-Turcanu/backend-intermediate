package exercitiiTeme.colectii;

import java.util.List;
import java.util.TreeSet;

public class Ex12 {

    public static void main(String[] args) {

    }

    public static void printMinAndMax(List<Integer> numbers){
        Integer max = Integer.MIN_VALUE;
        Integer min = Integer.MAX_VALUE;
        for(Integer number: numbers){
            if (number > max){
                max = number;
            } else if (number<min){
                min = number;
            }
        }
        System.out.println(min);
        System.out.println(max);

        TreeSet<Integer> sortedNumbers = new TreeSet<>(numbers);
        System.out.println(sortedNumbers.first());
        System.out.println(sortedNumbers.last());



    }
}
