package exercitiiTeme.colectii.ex22;

import java.util.List;

public class User {
    private String firstName;
    private String lastName;


    private List<Booking>listOfReservations;

    public User(String firstName, String lastName, List<Booking> listOfReservations) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.listOfReservations = listOfReservations;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Booking> getListOfReservations() {
        return listOfReservations;
    }

    public void setListOfReservations(List<Booking> listOfReservations) {
        this.listOfReservations = listOfReservations;
    }
}
