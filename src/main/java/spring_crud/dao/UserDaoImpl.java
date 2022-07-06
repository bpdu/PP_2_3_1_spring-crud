package spring_crud.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import spring_crud.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void addUser(User user) { entityManager.persist(user); }

    @Override
    public void deleteUser(long id) { entityManager.remove(entityManager.find(User.class, id)); }

    @Override
    public User getUser(long id) { return entityManager.find(User.class, id); }

    @Override
    public void updateUser(User user) { entityManager.merge(user); }

    @Override
    public List<User> getUserList() {
        return entityManager
                .createQuery("select u from User u", User.class)
                .getResultList();
    }
}
