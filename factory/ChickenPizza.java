package factory;

public class ChickenPizza  implements Pizza{
    @Override
    public void prepare() {
        System.out.println("Preparing a Chicken Pizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking a Chicken Pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cuting a Chicken Pizza");
    }
}
