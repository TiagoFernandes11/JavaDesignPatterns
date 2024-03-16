package factory.pizzastore;

public class PizzaFactory {
    public static Pizza createPizza(String type) {
        Pizza p = null;
        if (type.equalsIgnoreCase("cheese")) {
            p = new CheesePizza();
        }
        if (type.equalsIgnoreCase("chicken")) {
            p = new ChickenPizza();
        }
        if (type.equalsIgnoreCase("veggie")) {
            p = new VeggiePizza();
        }
        if (p != null) {
            p.prepare();
            p.bake();
            p.cut();
        }
        return p;
    }
}
