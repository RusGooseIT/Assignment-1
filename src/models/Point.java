package models;

import java.lang.Math;

public class Point {

    private double x;
    private double y;

    public Point(double x, double y){ // Constructor to initialize a point with given x and y coordinates

        this.x = x;
        this.y = y;

    }

    public double getX() {

        return x;

    }

    public double getY() {

        return y;

    }

    public double Distance(Point diff){ // Calculate distance to another point

        double res = Math.sqrt(Math.pow(diff.getX() - this.x, 2) + Math.pow(diff.getY() - this.y, 2));
        return res; // Result

    }

    public String ToString(){ //  Provide a string representation of the point
        return String.format("(%f, %f)", this.x, this.y);
    }
}
