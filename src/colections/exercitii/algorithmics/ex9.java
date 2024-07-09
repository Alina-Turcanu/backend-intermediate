package colections.exercitii.algorithmics;

import java.util.Arrays;

public class ex9 {
    //Roteste un array la stanga cu o pozitie
    //Exemplu:
    //
    //Input: [1,2,3,4,5]
    //Output: [5,1,2,3,4]
    //Rezolva apoi problema in mod general, adica roteste un array la stanga cu n pozitii Exemplu:
    //
    //Input: [1,2,3,4,5] , n=2
    //Output: [3,4,5,1,2] - array-ul s-a rotit cu 2 pozitii
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        getTheLastPositionFirst(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    public static void getTheLastPositionFirst(int[] numbers) {
        int lastElement = numbers[numbers.length - 1];
        for (int i = numbers.length - 1; i > 0; i--) {
            numbers[i] = numbers[i - 1];
        }
        numbers[0] = lastElement;
    }
}
