package exercitii.compositionsmartkitchen;

public class SmartKitchen {

    private CoffeeMaker brewMaster;
    private Refrigerator iceBox;
    private DishWasher dishWasher;



    public SmartKitchen(CoffeeMaker coffeeMaker, Refrigerator refrigerator, DishWasher dishWasher) {
        this.brewMaster = coffeeMaker;
        this.iceBox = refrigerator;
        this.dishWasher = dishWasher;

    }

    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public void setBrewMaster(CoffeeMaker brewMaster) {
        this.brewMaster = brewMaster;
    }

    public void setIceBox(Refrigerator iceBox) {
        this.iceBox = iceBox;
    }

    public void setDishWasher(DishWasher dishWasher) {
        this.dishWasher = dishWasher;
    }

    public void setKitchenState(boolean coffeeFlag, boolean fridgeFlag, boolean dishWasherFlag) {

        brewMaster.setHasWorkToDo(coffeeFlag);
        iceBox.setHasWorkToDo(fridgeFlag);
        dishWasher.setHasWorkToDo(dishWasherFlag);
    }

    public void doKitchenWork() {
        brewMaster.brewCoffee();
        iceBox.orderFood();
        dishWasher.doDishes();
    }
}





