package edu.ithaca.dragon.shapes;

import java.util.ArrayList;
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

        // Generate rectangles
        ArrayList<Rectangle> rects =new ArrayList<>();
        Random geRandom = new Random();
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
