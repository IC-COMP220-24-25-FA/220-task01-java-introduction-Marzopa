package edu.ithaca.dragon.shapes;

public class Circle implements Shape {
    private double radius;

    /**
     * @throws IllegalArgumentException if radius is not a positive number
     */
    public Circle(double radius){
        this.radius = radius;
        if (radius == 0){
            throw new IllegalArgumentException("Radius cannot be zero");
        }
    }

    public double getRadius(){
        return radius;
    }

    /**
     * @return the area of this circle
     */
    @Override
    public double calcArea(){
        return Math.PI *  Math.pow(radius, 2);
    }

    /**
     * @post doubles the size of this circle
     */
    @Override
    public void doubleSize(){
        radius = radius * 2;
    }

    /**
     * @return the longest straight line that can be drawn within this circle
     */
    @Override
    public double longestLineWithin(){
        return 2 * radius;
    }

    @Override
    public String toString(){
        return "A Circle with radius " + radius;
    }
}
