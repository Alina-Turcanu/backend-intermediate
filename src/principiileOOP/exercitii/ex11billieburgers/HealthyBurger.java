package exercitii.ex11billieburgers;

public class HealthyBurger extends BaseBurger{
    public HealthyBurger( MeatType meat, Addition[] additions) {
        super("secara", meat, additions);
    }

    public void cook(){
        System.out.println("cooking a healthy burger");
    }


}
