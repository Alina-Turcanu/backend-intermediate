package colections.exercitii.ex21budgetmanager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static colections.exercitii.ex21budgetmanager.Category.CLOTHES;
import static colections.exercitii.ex21budgetmanager.Category.ELSE;

public class Main {
    public static void main(String[] args) {


        List<Purchase> purchases = new ArrayList<>();
        Purchase purchase1 = new Purchase("Bluza", 300, CLOTHES);
        Purchase purchase2 = new Purchase("Sandale", 150, CLOTHES);
        Purchase purchase3 = new Purchase("Cinema", 200, Category.DISTRACTION);
        Purchase purchase4 = new Purchase("Ciocolata", 100, Category.EAT);
        Purchase purchase5 = new Purchase("tralala", 200, Category.ELSE);
        purchases.add(purchase1);
        purchases.add(purchase2);
        purchases.add(purchase3);
        purchases.add(purchase4);
        purchases.add(purchase5);
        User user = new User(purchases, 5000);
        System.out.println(user.getPurchases());
        System.out.println("Clothes purchases:" + user.getAllPurchasesByCategory(CLOTHES));
        System.out.println("Toate cheltuielile grupate pe categorii sunt:" + user.groupPurchasesByCategory());
        System.out.println("Categoria cu cele mai mari cheltuieli ale User-ului1 este:" + user.getHigherPurchase());
        System.out.println("Categoria cu cele mai mici cheltuieli ale User-ului1 este:" + user.getLessPurchase());
        System.out.println("Toate cheltuielile din intervalul ales sunt" + user.getSpendingByInterval(100, 200));

        //Sortarea tuturor cheltuielilor dupa pret
        Collections.sort(purchases);
        System.out.println("Cheltuielile sortate dupa pret sunt:");
        for (Purchase purchase : purchases) {
            System.out.println(purchase);
        }

//Sortarea cheltuielilor dintr-o anumita categorie dupa pret
        List<Purchase> clothesPurchases = new ArrayList<>();
        for (Purchase purchase : purchases) {
            if (purchase.getCategory() == Category.CLOTHES) {
                clothesPurchases.add(purchase);
            }
        }
        Collections.sort(clothesPurchases, new PriceComparator());
        System.out.println("Sortarea cheltuielilor din categoria " + "Clothes," + "dupa pret:");
        for (Purchase purchase : clothesPurchases) {
            System.out.println(purchase);
        }

       // Setarea unui buget
        user.setMaxbudget(6000);
        System.out.println("Suma disponibila in cont este de:" + user.getAvailableBuget());

//Adaugarea unei cheltuieli
        user.addPurchase(new Purchase("grgfv", 50, ELSE));
        System.out.println("Cheltuielile actualizate dupa adaugarea unei noi cheltuieli:" + purchases);

        //Stergerea unei cheltuieli
        user.removePurchase(purchase1);
        System.out.println("Cheltuielile actualizate dupa stergerea unei cheltuieli:" + purchases);
    }
}