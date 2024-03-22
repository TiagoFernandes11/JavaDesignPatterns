package facade;

public class OrderProcessor {
    public boolean checkStock(String name){
        System.out.println("Checking stock");
        return true;
    }

    public int placeOrder(String name, int quantity){
        System.out.println("Order placed");
        return 1;
    }

    public void shipOrder(int orderId){
        System.out.println("Order shipped");
    }
}
