package proxy;

import java.util.List;

public class CustomerImpl implements Customer{
    private int id;
    private List<Order> orders;

    CustomerImpl(){
        this.id = 1;
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public List<Order> getOrders() {
        return null;
    }
}
