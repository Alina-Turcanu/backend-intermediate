package demo.sorting;


import java.util.Arrays;

public class BinarySearch {

    //initial left = 0
    //intial right = lengh-1
    //atat timp cat left mai mic sau egal right
        //middle devine left + right /2
        //if (numarul cautat este elementul de la zpoitia middle)
             //return
        //else if (numarul cautat este mai mic decat  elementul de la zpoitia middle )
            //right devine middle - 1
        //altfel
            //left devine middle + 1

    public static void main(String[] args) {
        int[] a = {0,2,5,8,10,11,14,25,33};
        Arrays.sort(a);

        System.out.println(binarySearch(a,13));
    }

    public static int binarySearch(int[] array, int target){
        int left = 0;
        int right = array.length-1;
        while (left<=right){
            int middle = (left+right)/2;
            if (target == array[middle]){
                return middle;
            } else if (target < array[middle]){
                right = middle - 1;
            } else{
                left = middle + 1;
            }
        }
        return -1;
    }
}

