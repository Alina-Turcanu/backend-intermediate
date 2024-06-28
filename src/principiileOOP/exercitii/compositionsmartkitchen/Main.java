package exercitii.compositionsmartkitchen;

public class Main {

    public static void main(String[] args) {


        SmartKitchen kitchen = new SmartKitchen(new CoffeeMaker(), new Refrigerator(), new DishWasher());

        //test

//      varianta 1
//      decomenteaza liniile 10-16 (si ruleaza aplicatia) pentru a observa prima varianta in care interactionezi cu obiectele din aplicatie

        /*kitchen.getDishWasher().setHasWorkToDo(true);
        kitchen.getIceBox().setHasWorkToDo(true);
        kitchen.getBrewMaster().setHasWorkToDo(true);

        kitchen.getDishWasher().doDishes();
        kitchen.getIceBox().orderFood();
        kitchen.getBrewMaster().brewCoffee();*/

        //varianta 2
        //decomenteaza  apoi liniile 21-22 pentru a observa prima varianta in care interactionezi cu obiectele din aplicatie
        kitchen.setKitchenState(true, true, true);
        kitchen.doKitchenWork();

        kitchen.setBrewMaster(new CoffeeMaker());

    }
}
