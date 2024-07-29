package exercitiiTeme.SDA3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ex5 {
//    Daca ai 2 array-uri, gaseste elementele (unul din primul si celalalt din al doilea) care sa dea suma minima
//
//    Input:
//
//    Arr1: [-1,5,10,20,28,3]
//    Arr2: [26,134,135,15,17]
//    Output:
//
//            [28,26]
//    Hint: Cea mai simpla solutie este sa generezi toate perechile de numere si sa gasesti diferenta minima.
//
//    Alta solutie este sa sortezi inainte cele 2 array-uri, si apoi apoi sa parcurgi cu 2 pointeri (cate unul pentru fiecare array)
//

    public static void main(String[] args) {
        List<Integer> numbers1 = Arrays.asList(1, 2, 3, 6, 2, 6, 8, 4);
        List<Integer> numbers2 = Arrays.asList(9, 2, 7, 1, 8, 3, 5, 0);
        System.out.println(getTheSmallestDifference(numbers1, numbers2));
    }

    public static Integer getTheSmallestDifference (List<Integer> numbers1, List<Integer> numbers2) {
        Collections.sort(numbers1);
        Collections.sort(numbers2);
        // Arrays.sort(array1);
        // Arrays.sort(array2);
        int smallestDifference = Integer.MAX_VALUE;
        for (int i = 0; i < numbers1.size(); i++) {
            for (int j = 0; j < numbers2.size(); j++) {
                if ( numbers1.get(i) > numbers2.get(j) ) {
                    int differenceBetweenNumbers = numbers1.get(i) - numbers2.get(j);
                    if (differenceBetweenNumbers < smallestDifference) {
                        smallestDifference = differenceBetweenNumbers;
                    }
                }
            }
        }
        return smallestDifference;
    }
}
