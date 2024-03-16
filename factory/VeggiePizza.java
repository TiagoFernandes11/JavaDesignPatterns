package factory;

public class VeggiePizza  implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing a Veggie Pizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking a Veggie Pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cuting a Veggie Pizza");
    }
}