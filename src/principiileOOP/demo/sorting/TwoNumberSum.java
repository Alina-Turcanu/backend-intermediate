package demo.sorting;

import java.util.Arrays;

public class TwoNumberSum {

    public static void main(String[] args) {



    }


    public static int[] twoNumberSum (int[] array, int targetSum){

        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] + array[j] == targetSum){
                    return new int[]{array[i], array[j]};
                }
            }
        }
        return null;
    }


    public static int[] twoNumberSum2(int[] array, int target){
        Arrays.sort(array);
        int left = 0;
        int right = array.length-1;
        while (left<=right){
            int currentSum = array[left] + array[right];
            if (target == currentSum){
                return new int[]{array[left], array[right]};
            } else if (currentSum < target){
                left++;
            } else{
                right--;
            }
        }
        return null;
    }
}
