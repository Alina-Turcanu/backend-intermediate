package exercitiiTeme.Lambda;

import java.util.function.Function;

public class ex1 {
    //Rescrie urmatoarea metoda ca o expresie lambda:
    //public static String everySecondChar(String source) {
    //            StringBuilder returnVal = new StringBuilder();
    //            for (int i = 0; i < source.length(); i++) {
    //                if (i % 2 == 1) {
    //                    returnVal.append(source.charAt(i));
    //                }
    //            }
    //            return returnVal.toString();
    //        }
    //In primul rand, cauta pe Google si/sau ChatGPT si/sau in documentatia din IntelliJ ce face StringBuilder si metoda append.
    //
    //Apoi rescrie functia clasica ca o functie lambda.
    //
    //Apoi executa acea functie lambda si paseaza-i ca parametru: "1234567890".
    //
    //Apoi creeaza o noua functie clasica numita everySecondCharacter()
    // care accepta ca si parametru o functie lambda si un alt String.
    // Executa functia lamba in cadrul metodei everySecondCharacter(),
    // si apeleaza everySecondCharacter() pasandu-i functia lambda creata

    public static void main(String[] args) {
        Function<String, String> everySecondChar = source -> {
            StringBuilder returnVal = new StringBuilder();
            for (int i = 0; i < source.length(); i++) {
                if (i % 2 == 1) {
                    returnVal.append(source.charAt(i));
                }
            }
            return returnVal.toString();
        };

        // Testarea expresiei lambda
        String result = everySecondChar.apply("1234567890");
        System.out.println(result);

        everySecondCharacter(everySecondChar,"1234");

    }

    public static void everySecondCharacter(Function<String,String>everySecondChar,String string){
    }
}
