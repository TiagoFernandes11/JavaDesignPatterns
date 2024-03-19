package template;

public class Test {

    public static void main(String[] args) {
        DataRenderer dataRenderer = new XMLDataRenderer();
        DataRenderer dataRenderer2 = new CSVDataRenderer();

        dataRenderer.render();
        dataRenderer2.render();

    }
}
