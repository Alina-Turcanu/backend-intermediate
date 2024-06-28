package demo.sorting;

public class SelectionSort {

    //pentru fiecare element din array
      // gasesc minimul din dreapta lui
      // interschimb minimul cu elementul meu

    //-700  2  5  -40  1  6  0  3

    public static void main(String[] args) {

        int[] a = {-7,2,5,4,1,6,0,3};
        selectionSort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }

    public static void selectionSort(int[] a){
        for (int i = 0; i < a.length-1; i++) {
            //gasesc pozitia elementului minim din dreapta lui
            int minIdx = getMinIndexAfterIndex(a, i);

            swap(minIdx, i, a);

           /* int minIdx = i+1;

            for (int j = i+1; j < a.length ; j++) {
                if(a[j]<a[minIdx]) {
                    minIdx = j;
                }
            }

            int temp = a[i];
            a[i] = a[minIdx];
            a[minIdx] = temp;*/

        }
    }
    public static int getMinIndexAfterIndex(int[] a, int i){
        int minIdx = i;
        for (int j = i; j < a.length ; j++) {
            if(a[j]<a[minIdx]) {
                minIdx = j;
            }
        }
        return minIdx;
    }

    public static void swap(int index1, int index2, int[] a){
        int temp = a[index1];
        a[index1] = a[index2];
        a[index2] = temp;
    }


}
