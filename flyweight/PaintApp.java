package flyweight;

public class PaintApp {
    public void render(int numberOfShapes){
        Shape shape = null;
        for(int i = 1; i <= numberOfShapes; i++){
            if(i % 2 == 0){
                shape = ShapeFactory.getShape("circle");
                shape.draw(i, "Blue", "Black");
            }else {
                shape = ShapeFactory.getShape("rectangle");
                shape.draw(i, 2 * i, "Dotted");
            }
        }
    }
}
