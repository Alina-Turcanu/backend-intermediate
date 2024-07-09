package exercitiiTeme.colectii;

import java.util.ArrayList;
import java.util.List;

public class ex6 {
    //6. Scrie o metoda care:
    //Primeste ca parametru doua set-uri si returneaza true
    // daca primul set primit ca parametru este superset al celui de-al doilea set
    //Un set “set1” este superset al altui set “set2”,
    // daca “set1” contine toate elementele din “set2”, dar seturile nu sunt egale - containsAll()
    //Exemple:
    //Input1: {“ana”, “are”, “mere”}, {“ana”, “are”}
    //Output1: true
    //Input2: {“ana”, “are”, “mere”}, {“ana”, “are”, “mere”}
    //Output2: false
    public static void main(String[] args) {
        List<String> input1 = new ArrayList<>();
        input1.add("masina");
        input1.add("pisica");
        input1.add("catel");
        List<String> input2 = new ArrayList<>();
        input2.add("masina");
        input2.add("pisica");
        boolean contains = checkIfContains(input1, input2);
        System.out.println(contains);
    }

    public static boolean checkIfContains(List<String> input1, List<String> input2) {
//        for (int i = 0; i <input1.size() ; i++) {
//            for (int j = 0; j <input2.size() ; j++) {
        if (input1.containsAll(input2) && !input1.equals(input2)) {
            return true;
        }
        return false;
    }
}
