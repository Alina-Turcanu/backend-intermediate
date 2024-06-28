package demo.graphiceditor;

public class Brush implements Drawable{

    private int strokeWidth;

    public Brush(int strokeWidth) {
        this.strokeWidth = strokeWidth;
    }

    public int getStrokeWidth() {
        return strokeWidth;
    }

    public void setStrokeWidth(int strokeWidth) {
        this.strokeWidth = strokeWidth;
    }

    @Override
    public void draw() {
        System.out.println("brush drawing with "+strokeWidth);
    }
}
