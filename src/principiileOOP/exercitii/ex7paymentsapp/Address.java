package exercitii.ex7paymentsapp;

public class Address {

    private String street;
    private String number;
    private String city;

    public Address(String city, String number, String street) {
        this.city = city;
        this.number = number;
        this.street = street;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
