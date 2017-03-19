package project.dao.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import project.dao.store.UserDao;
import project.entity.user.User;

import java.util.List;

/**
 * Created by Ivan on 19.03.2017.
 */
@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

  @Autowired
  private UserDao userDao;
  @Override
  public List<User> findAllUsers() {
    return userDao.findAll();
  }
}
