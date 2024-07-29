package exercitiiTeme.Lambda;

import java.util.function.Supplier;


public class ex3 {
    //    //3. Scrie o functie lambda care sa returneze string-ul "Imi place Java".
//    //Functia lambda va implementa interfata functionala Supplier si va fi asignata unei variabile.
//    //
//    //Executa apoi functia lambda scrisa
//
    public static void main(String[] args) {

        Supplier<String> supplier = () -> "Îmi place Java";

        System.out.println(supplier.get());
    }
}
