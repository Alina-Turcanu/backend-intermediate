package demo.exceptions;

public class OnlineShop {
    public static void main(String[] args) {
        User user = new User("Ionut");
        try {
            user.setEmail("sdfdfs@fsgdg");
        } catch (InvalidEmailException e){
            System.out.println(e.getMessage());
        }
    }
}
