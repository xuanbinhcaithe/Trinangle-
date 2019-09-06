package OOP.shape;

import OOP.shape.Rectangle;

public class SquaTest extends Rectangle {
    public SquaTest() {
    }
    public SquaTest(double side) {
        super(side,side);
    }
    public SquaTest(double side,String color , boolean filled) {
        super(side,side,color,filled);
    }
    public double getSide() {
        return this.getSide();
    }
    public void setSide(double side) {
        setWidth(side);
        setHeight(side);
    }
    @Override
    public void setWidth(double width){
        setSide(width);
    }
    @Override
    public void setHeight(double height) {
        setSide(height);
    }

    public static void main(String[] args) {
        SquaTest squaTest = new SquaTest();
        System.out.println(squaTest);

        squaTest = new SquaTest(4);
        System.out.println(squaTest);

        squaTest = new SquaTest(5.4,"yellow",true);

        System.out.println(squaTest);
    }
}