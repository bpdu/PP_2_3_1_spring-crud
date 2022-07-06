package spring_crud.service;

import spring_crud.model.User;

import java.util.List;

public interface UserService {

    void addUser(User user);
    void deleteUser(long id);
    User getUser(long id);
    void updateUser(User user);
    List<User> getUserList();
}
