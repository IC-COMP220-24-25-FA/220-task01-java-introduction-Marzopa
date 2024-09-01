package edu.ithaca.dragon.shapes;

public class Triangle {
    private double base;
    private double height;

    public Triangle(double b, double h){
        // Makes isosceles triangle 
        base = b;
        height = h;
    }

    public double calcArea(){
        return base * height / 2;
    }

    public void doubleSize(){
        base = base*2;
        height = height*2;
    }

    public double longestLineWithin(){
        // Returns longest side(s)
        return Math.sqrt(Math.pow((base/2),2) + Math.pow(height,2));
    }
}
