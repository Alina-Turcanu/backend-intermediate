package temeSda2;

public class ex8 {
    //8. Scrie o functie care accepta un numar n si printeaza urmatorul pattern de marime n:
    //Exemplu, pentru n = 7:
    //
    //Input : 7
    //Output :
    //
    //    *******
    //    **   **
    //    * * * *
    //    *  *  *
    //    * * * *
    //    **   **
    //    *******


    public static void printPattern(int n) {
        // Prima linie
        printLineOfStars(n);

        // Linii intermediare
        for (int i = 1; i < n - 1; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || j == n - i - 1) {
                    System.out.print("*");
                } else if (i > n / 2 && (j == n - i - 1 || j == i)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // Ultima linie
        printLineOfStars(n);
    }

    private static void printLineOfStars(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = 7; // Puteți schimba valoarea lui n pentru alte dimensiuni
        printPattern(n);
    }
}

