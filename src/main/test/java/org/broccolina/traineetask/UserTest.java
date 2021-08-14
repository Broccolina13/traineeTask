package org.broccolina.traineetask;

import org.broccolina.traineetask.util.UserAndOrderUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

public class UserTest {

    @Test
    public void findUsersByOrdersTest(){
        List<User> users = List.of(
                new User(1, "Hansen", "Ola", "Timoteivn 10", "Sanders"),
                new User(2, "Svendson", "Tove", "Borgvn 23", "Sanders"),
                new User(3, "Petterson", "Kari", "Storg 20", "Stavanger"));

        List<Order> orders = List.of(
                new Order("1", "77895", 3),
                new Order("2", "44678", 3),
                new Order("3", "22456", 1),
                new Order("4", "24562", 1),
                new Order("5", "34764", 15));

        List<User> usersInOrders = UserAndOrderUtils.findUsersByOrdersByLoops(users, orders);
        printUsers(usersInOrders);
        assertEquals(2, usersInOrders.size());
    }

    //  Выводим реквизиты найденныйх пользователей lastName, firstName, userId на печать
    private void printUsers(List<User> users) {
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

}

