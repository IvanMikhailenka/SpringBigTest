package project.dao.store;

import project.entity.user.User;

import java.util.List;

/**
 * Created by Ivan on 19.03.2017.
 */
public interface UserDao extends Storage<User> {
  @Override
  List<User> findAll();

  @Override
  void add(User user);

  @Override
  void delete(int id);
}
