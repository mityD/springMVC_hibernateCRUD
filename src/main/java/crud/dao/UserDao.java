package crud.dao;

import crud.model.User;

import java.util.List;

public interface UserDao {

    List<User> getListUsers();
    void save(User user);
    User findById(Long id);
    void edit(User user);
    void delete(User user);
}
