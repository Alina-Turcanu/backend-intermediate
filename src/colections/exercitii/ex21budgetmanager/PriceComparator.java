package colections.exercitii.ex21budgetmanager;


import java.util.Comparator;

public class PriceComparator implements Comparator<Purchase> {


    @Override
    public int compare(Purchase p1, Purchase p2) {
        return Double.compare(p1.getPrice(),p2.getPrice());
    }
}
