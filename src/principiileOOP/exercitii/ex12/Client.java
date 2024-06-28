package exercitii.ex12;

public class Client extends User {


    private int[] borrowedBooksCodes;
    public Client(String name, int[]borrowedBooksCodes) {
        super(name);
        this.borrowedBooksCodes = new int[100];
    }
}
