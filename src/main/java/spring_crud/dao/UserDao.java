package spring_crud.dao;

import spring_crud.model.User;

import java.util.List;

public interface UserDao {

    void addUser(User user);
    void removeUser(User user);
    User getUser(long id);
    void setUser(long id, User user);
    List<User> getUserList();

}
