package factory;

public class CheesePizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing a Cheese Pizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking a Cheese Pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cuting a Cheese Pizza");
    }
}