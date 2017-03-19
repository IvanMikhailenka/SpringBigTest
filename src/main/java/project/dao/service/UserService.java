package project.dao.service;

import project.entity.user.User;

import java.util.List;

/**
 * Created by Ivan on 19.03.2017.
 */
public interface UserService {
  List<User> findAllUsers();
}
