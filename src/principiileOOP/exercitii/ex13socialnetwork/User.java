package exercitii.ex13socialnetwork;

//adaug this in lista lui newFriend
//        newFriend.getFriends()[newFriend.getNumberOfFriends()]=this;
//        newFriend.setNumberOfFriends(newFriend.getNumberOfFriends()+1);

import java.util.Arrays;

public class User {

    private String name;

    private String[] interests;

    private User[] friends;

    private int numberOfFriends;

    public User(String name, String[] interests) {
        this.name = name;
        this.interests = interests;
        this.friends = new User[10];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getInterests() {
        return interests;
    }

    public void setInterests(String[] interests) {
        this.interests = interests;
    }

    public User[] getFriends() {
        return friends;
    }

    public void setFriends(User[] friends) {
        this.friends = friends;
    }

    public int getNumberOfFriends() {
        return numberOfFriends;
    }

    public void setNumberOfFriends(int numberOfFriends) {
        this.numberOfFriends = numberOfFriends;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name;
    }

    public void addFriend (User newFriend){
        //adaug newFriend in lista lui this

        this.friends[numberOfFriends] = newFriend;
        this.numberOfFriends++;

        //adaug this in lista lui newFriend
        newFriend.friends[newFriend.numberOfFriends]=this;
        newFriend.numberOfFriends++;



//        newFriend.getFriends()[newFriend.getNumberOfFriends()] = this;
//        newFriend.setNumberOfFriends(newFriend.getNumberOfFriends()+1);
    }

    public boolean isFriendSuggestion (User potentialFriend){ //TODO de facut
        //returnam true daca user-ul primit ca parametru are minim 3 interese la fel cu userul this
        //   (pe care se apeleaza metoda)
        int counter=0;
        //parcurg lista de interese a user-ului this
        for(int i=0; i<this.interests.length; i++){
            //parcurg lista de interese a user-ului potentialFriend
            for(int j=0; j<potentialFriend.interests.length; j++){
                //daca interesul curent din lista lui this este egal cu interesul din lista lui potentialFeind
               if(this.interests[i].equals(potentialFriend.interests[j])){
                   //numar inca un interes comun
                   counter++;
                   //daca am ajuns la 3 interese
                   if(counter==3){
                       //inseamna ca e sugestie
                       return true;
                   }
               }
            }
        }
        return false;
    }
}
