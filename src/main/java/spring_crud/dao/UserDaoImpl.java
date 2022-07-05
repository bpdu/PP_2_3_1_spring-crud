package spring_crud.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import spring_crud.model.User;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addUser(User user) {
        sessionFactory.getCurrentSession().save(user);
    }

    @Override
    public void removeUser(User user) {
        sessionFactory.getCurrentSession().remove(user);
    }

    @Override
    public User getUser(long id) {
        return (User) sessionFactory.getCurrentSession()
                .createQuery("from User user where user.id = :id")
                .setParameter("id", id)
                .getSingleResult();
    }

    @Override
    public void setUser(long id, User user) {
        sessionFactory.getCurrentSession()
                .createQuery("update User set name = :name, surname = :surname, age = :age where id = :id")
                .setParameter("name", user.getName())
                .setParameter("surname", user.getSurname())
                .setParameter("age", user.getAge())
                .executeUpdate();
    }

    @Override
    public List<User> getUserList() {
        return sessionFactory.getCurrentSession().createQuery("from User").getResultList();
    }
}
