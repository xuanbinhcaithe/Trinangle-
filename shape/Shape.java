package OOP.shape;
public class Shape {
    private String color = "green";
    private boolean filled = true;
    Shape() {
    }
    Shape(String color,boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean istFilled() {
        return this.filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "A shape with color "
                +this.color
                +",and "
                +(istFilled()?" filled ":" not filled ");
    }
}