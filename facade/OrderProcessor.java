package facade;

public class OrderProcessor {
    public boolean checkStock(String name){
        System.out.println("Checking stock for " + name);
        return true;
    }

    public int placeOrder(String name, int quantity){
        System.out.println("Order placed: " + name + " qtd: " + quantity);
        return 1;
    }

    public void shipOrder(int orderId){
        System.out.println("Order shipped. Id: " + orderId);
    }
}
