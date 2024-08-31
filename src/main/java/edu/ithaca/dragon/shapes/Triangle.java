package edu.ithaca.dragon.shapes;

public class Triangle {
    private double base;
    private double height;

    public Triangle(double b, double h){
        base = b;
        height = h;
    }

    public double calcArea(){
        throw new Error("Not implemented");
    }

    public void doubleSize(){
        throw new Error("Not implemented");
    }
}
