package OOP.shape;

import javax.crypto.spec.PSource;

public class Circle extends Shape{
    private double radius = 1;
    Circle() {
    }
    Circle(double radius) {
        this.radius = radius;
    }
    Circle(double radius,String color, boolean filled) {
        this.radius = radius;
        setColor(color);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea () {
        return this.radius*this.radius*Math.PI;
    }
    public double getPerimeter() {
        return this.radius*2*Math.PI;
    }
    @Override
    public String toString() {
        return "A circle with radius "
                + getRadius()
                +",which a subclass of "
                +super.toString();
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
    }
}
