package sesiunea11.ex7;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Fighter fighter1 = new Fighter("f1", 10, 2);
        Fighter fighter2 = new Fighter("f2", 10, 3);

        //System.out.println("introdu numele jucatorului care vrei sa atace primul");
        System.out.println(getWinner(fighter1, fighter2, "f1"));
    }

    public static String getWinner(Fighter fighter1, Fighter fighter2, String firstAttackerName) {

        Fighter firstAttacker;
        Fighter secondAttacker;
        if (firstAttackerName.equals(fighter1.name)) {
            firstAttacker = fighter1;
            secondAttacker = fighter2;
        } else {
            firstAttacker = fighter2;
            secondAttacker = fighter1;
        }

        while (true) {
            secondAttacker.health -= firstAttacker.damagePerAttack;
            if (secondAttacker.health <= 0) {
                return firstAttacker.name;
            }
            System.out.println("Viata ramasa a lui " + secondAttacker.name + " este de " + secondAttacker.health);
            firstAttacker.health -= secondAttacker.damagePerAttack;
            if (firstAttacker.health <= 0) {
                return secondAttacker.name;
            }
            System.out.println("Viata ramasa a lui " + firstAttacker.name + " este de " + firstAttacker.health);
        }

    }

}

//                                                      REZOLVAT!!!!


//6. Creeaza un mini joc de lupte
////Jocul trebuie sa aiba o functie care sa returneze numele castigatorului unei lupte la care participa doi luptatori.
//// Fiecare lupator ataca pe rand celalalt luptator si cel care il omoara pe celalalt primul, castiga (adica castiga cel care ramane in viata).
//// Un jucator moare atunci cand health-ul lui este mai mic sau egal cu 0. Un luptator are urmatoarele atribute:
////
////health
////damagePerAttack (cat din health i se scade celuilalt jucator, atunci cand jucatorul curent ataca)
////name Se vor citi de la tastatura atributele celor 2 jucatori, dar si care dintre jucatori va ataca primul.


