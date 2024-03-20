package flyweight;

public class Rectangle extends Shape{
    private final String label;
    public Rectangle(){
        this.label = "Rectangle";
    }
    @Override
    public void draw(int length, int breadth, String fillStyle) {
        System.out.println("Drawing a " + label + " with a legth " + length + " woth breadth "
                + breadth + " fill style: " + fillStyle);
    }

    public String getLabel() {
        return label;
    }
}
