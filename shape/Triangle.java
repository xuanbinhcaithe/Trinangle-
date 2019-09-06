package OOP.shape;

import MangTrongJava.IllegalTriangleException;

public class Triangle extends Shape{
    private double side1 = 1;
    private double side2 =1;
    private double side3 =1;
    public Triangle() {
    }
    public Triangle(double side1,double side2,double side3 ) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(String color, boolean filled, double side1, double side2, double side3) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
    public double getPerimeter() {
        double perimeter = this.side1 + this.side2 + this.side3;
        try {
            MangTrongJava.IllegalTriangleException.check(getSide1(),getSide2(),getSide3());
        }catch (IllegalTriangleException e) {
            System.out.println("đây không phải 3 cạnh của tam giác");
        }
        return perimeter;
    }
    @Override
    public String toString() {
        return "A triangle wiht side1 = " + getSide1() + " ,side2 = " + getSide2() + ",side3 = " + getSide3()
                + " and perimeter = " + getPerimeter()
                + ", which a subclass of " + super.toString() ;
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        System.out.println(triangle);
    }



}
