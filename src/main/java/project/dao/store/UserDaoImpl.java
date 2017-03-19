package project.dao.store;

import org.springframework.stereotype.Repository;
import project.entity.user.User;

import java.util.List;

/**
 * Created by Ivan on 19.03.2017.
 */

@Repository
public class UserDaoImpl extends AbstractDao implements UserDao {
  @Override
  public List<User> findAll() {
    return (List<User>) getSession().createQuery("FROM User").list();
  }

  @Override
  public void add(User user) {
    getSession().save(user);
  }

  @Override
  public void delete(int id) {

  }
}
