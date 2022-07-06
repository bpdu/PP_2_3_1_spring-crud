package spring_crud.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spring_crud.dao.UserDao;
import spring_crud.model.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) { this.userDao = userDao; }

    @Transactional
    @Override
    public void addUser(User user) { userDao.addUser(user); }

    @Transactional
    @Override
    public void deleteUser(long id) { userDao.deleteUser(id); }

    @Transactional
    @Override
    public User getUser(long id) { return userDao.getUser(id); }

    @Transactional
    @Override
    public void updateUser(User user) { userDao.updateUser(user); }

    @Transactional(readOnly = true)
    @Override
    public List<User> getUserList() { return userDao.getUserList(); }
}
