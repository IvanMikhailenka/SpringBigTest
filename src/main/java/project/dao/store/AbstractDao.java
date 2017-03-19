package project.dao.store;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Ivan on 19.03.2017.
 */
abstract class AbstractDao {
  @Autowired
  private SessionFactory sessionFactory;

  Session getSession() {
    return sessionFactory.getCurrentSession();
  }

}
