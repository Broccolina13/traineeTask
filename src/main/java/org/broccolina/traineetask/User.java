package org.broccolina.traineetask;

import java.util.ArrayList;
import java.util.List;

public class User {

    public static List<User> usersList = new ArrayList<>();
    private int userId;
    private String lastName;
    private String firstName;
    private String address;
    private String city;

    public User(int userId,
                String lastName,
                String firstName,
                String address,
                String city) {
        this.userId = userId;
        this.lastName = lastName;
        this.firstName = firstName;
        this.address = address;
        this.city = city;
    }

    //  Создаем и заполняем пользователей исходными данными
    public static List<User> createUsers(List<User> usersList) {

        User u1 = new User(1, "Hansen", "Ola", "Timoteivn 10", "Sanders");
        User u2 = new User(2, "Svendson", "Tove", "Borgvn 23", "Sanders");
        User u3 = new User(3, "Petterson", "Kari", "Storg 20", "Stavanger");

        usersList.add(u1);
        usersList.add(u2);
        usersList.add(u3);

        return usersList;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<User> getUsersList() {
        return usersList;
    }

    public void setUsersList(List<User> usersList) {
        this.usersList = usersList;
    }

}
