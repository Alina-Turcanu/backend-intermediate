package exercitii.ex13socialnetwork;

public class Main {

    public static void main(String[] args) {
        User user1 = new User("Ionut",new String[]{"fotbal", "sala","lectura"});
        User user2 = new User("Ioana",new String[]{"tenis", "sala","lectura","padure"});
        User user3 = new User("Zuckerberg",new String[]{"fotbal", "sala","lectura","fast-food"});
        User user4 = new User("lucian",new String[]{"schi", "sala"});
        User user5 = new User("Ioana",new String[]{"sala", "tenis","lectura"});
        user1.addFriend(user2);
        user1.addFriend(user3);
        user1.addFriend(user4);
        System.out.println(user1.isFriendSuggestion(user3));
        System.out.println(user4.isFriendSuggestion(user1));


        int x =3;


        System.out.println(user5.isFriendSuggestion(user2));
        System.out.println(user1.isFriendSuggestion(user2));
//        System.out.println(user1.getFriends()[0].getName());


        for (int i=0;i<user1.getNumberOfFriends(); i++) {
            //daca user-ul curent este null
            //user-ul de la pozitia i din array-ul de rpieteni ai user-ului 1
            System.out.println(user1.getFriends()[i].getName());

        }


    }
}
