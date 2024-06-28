package demo.graphiceditor;

public class Circle extends Shape{

    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void draw(){
        System.out.println("drawing a circle with radius " + radius);
    }
}
