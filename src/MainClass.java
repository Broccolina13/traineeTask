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

        //нахожу юзеров по их id и id в заказе

        List<Object> newList = new ArrayList<Object>(usersList);
        newList.addAll(ordersList);
        //не понимаю как можно сделать перебор по каждому заказу и клиенту
        for (int i = 0; i < usersList.size(); i++){
            if (u1.getUserId() == o3.getU_idInOrder()){
                i++;
                System.out.println("У пользователя с ID №" + i + " есть заказы.");
            }
        }

        //мои попытки собрать два параметра из разных классов
//        public static int findUsersbyOrderId(){
//        return (int) usersList.stream().filter((p) -> (p.getUserId().equals(getU_idInOrder)))
//                .count();

//        List<Integer> newList = Stream.of(ordersList, usersList)
//                .flatMap(t -> Collection.stream(t))
//                .collect(Collectors.toList());

        //думала создать общий список с заказами и клиентами, кажется, плохая идея
//        List<Object> newList = new ArrayList<Object>(usersList);
//        newList.addAll(ordersList);
//        for(int i = 0; i < newList.size(); i++) {
//        System.out.println(newList.get(i).getName());

    }
}

