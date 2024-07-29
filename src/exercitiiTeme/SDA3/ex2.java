package exercitiiTeme.SDA3;

import java.util.Arrays;
import java.util.List;

public class ex2 {
    //2. Subsir al unui array (validate subsequence)
    //Avand la dispoizitie doua array-uri, verifica daca al doilea este subsir al primului.
    // De exemplu, daca array-ul [1,3,4] este subsir al array-ului [1,2,3,4] Dar si [2,4] este subsir al array-ului [1,2,3,4].
    // E nevoie sa se pastreze ordinea, dar elementele nu trebuie sa fie neaparat consecutive.
    //
    //Input:
    //
    //array1: [5,1,2,,25,5,-1,8,10]
    //array2: [1,6,-1,10]
    //Output:
    //
    //true (array2 este subsir al lui array1)
    //HINT: Parcurge array-ul cu 2 pointeri

    public static void main(String[] args) {
        List<Integer> array1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> array2 = Arrays.asList(1, 4, 5);
        boolean isSubsequence = checkIfSubsequence(array1, array2);
        if (isSubsequence) {
            System.out.println("Arrayul2 este subsir al lui Array1");
        } else {
            System.out.println("Arrayul2 nu este subsir al lui Array1");
        }
    }

    public static boolean checkIfSubsequence(List<Integer> array1, List<Integer> array2) {
//        for (int i = 0; i <array1.size() ; i++) {
//            for (int j = 0; j <array2.size() ; j++) {
//                if(array1.contains(array2.get(i)) && array2.get(i)<array2.get(i)+1){
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
        if (array2.size() == 0) {
            return true;
        }
        int index1 = 0;
        int index2 = 0;
        while (index1 < array1.size() && index2 < array2.size()) {
            if (array1.get(index1).equals(array2.get(index2))) {
                index2++;
            }
            index1++;
        }
        return index2 == array2.size();
    }
}
