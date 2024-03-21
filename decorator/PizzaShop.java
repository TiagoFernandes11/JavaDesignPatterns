package decorator;

public class PizzaShop {
    public static void main(String[] args) {
        Pizza pizza = new PlainPizza();
        pizza.bake();

        CheesePizzaDecorator cheesePizzaDecorator = new CheesePizzaDecorator(pizza);
        cheesePizzaDecorator.bake();
    }
}
