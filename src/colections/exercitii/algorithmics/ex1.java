package colections.exercitii.algorithmics;

import java.util.ArrayList;
import java.util.List;

public class ex1 {
    //1. Afla profitul maxim pe care il poti face cumparand si vanzand actiuni.
    //Ca si input ai un array cu preturile unei actiuni in fiecare zi. Va trebui sa determini in ce zi trebuie sa cumperi si in ce zi trebuie sa vinzi ca sa obtii profitul maxim
    //
    //Exemplu:
    //
    //Input: [100, 180, 260, 310, 40, 535, 695]
    //Output: Cumpara in ziua 5 (la pretul de 40) si vinde in ziua 7 (la pretul de 695), adica profit maxim 695-40=655
    //Input2: [2, 3, 10, 6, 4, 8, 1]
    //Output: Cumpara in ziau 0 (la pretul de 2) si vinde in ziua 2 (la pretul de 10), adica profit maxim 10-2=8

    public static void main(String[] args) {
        List<Integer> actions = new ArrayList<>();
        actions.add(44);
        actions.add(100);
        actions.add(400);
        actions.add(10);
        actions.add(150);
        actions.add(500);
        Integer theLessPayment = getTheLessPayment(actions);
        Integer index1 = actions.indexOf(theLessPayment);
        Integer theHighestSale= getTheHighestSale(actions);
        Integer index2 = actions.indexOf(theHighestSale);
        int theProfit = getTheProfit(theHighestSale, theLessPayment);
        System.out.println("Cumpara in ziua " + index1 + " (la pretul de " + theLessPayment + ") si vinde in ziua " + index2 + " (la pretul de " + theHighestSale + ")");
        System.out.println("Profitul va fi de: "+theProfit);
    }

    public static Integer getTheLessPayment(List<Integer> actions) {
        Integer minValue = Integer.MAX_VALUE;
        for (Integer action : actions) {
            if (action < minValue) {
                minValue = action;
            }
        }
        return minValue;
    }

    public static Integer getTheHighestSale(List<Integer> actions) {
        Integer maxValue = Integer.MIN_VALUE;
        for (Integer action : actions) {
            if (action > maxValue) {
                maxValue = action;
            }
        }
        return maxValue;
    }

    public static int getTheProfit(int theHighestSale, int theLessPayment) {
        return theHighestSale - theLessPayment;
    }
}
