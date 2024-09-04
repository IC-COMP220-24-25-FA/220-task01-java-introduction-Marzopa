package edu.ithaca.dragon.shapes;

public class Rectangle implements Shape{
    private double length;
    private double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double calcArea(){
       return length * width;
    }

    public void doubleSize(){
        length = 2*length;
        width = 2*width;
    }

    public double longestLineWithin(){
        // Diagonal through pythagorean theorem
        return Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2));
    }
    
}
