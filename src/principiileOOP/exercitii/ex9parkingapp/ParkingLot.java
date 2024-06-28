package exercitii.ex9parkingapp;

public class ParkingLot {

    private Car[] parkingSpots;


    public ParkingLot(int numberOfSpots) {
        this.parkingSpots = new Car[numberOfSpots];
    }

    public Car[] getParkingSpots() {
        return parkingSpots;
    }

    public void setParkingSpots(Car[] parkingSpots) {
        this.parkingSpots = parkingSpots;
    }

    public boolean park (Car car){
        //gasesc primu loc liber din array-ul de masini al parcarii this
        for (int i = 0; i < parkingSpots.length; i++) {
            if (parkingSpots[i]==null){
                //parchezi la pozitia i
                parkingSpots[i] = car;
                System.out.println("Masina cu numarul "+ car.getRegistrationNumber()+" a parcate pe locul "+i );
                return true;
            }
        }
        System.out.println("nu exista loc liber");
        return false;
    }

    public boolean leave(String registrationNumber){
        for (int i = 0; i < parkingSpots.length; i++) {
            //daca numarul primita ca paremtru este egal cu numarul masinii curente
            if (parkingSpots[i]!=null && registrationNumber.equals(parkingSpots[i].getRegistrationNumber())){
                parkingSpots[i]=null;
                System.out.println("Masina cu numarul " + registrationNumber + " a parasit parcarea");
                return true;
            }
        }
        System.out.println("Nu exista masina cu numarul " + registrationNumber);
        return false;
    }

    public void status(){

        boolean atLeastOneSpotOccupied = false;
        boolean atLeastOneSpotFree = false;
        for (int i = 0; i < parkingSpots.length; i++) {
            if (parkingSpots[i] == null){
                System.out.println("locul "+i+" este liber");
                atLeastOneSpotFree = true;
            } else {
                atLeastOneSpotOccupied = true;
                System.out.println("locul "+i+" este ocupat de " + parkingSpots[i].getRegistrationNumber());
            }
        }
        if (!atLeastOneSpotOccupied){
            System.out.println("parcarea este goala");
        }

        if (!atLeastOneSpotFree){
            System.out.println("parcarea este plina");
        }
    }

    public void status2(){
        boolean atLeastOneSpotOccupied = false;
        for (int i = 0; i < parkingSpots.length; i++) {
            if (parkingSpots[i]!=null){
                atLeastOneSpotOccupied = true;
                System.out.println("locul "+ i + " ocupat de "+ parkingSpots[i].getRegistrationNumber());
            }
        }
        if (!atLeastOneSpotOccupied){
            System.out.println("parcarea este goala");
        }
    }
}
