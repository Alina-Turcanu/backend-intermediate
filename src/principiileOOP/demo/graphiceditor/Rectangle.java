package demo.graphiceditor;

public class Rectangle extends Shape{

    int width;

    int height;

    public Rectangle(String color, int width, int height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void draw(){
        System.out.println("drawing a circle with widht height " + width + " " + height);
    }
}
