package colections.exercitii;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ex12 {
    //12. Scrie o metoda care:
    //Primeste ca parametru o lista de numere
    //Afiseaza cel mai mic si cel mai mare element din lista
    //HINT: (alt mod de rezolvare decat cel clasic): adauga toate elementele
    // din lista intr-un treeset,
    // apoi apeleaza metodele first() si last() pe acel treeset
    public static void main(String[] args) {
   List<Integer> numbers=List.of(5,8,2,9,0,4,3,1);

        displayMinMax(numbers);
    }


    public static void displayMinMax(List <Integer> numbers){
        TreeSet <Integer> treeSet=new TreeSet<>(numbers);
        if(!treeSet.isEmpty()){
            int min = treeSet.first();
            int max = treeSet.last();
            System.out.println("Cel mai mic numar din lista este:"+ min);
            System.out.println("Cel mai mare numar din lista este:"+ max);
        }else{
            System.out.println("Lista este goala");
        }
    }
}
