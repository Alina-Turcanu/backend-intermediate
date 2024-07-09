package colections.exercitii.algorithmics;

import java.util.Arrays;

public class ex10 {
    public static void main(String[] args) {
        // varianta 1


//        List<Integer> numbers= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
//
//        System.out.println(numbers.reversed());
//    }

        //varianta 2

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Array before reversal: " + Arrays.toString(numbers));
        reverseArray(numbers);
        System.out.println("Array after reversal: " + Arrays.toString(numbers));
    }

    public static void reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            // Schimbă elementele
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            // Mutați indicii
            left++;
            right--;
        }
    }
}
