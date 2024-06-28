package exercitii.perimeterchallenge;

import java.util.Arrays;

public class Shape {

    private Point[] points;

    private int numberOfPoints;

    public Shape() {
        this.points = new Point[10];
    }

    public Point[] getPoints() {
        return points;
    }

    public void setPoints(Point[] points) {
        this.points = points;
    }

    public int getNumberOfPoints() {
        return numberOfPoints;
    }

    public void setNumberOfPoints(int numberOfPoints) {
        this.numberOfPoints = numberOfPoints;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "points=" + Arrays.toString(points) +
                ", numberOfPoints=" + numberOfPoints +
                '}';
    }
}
