package edu.ithaca.dragon.shapes;

public class Triangle implements Shape {
    private double base;
    private double height;

    public Triangle(double b, double h){
        // Makes isosceles triangle 
        base = b;
        height = h;
    }

    @Override
    public double calcArea(){
        return base * height / 2;
    }

    @Override
    public void doubleSize(){
        base = base*2;
        height = height*2;
    }

    @Override
    public double longestLineWithin(){
        // Returns longest side(s)
        return Math.sqrt(Math.pow((base/2),2) + Math.pow(height,2));
    }

    @Override
    public String toString(){
        return "A Triangle with base " + base + " and height " + height;
    }
}
