package edu.ithaca.dragon.shapes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ShapeMain {
    public static void printRectangles(ArrayList<Rectangle> arr){
        int i=0;
        Rectangle rect;
        while (i<5){
            rect = arr.get(i);
            System.out.println("Rectangle " + (i+1) + " area: " + rect.calcArea() + ", diagonal: " + rect.longestLineWithin());
            i++;
        }
    }

    public static void main(String[] args){
        //Make a list of 5 randomly-sized rectangles and print their area and the largest line that can be drawn through them
        //Allow the user to choose one, double the size of that one, and print them all again
        //Use a loop to repeat the process 5 times
        Random geRandom = new Random();

        List<Shape> shapes = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int selection = geRandom.nextInt(1,4);
            if (selection == 1){
                shapes.add(new Circle(geRandom.nextDouble(1,100)));
                System.out.println(shapes.get(i));
            }
            else if (selection == 2){
                shapes.add(new Rectangle(geRandom.nextDouble(1,100), geRandom.nextDouble(1,100)));
                System.out.println(shapes.get(i));
            }
            else{
                shapes.add(new Triangle(geRandom.nextDouble(1,100), geRandom.nextDouble(1,100)));
                System.out.println(shapes.get(i));
            }
        }

        System.out.println("\n\n\n");
        
        for (int i = 0; i < 10; i++) {
            Shape shape = shapes.get(i);
            shape.doubleSize();
            System.out.println(shape);
        }
        
        System.out.println("\n\n\n");
        // OLD CODE
        // Generate rectangles
        ArrayList<Rectangle> rects =new ArrayList<>();
        int i=1;
        Rectangle rect;
        while (i<6){
            rect = new Rectangle(geRandom.nextInt(1,100), geRandom.nextInt(1,100));
            rects.add(rect);
            i++;
        }
        
        Scanner form = new Scanner(System.in);
        String whichStr;
        int whichInt;
        i = 1;
        while (i<6){
            printRectangles(rects);
            System.out.println("Which rectangle do you want to double?");
            // Get number from keyboard
            whichStr = form.nextLine();
            whichInt = Integer.parseInt(whichStr);
            // Doesn't catch index errors
            rects.get(whichInt-1).doubleSize();
            i++;
        }
        printRectangles(rects);
    }

}
