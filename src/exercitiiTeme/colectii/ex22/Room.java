package exercitiiTeme.colectii.ex22;

import java.util.List;

public class Room {
    private int number;
    private int pricePerNight;
     final private int noOfPersons=1;
    private List<Booking> reservations;

    public Room(int number, int pricePerNight, List<Booking> reservations) {
        this.number = number;
        this.pricePerNight = pricePerNight;
        this.reservations = reservations;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(int pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public List<Booking> getReservations() {
        return reservations;
    }

    public void setReservations(List<Booking> reservations) {
        this.reservations = reservations;
    }

    public int getNoOfPersons() {
        return noOfPersons;
    }
}
