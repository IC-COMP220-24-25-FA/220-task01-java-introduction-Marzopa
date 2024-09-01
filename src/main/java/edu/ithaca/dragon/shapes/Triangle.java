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
        throw new Error("Not implemented");
    }

    public double longestLineWithin(){
        // Returns longest side(s)
        throw new Error("Not implemented");
    }
}
