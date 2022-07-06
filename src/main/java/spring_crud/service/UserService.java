package spring_crud.service;

import spring_crud.model.User;

import java.util.List;

public interface UserService {

    void addUser(User user);
    void deleteUser(long id);
    User getUser(long id);
    void updateUser(long id, String name, String email, Integer age);
    List<User> getUserList();
}
