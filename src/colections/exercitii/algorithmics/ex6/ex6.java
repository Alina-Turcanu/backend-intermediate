package colections.exercitii.algorithmics.ex6;

public class ex6 {
    // Gaseste diferenta maxima intre 2 numere dintr-o lista, astfel incat elementul mai mic
    // sa apara inaintea elementului mai mare
    //Exemplu:
    //
    //Input: [2,7,9,5,1,3,5]
    //Output: 7 (perechea de numere care indeplineste conditia este (2,9)

    public static void main(String[] args) {
        int[] numbers = {3, 8, 4, 5, 9, 1};
        Result result = getTeBiggestDifference(numbers);
        System.out.println("Cea mai mare diferență este: " + result.maxDifference);
        System.out.println("Numerele care au dus la aceasta sunt: " + result.firstNumber + " și " + result.secondNumber);
    }

    public static Result getTeBiggestDifference(int[] numbers) {
        int maxDifference = 0;
        int firstNumber = 0;
        int secondNumber = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] < numbers[j]) {
                    int currentDifference = numbers[j] - numbers[i];
                    if (currentDifference > maxDifference) {
                        maxDifference = currentDifference;
                        firstNumber = numbers[i];
                        secondNumber = numbers[j];
                    }
                }
            }
        }
        return new Result(maxDifference, firstNumber, secondNumber);
    }
}
