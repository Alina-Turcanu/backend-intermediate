package colections.exercitii.ex21budgetmanager;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class User {
    private List<Purchase> purchases;
    private int maxbudget;

    public User(List<Purchase> purchases, int maxbudget) {
        this.purchases = purchases;
        this.maxbudget = maxbudget;
    }

    public List<Purchase> getPurchases() {
        return purchases;
    }

    public void setPurchases(List<Purchase> purchases) {
        this.purchases = purchases;
    }

    public int getMaxbudget() {
        return maxbudget;
    }

    public void setMaxbudget(int maxbudget) {
        this.maxbudget = maxbudget;
    }

    public List<Purchase> getAllPurchasesByCategory(Category category) {
        List<Purchase> purchasesByCategory = new ArrayList<>();
        for (Purchase purchase : purchases) {
            if (purchase.getCategory().equals(category)) {
                purchasesByCategory.add(purchase);
            }
        }
        return purchasesByCategory;
    }
    //TODO de facut


    public Map<Category, List<Purchase>> groupPurchasesByCategory() {
        Map<Category, List<Purchase>> purchasesByCategory = new HashMap<>();
        for (Purchase purchase : purchases) {
            //daca categoria lui purchase nu se afla in mapa ca si cheie
            //punem in mapa cheia categoria lui purchase si valoarea o lista cu purchase curenta
            //altfel
            //adauga in lista (care e valoarea la cheia categoria lui purchase) pe purchase-ul curent
            if (!purchasesByCategory.containsKey(purchase.getCategory())) {
                List<Purchase> value = new ArrayList<>();
                value.add(purchase);
                purchasesByCategory.put(purchase.getCategory(), value);
            } else {
                purchasesByCategory.get(purchase.getCategory()).add(purchase);
            }
        }
        return purchasesByCategory;
    }

    @Override
    public String toString() {
        return "User{" +
                "purchases=" + purchases +
                ", maxbudget=" + maxbudget +
                '}';
    }


    //Vizualizarea categoriei in care a cheltuit cel mai mult/mai putin

    public Category getHigherPurchase() {
        double maxSpending = 0;
        Category maxCategory = null;
        for (Purchase purchase : purchases) {
            if (purchase.getPrice() > maxSpending) {
                maxSpending = purchase.getPrice();
                maxCategory = purchase.getCategory();
            }
        }
        return maxCategory;
    }

    public Category getLessPurchase() {
        double minSpending = Double.MAX_VALUE;
        Category minCategory = null;
        for (Purchase purchase : purchases) {
            if (purchase.getPrice() < minSpending) {
                minSpending = purchase.getPrice();
                minCategory = purchase.getCategory();
            }
        }
        return minCategory;
    }


    //Vizualizarea tuturor cheltuielilor dintr-un interval de pret

    public List<Purchase> getSpendingByInterval(int number1, int number2) {
        List<Purchase> allPurchasesByInterval = new ArrayList<>();
        for (Purchase purchase : purchases) {
            if (purchase.getPrice() >= number1 && purchase.getPrice() <= number2) {
                allPurchasesByInterval.add(purchase);
            }
        }
        return allPurchasesByInterval;
    }
//bugetul disponibil;
    public int getAvailableBuget() {
        int spentMoney = 0;
        for (Purchase purchase : purchases) {
            spentMoney += purchase.getPrice();
        }
        return maxbudget - spentMoney;
    }

    //Adaugarea unei cheltuieli
    public void addPurchase(Purchase purchase) {
        purchases.add(purchase);
    }

    //Stergerea unei cheltuieli
    public void removePurchase(Purchase purchase) {
        purchases.remove(purchase);
    }
}




