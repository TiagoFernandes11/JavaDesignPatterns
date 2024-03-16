package factory.pizzastore;

public class Test {
    public static void main(String[] args) {
        PizzaStore store = new PizzaStore();

        Pizza pizza1 = store.orderPizza("chicken");
        Pizza pizza2 = store.orderPizza("chicken");

        System.out.println(pizza2 == pizza1);
    }
}
