package exercitiiTeme.Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ex4 {
    //Proceseaza urmatoarea lista de nume:
    //Scrie codul astfel incat sa sortezi lista si astfel incat fiecare nume sa inceapa cu litera mare.
    //
    //De exemplu, numele "harry" va deveni "Harry" si va fi intre "Emily" si "Isla".
    //
    //List<String> topNames2015 = Arrays.asList(
    //                "Amelia",
    //                "Olivia",
    //                "emily",
    //                "Isla",
    //                "Ava",
    //                "oliver",
    //                "Jack",
    //                "Charlie",
    //                "harry",
    //                "Jacob"
    //        );
    //Apoi, in loc sa sortezi lista, afla de cate nume care incep cu 'A' sunt in lista.
    public static void main(String[] args) {
        List<String> topNames2015 = Arrays.asList(
                "Amelia",
                "Olivia",
                "emily",
                "Isla",
                "Ava",
                "oliver",
                "Jack",
                "Charlie",
                "harry",
                "Jacob"
        );
        List<String> makeFirstLetterBig = topNames2015.stream()
                .map(name -> name.toUpperCase())
                .sorted()
                .collect(Collectors.toList());

        System.out.println(makeFirstLetterBig);

        Long changedList = topNames2015.stream()
                .map(name -> name.toUpperCase())
                .filter(name -> name.startsWith("A"))
                .count();

        System.out.println(changedList);
    }
}
