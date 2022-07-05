package spring_crud.service;

import spring_crud.model.User;

import java.util.List;

public interface UserService {

    void addUser(User user);
    void removeUser(User user);
    User getUser(long id);
    void setUser(long id, User user);
    List<User> getUserList();
}
