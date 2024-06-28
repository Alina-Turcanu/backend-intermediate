package demo.game;

public class Game {

    public static void main(String[] args) {
//        Archer archer = new Archer("Legolas", 31, 100);
//        Wizard wizard = new Wizard("Gandalf", 75, 1000);
//        System.out.println(wizard instanceof Wizard);
//        System.out.println(wizard instanceof PlayerCharacter);
//        System.out.println(archer instanceof Object);


        PlayerCharacter player = new Archer("Legolas", 31, 100);
        player.attack();

        PlayerCharacter player2 = new Wizard("Gandalf",75,1000);
        player2.attack();

        doAllPlayerActions(player);

        player.levelUp();
        player2.levelUp();



    }

    public static void doAllPlayerActions(PlayerCharacter playerCharacter){
        playerCharacter.speak();
        playerCharacter.attack();
    }


}
