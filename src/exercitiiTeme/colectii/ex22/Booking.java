package exercitiiTeme.colectii.ex22;

public class Booking {
    private Double checkIn;
    private Double checkOut;

    public Booking(Double checkIn, Double checkOut) {
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Double getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(Double checkIn) {
        this.checkIn = checkIn;
    }

    public Double getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(Double checkOut) {
        this.checkOut = checkOut;
    }
}

