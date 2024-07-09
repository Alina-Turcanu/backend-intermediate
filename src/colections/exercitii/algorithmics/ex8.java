package colections.exercitii.algorithmics;

public class ex8 {
    // Gaseste un subarray dintr-un array, care sa aiba o anumita suma
    //Un subarray are capatul din stanga inaintea capatului din dreapta in array-ul original.
    // Array-ul original poate avea doar numere pozitive
    //
    //Exemplu:
    //
    //Input: [1,4,20,3,10,5], sum=33
    //Ouput:suma a fost gasita intre indicii 2 si 4 (20+3+10=33)
    //Input: [1,4], sum = 0
    //Output: niciun subarray nu a fost gasit
    public static void main(String[] args) {
        int[] prices = {3, 4, 5, 1};
        int sum = 7;
        int[] result = findTheSum(prices, sum);

        if (result != null) {
            System.out.println("Suma a fost gasita intre indicii:" + result[0] + ", " + result[1]);
        } else {
            System.out.println("Nu au fost gasite elemente care sa indeplineasca cerinta");
        }
    }

    public static int[] findTheSum(int[] prices, int sum) {
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[i] + prices[j] == sum) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}
