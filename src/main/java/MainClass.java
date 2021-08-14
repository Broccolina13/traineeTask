import org.broccolina.traineetask.Order;
import org.broccolina.traineetask.User;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

    public static void main(String[] args) {

        List<User> usersWithOrders = findUsersByOrdersByLoops(User.usersList, Order.ordersList);
        printUsers(usersWithOrders);

    }

    //  Выводим реквизиты найденныйх пользователей lastName, firstName, userId на печать
    private static void printUsers(List<User> users) {
        if (!users.isEmpty()) {
            System.out.println("Найдены пользователи с существующими заказами:");
        }
        for (User user : users) {
            System.out.println(
                    String.format("- \"%s %s\" (%d)",
                            user.getLastName(),
                            user.getFirstName(),
                            user.getUserId()));
        }
    }

    //  Отбираем всех пользователей, имеющие какие-либо заказы по ID
    private static List<User> findUsersByOrdersByLoops(List<User> userList, List<Order> orderList) {
        List<User> usersWithOrders = new ArrayList();
        for (User user : User.createUsers(userList)) {
            for (Order order : Order.createOrder(orderList)) {
                if (order.getU_idInOrder() == user.getUserId()) {
                    Boolean userExists = usersWithOrders.contains(user);
                    if (!userExists) usersWithOrders.add(user);
                }
            }
        }
        return usersWithOrders;
    }

}

