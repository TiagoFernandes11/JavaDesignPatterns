package decorator;

public class CheesePizzaDecorator extends PizzaDecorator {
    public CheesePizzaDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public void bake() {
        System.out.println("Adding Cheese toppings");
        super.bake();
    }
}
