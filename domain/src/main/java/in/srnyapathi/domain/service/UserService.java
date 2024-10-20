package in.srnyapathi.domain.service;

import java.util.List;

import in.srnyapathi.domain.model.User;

public interface UserService {

    User createUser(User user);
    User updateUser(User user);
    void deleteUser(String id);
    User getUserById(String id);
    List<User> getAllUsers();
    

}
