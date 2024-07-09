package exercitiiTeme.colectii;

import java.util.ArrayList;
import java.util.List;

public class ex5 {
    //5. Scrie o metoda care:
    //Primeste ca si parametru o lista de cuvinte si returneaza lista de
    // cuvinte inversata, cu mentiunea ca lista inversata nu va include
    // cuvintele care au lungimea mai mica decat 3
    //Exemplu:
    //Input: {“ana”, “nu”, “are”, “mere”}
    //Output: {“mere”, “are”, “ana”}

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("ana");
        strings.add("adriana");
        strings.add("alina");
        strings.add("ea");
        strings.add("Turcanu");
        List<String> reversedStrings = getReversedFiltred(strings);

        System.out.println(reversedStrings);
    }

    public static List<String> getReversedFiltred(List<String> strings) {
        ArrayList<String> filteredStrings = new ArrayList<>();
        for (String str : strings) {
            if (str.length() > 3) {
                filteredStrings.add(str);
            }
        }
        //public static List<String> getReversed(List<String> filteredStrings) {
        List<String> reversedStrings = new ArrayList<>();
        //  for (int i >= 0; i < strings.size() - 1; i--) {
        for (int i = filteredStrings.size() - 1; i >= 0; i--) {
            reversedStrings.add(filteredStrings.get(i));
        }
        return reversedStrings;
    }
}
