package sesiunea10.OOPintro.ex4;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(200,"Audi","red");
        Car car2 = new Car(200,"BMW","blue");
        car1.startCar();
        car2.startCar();
        System.out.println(car1.currentGear);
        System.out.println(car1.currentSpeed);
        System.out.println(car2.currentSpeed);
        System.out.println(car2.currentSpeed);
        car1.accelerate(30);
        System.out.println(car1.currentSpeed);
        System.out.println(car1.currentGear);
        car2.accelerate(15);
        System.out.println(car2.currentSpeed);
        System.out.println(car2.currentGear);

        System.out.println(Car.numberOfWheels);
        System.out.println(Car.convertFromKmToMiles(100));



    }





}
