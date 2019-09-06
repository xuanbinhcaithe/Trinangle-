package OOP.shape;

import javax.crypto.spec.PSource;

public class Rectangle extends Shape{
    public double width;
    public double height;
    Rectangle(){
    }
    Rectangle(double width,double height) {
        this.width = width;
        this.height = height;
    }
    Rectangle(double width,double height,String color,boolean filled) {
        this.width = width;
        this.height = height;
        setColor(color);
        setFilled(filled);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea() {
        return this.width*this.height;
    }
    public double getPerimeter() {
        return (this.width + this.height)*2;
    }
    @Override
    public String toString() {
        return  "A rectangle with width "
                + getWidth()
                +" ,and height "
                +getHeight()
                +",wich a subclass of"
                +super.toString();
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(4.5,2);
        System.out.println(rectangle);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
    }
}