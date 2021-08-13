import org.broccolina.traineetask.Order;
import org.broccolina.traineetask.User;

import java.util.ArrayList;
import java.util.List;

import static org.broccolina.traineetask.Order.ordersList;
import static org.broccolina.traineetask.User.usersList;

public class MainClass {

    public static void main(String[] args) {

        System.out.println(usersList);

        List<User> usersWithOrders = findUsersByOrdersByLoops(usersList, ordersList);
        printUsers(usersWithOrders);

    }

    //  Выводим реквизиты пользователей lastName, firstName, userId на печать
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

    //  Отбор через циклы
    private static List<User> findUsersByOrdersByLoops(List<User> userList, List<Order> orderList) {
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

