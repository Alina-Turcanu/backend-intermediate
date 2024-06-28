package demo.graphiceditor;

public class Main {

    public static void main(String[] args) {
        Drawable[] tools = {new Brush(3), new Pencil(), new Circle("red",5), new Rectangle("blue",4,5)};


        for (int i = 0; i < tools.length; i++) {
            tools[i].draw();
        }
    }
}
