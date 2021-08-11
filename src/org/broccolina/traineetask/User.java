package org.broccolina.traineetask;

import java.util.ArrayList;
import java.util.List;

public class User {

    private boolean u_idInOrder;

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

    private int userId;
    private String lastName;
    private String firstName;
    private String address;
    private String city;
    public static List<User> usersList = new ArrayList<User>();

    public User(int u_idInOrder) {

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
