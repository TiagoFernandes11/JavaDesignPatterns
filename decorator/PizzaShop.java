package decorator;

public class PizzaShop {
    public static void main(String[] args) {
        Pizza pizza = new PlainPizza();
        CheesePizzaDecorator cheesePizzaDecorator = new CheesePizzaDecorator(pizza);
        VeggiePizzaDecorator veggiePizzaDecorator = new VeggiePizzaDecorator(cheesePizzaDecorator);
        veggiePizzaDecorator.bake();
    }
}
