package colections.exercitii.algorithmics;

import java.util.Arrays;

public class ex7 {
    //7. Muta toate zero-urile dintr-un array la final
    //Exemplu:
    //
    //Input: [6,0,8,2,3,0,4,0,1]
    //Output: [6,8,2,3,4,1,0,0,0]

    public static void main(String[] args) {
        int[] numbers = {0, 4, 0, 3, 1, 0, 4, 8, 9};
        moveZerosToEnd(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    public static void moveZerosToEnd(int[] numbers) {
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != 0) {
                numbers[count++] = numbers[i];
            }
        }
        while (count < numbers.length) {
            numbers[count++] = 0;
        }
    }
}
