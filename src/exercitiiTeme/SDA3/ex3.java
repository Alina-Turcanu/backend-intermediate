package exercitiiTeme.SDA3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ex3 {
    // Gaseste primul element duplicat dintr-un array (first duplicate value)
    //Input:
    //
    //[2,1,5,2,3,3,4]
    //Output:
    //
    //2 - este primul element care se repeta (al doilea 3 apare dupa al doilea 2)
    //HINT: Varianta "brute force" va lua fiecare element cu fiecare, iar varianta mai eficienta va folosit un Set
    public static void main(String[] args) {
        List<Integer> array = Arrays.asList(1,2, 3, 3, 5, 6, 2, 1, 4);
        Integer firstDuplicate = getFirstDuplicate(array);

        if (firstDuplicate != null) {
            System.out.println(firstDuplicate + " - este primul element care se repeta.");
        } else {
            System.out.println("Nu exista duplicate in array.");
        }
    }

    public static Integer getFirstDuplicate (List<Integer>array) {
        Set<Integer> seenElements = new HashSet<>();

        for (int element : array) {
            if (!seenElements.add(element)) {

                return element;
            }
        }
        return null;

    }
}
