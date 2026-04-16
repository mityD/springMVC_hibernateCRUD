package crud.service;

import crud.model.User;

import java.util.List;

public interface UserService {

    List<User> getListUsers();
    User save(User user);
    User findById(Long id);
    void edit(User user);
    void delete(User user);
}
