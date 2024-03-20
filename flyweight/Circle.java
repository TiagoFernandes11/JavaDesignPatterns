package flyweight;

public class Circle extends Shape {
    private final String label;
    public Circle(){
        this.label = "Circle";
    }
    @Override
    public void draw(int radius, String fillColor, String lineColor) {
        System.out.println("Drawing a " + label + " with a radius " + radius + " fill color "
                + fillColor + " line color: " + lineColor);
    }
    public String getLabel() {
        return label;
    }
}
