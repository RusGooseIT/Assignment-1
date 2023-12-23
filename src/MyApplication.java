

import models.Point;
import models.Shape;



import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyApplication {


    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("D:\\JAVA OOP\\Assignment 1\\src\\source.txt"); // Creating File with path to "source.txt"

        Scanner scan = new Scanner(file); // Creating Scanner for input file
        Shape shape = new Shape(); // Creating Shape

        while(scan.hasNext()){
            double x = scan.nextDouble(); // Take value of X from file
            double y = scan.nextDouble(); // Take value of Y from file

            Point point = new Point(x, y);
            shape.addPoint(point);
        }

        System.out.println("Perimeter: " + shape.CalcPer()); //Output the value of Perimeter
        System.out.println("Longest Side: " + shape.FindLongestSide()); //Output the value of LongestSide
        System.out.println("Avg Side: " + shape.FindAvgSide()); //Output the value of Average Side




    }

}
