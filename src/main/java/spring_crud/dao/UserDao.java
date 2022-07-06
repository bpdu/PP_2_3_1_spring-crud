package spring_crud.dao;

import spring_crud.model.User;

import java.util.List;

public interface UserDao {

    void addUser(User user);
    void deleteUser(long id);
    User getUser(long id);
    void updateUser(User user);
    List<User> getUserList();

}
