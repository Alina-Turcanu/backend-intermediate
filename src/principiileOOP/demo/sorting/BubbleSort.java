package demo.sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {7,2,5,4,1,6,0,3};
        bubbleSort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }


    public static void bubbleSort(int[] a){
        //de n ori
            //parcurgem array-ul
               //verificam daca elementul de la i cu cel de la i+1 nu sunt in ordine si interschimbam daca nu sunt



        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length-1; j++) {
                if (a[j] > a[j+1]){
                    swap(j,j+1,a);
                }
            }
        }
    }

    public static void swap(int index1, int index2, int[] a){
        int temp = a[index1];
        a[index1] = a[index2];
        a[index2] = temp;
    }
}
