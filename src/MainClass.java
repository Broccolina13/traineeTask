import org.broccolina.traineetask.Order;
import org.broccolina.traineetask.User;

import java.util.ArrayList;
import java.util.List;

import static org.broccolina.traineetask.Order.ordersList;
import static org.broccolina.traineetask.User.usersList;

public class MainClass {
    public static ArrayList<Order> filterUser = new ArrayList<Order>();

    // TODO: Выбрать все лица, имеющие какие-либо заказы.
    public static void main(String[] args) {
        //создаем юзеров и заполняем
        User u1 = new User(1, "Hansen", "Ola", "Timoteivn 10", "Sanders");
        User u2 = new User(2, "Svendson", "Tove", "Borgvn 23", "Sanders");
        User u3 = new User(3, "Petterson", "Kari", "Storg 20", "Stavanger");

        usersList.add(u1);
        usersList.add(u2);
        usersList.add(u3);
        //создаем заказы и заполняем
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

    }
}

