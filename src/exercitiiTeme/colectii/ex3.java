package exercitiiTeme.colectii;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ex3 {
    //3. Scrie o metoda care:
    //Gaseste cuvantul cel mai lung dintr-o lista de cuvinte (primita ca parametru),
    // si il returneaza
    //Exemplu:
    //Input: {“ana”, “are”, “mere”}
    //Output: “mere”


    public static void main(String[] args) {
        Set<String> words = new HashSet<>();
        //  Set <String> words1 =new HashSet<>(Arrays.asList("aluna", "padure")) ;
        words.add("alee");
        words.add("masina");
        words.add("tiribomba");

        System.out.println("Cel mai lung cuvant este: " + getTheLongestWord(words));
        System.out.println("Cel mai scurt cuvand este: " + getTheShortestWord(words));

    }

    public static String getTheLongestWord(Set<String> words) {
        String longestWord = "";
        for (String word : words) {
            // Compararea lungimii stringului curent cu lungimea celui mai lung string găsit până acum
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }

    public static String getTheShortestWord(Set <String> words){
        String shortestWord = null;
        for(String word : words){
            if  (shortestWord == null || word.length() < shortestWord.length()){
                shortestWord=word;
            }
        }
        return shortestWord;
    }
}