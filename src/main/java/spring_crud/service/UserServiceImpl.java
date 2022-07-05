package spring_crud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spring_crud.dao.UserDao;
import spring_crud.model.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Transactional
    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Transactional
    @Override
    public void removeUser(User user) {
        userDao.removeUser(user);
    }

    @Transactional
    @Override
    public User getUser(long id) {
        return userDao.getUser(id);
    }

    @Transactional
    @Override
    public void setUser(long id, User user) {
        userDao.setUser(id, user);
    }

    @Override
    public List<User> getUserList() {
        return userDao.getUserList();
    }
}
