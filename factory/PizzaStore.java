package factory;

public class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza p = null;
        p = PizzaFactory.createPizza(type);
        return p;
    }
}
