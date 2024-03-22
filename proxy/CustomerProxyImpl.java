package proxy;

import java.util.ArrayList;
import java.util.List;

public class CustomerProxyImpl implements Customer{
    CustomerImpl customer = new CustomerImpl();
    @Override
    public int getId() {
        return customer.getId();
    }

    @Override
    public List<Order> getOrders() {
        ArrayList<Order> orders = new ArrayList<>();
        Order order1 = new Order();
        Order order2 = new Order();

        order1.setId(1);
        order1.setProductName("Xablau");
        order1.setQuantity(2);
        orders.add(order1);

        order2.setId(2);
        order2.setProductName("Xibliu");
        order2.setQuantity(4);
        orders.add(order2);

        return orders;
    }
}
