package sesiunea10.OOPintro.ex4;



//4. Creeaza un program care sa simuleze o masina
//Clasa Car are urmatoarele atribute:
//
//numar de roti
//viteza maxima
//brand
//culoare
//viteza curenta
//treapta curenta de viteza
//Clasa Car are urmatoarele functionalitati:
//
//porneste masina (treapta de viteza devine 1 si viteza curenta devine 1)
//accelereaza (mareste viteza curenta cu o anumita valoare, iar daca se accelereaza cu mai mult de 20 km/ora, treapta de viteza se mareste automat)
//decelereaza (scade viteza curenta cu o anumita valoare, iar daca se decelereaza cu mai mult de 20 km/ora, treapta de viteza se scade automat)
//mareste treapta de viteza
//scade treapta de viteza
//converteste o anumita valoare a vitezei din km/ora in mile/ora
//Creeaza mai multe masini in Main si apeleaza-le comportamentele.
public class Car {

    static final int numberOfWheels = 4;
    int topSpeed;
    String brand;
    String color;

    int currentSpeed;
    int currentGear;

    public Car(int topSpeed, String brand, String color) {
        this.topSpeed = topSpeed;
        this.brand = brand;
        this.color = color;
    }

    public void startCar(){
        this.currentGear = 1;
        this.currentSpeed = 1;
    }

    public void accelerate(int extraSpeed) {
        if (extraSpeed > 20){
            gearUp();
        }
        this.currentSpeed += extraSpeed;
    }

    public void gearUp(){
        this.currentGear++;
    }

    public void gearDown(){
        this.currentGear--;
    }

    public static double convertFromKmToMiles (int speed){

        return 0.62*speed;
    }

}
