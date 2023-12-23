package models;


import java.util.ArrayList;

public class Shape {
    private ArrayList<Point> pointList;

    public Shape(){ // Constructor to initialize a shape with an ArrayList of points
        pointList = new ArrayList<>();
    }

    public void addPoint(Point point){ // Add a point to the shape
        pointList.add(point);
    }


    public double CalcPer(){ // Calculate the perimeter of the shape
        double P = 0;
        int len = pointList.size();

        for(int i = 0; i < len; i++){
            Point first_p = pointList.get(i);
            Point second_p = pointList.get((i+1) % len);
            P += first_p.Distance(second_p);
        }

        return P;
    }

    public double FindLongestSide(){ // Find the length of the longest side in the shape
        double max = 0;
        int len = pointList.size();

        for(int i = 0; i < len; i++){
            for (int j = 0; j < len; j++){
                double length = pointList.get(i).Distance(pointList.get(j));
                max = Math.max(max, length); // Checking for what is more and swap if need
            }
        }

        return max;

    }

    public double FindAvgSide(){ // Calculate the average length of the sides in the shape
        double All = 0;
        int NumberOfSides = pointList.size(); //Numbers of Sides

        for (int i = 0; i < NumberOfSides; i++) {
            Point first = pointList.get(i);
            Point second = pointList.get((i + 1) % NumberOfSides);
            All += first.Distance(second); //Adding side to the All variable in each loop
        }

        return All / NumberOfSides;
    }

}
