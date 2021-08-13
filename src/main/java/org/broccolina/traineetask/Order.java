package org.broccolina.traineetask;

import java.util.ArrayList;
import java.util.List;

public class Order {

    public static List<Order> ordersList = new ArrayList<Order>();
    private String orderId;
    private String orderNo;
    private int u_idInOrder;

    public Order(String orderId,
                 String orderNo,
                 int u_idInOrder) {
        this.orderId = orderId;
        this.orderNo = orderNo;
        this.u_idInOrder = u_idInOrder;
    }

    //  Создаем и заполняем заказы исходными данными
    public List<Order> crateOrders (List<Order> ordersList) {

        Order o1 = new Order("1", "77895", 3);
        Order o2 = new Order("2", "44678", 3);
        Order o3 = new Order("3", "22456", 1);
        Order o4 = new Order("4", "24562", 1);
        Order o5 = new Order("5", "34764", 15);

        ordersList.add(o1);
        ordersList.add(o2);
        ordersList.add(o3);
        ordersList.add(o4);
        ordersList.add(o5);

        return ordersList;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public int getU_idInOrder() {
        return u_idInOrder;
    }

    public void setU_idInOrder(int u_idInOrder) {
        this.u_idInOrder = u_idInOrder;
    }

    public List<Order> getOrdersList() {
        return ordersList;
    }

    public void setOrdersList(ArrayList<Order> ordersList) {
        this.ordersList = ordersList;
    }

}
