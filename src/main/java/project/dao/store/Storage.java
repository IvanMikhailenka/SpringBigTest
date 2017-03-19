package project.dao.store;

import java.util.List;

/**
 * Created by Ivan on 19.03.2017.
 */
public interface Storage<T> {
  List<T> findAll();
  void add(T entity);
  void delete(int id);
}
