package org.broccolina.traineetask.util;

import org.broccolina.traineetask.Order;
import org.broccolina.traineetask.User;

import java.util.ArrayList;
import java.util.List;

public class UserAndOrderUtils {

    //  Отбираем всех пользователей, имеющие какие-либо заказы по ID
    public static List<User> findUsersByOrdersByLoops(List<User> userList, List<Order> orderList) {
        List<User> usersWithOrders = new ArrayList();
        for (User user : userList) {
            for (Order order : orderList) {
                if (order.getU_idInOrder() == user.getUserId()) {
                    Boolean userExists = usersWithOrders.contains(user);
                    if (!userExists) usersWithOrders.add(user);
                }
            }
        }
        return usersWithOrders;
    }
}
