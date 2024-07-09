package exercitiiTeme.Sda2;

public class ex4 {
    //4. Scrie o functie care primeste un string, in care exista mai multe cuvinte separate prin spatiu.
    //Returneaza cel mai lung cuvant din acel string.

    public static void main(String[] args) {

        String[] strings = {"geaca tricou pantaloni maieu bluza"};
        System.out.println("Cel mai lung cuvant din lista este: " + getTheLongestWord(strings));

    }

    public static String getTheLongestWord(String[] strings) {
        String longestWord = "";

        for (String str : strings) {
            String[] words = str.split(" ");
            for (String word : words) {
                if (word.length() > longestWord.length()) {
                    longestWord = word;
                }
            }
        }
        return longestWord;
        }
    }