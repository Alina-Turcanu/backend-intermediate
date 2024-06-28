package sesiunea11.ex6;

public class Main {
    public static void main(String[] args) {
        //### 6. Creeaza un cronometru
        //
        //Creează o clasă Timer care să gestioneze un cronometru. Clasa Timer va avea următoarele atribute:
        //
        //- timpul de start
        //- timpul de stop
        //- stare cronometru (pornit/oprit)
        //
        //Funcționalități:
        //
        //- pornirea cronometrului
        //- oprirea cronometrului
        //- resetarea cronometrului
        //- afișarea timpului scurs
        //
        //Cauta pe internet ce metode deja existente poti apela pentru a lucra cu timpul (de exemplu, cum poti sa vezi care este timpul prezent - atunci cand pornesti cronometrul


        Timer timer=new Timer();
        timer.start();
        timer.stop();
        System.out.println(timer.getElapsedTime());
    }
}
