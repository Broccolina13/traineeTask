package org.broccolina.traineetask;

import java.util.ArrayList;
import java.util.List;

public class Order {

    public static List<Order> ordersList = new ArrayList<>();
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

    public List<Order> getOrersList() {
        return ordersList;
    }

    public void setOrdersList(ArrayList<Order> ordersList) {
        this.ordersList = ordersList;
    }

}
