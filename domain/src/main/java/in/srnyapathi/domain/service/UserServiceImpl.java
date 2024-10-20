package in.srnyapathi.domain.service;

import in.srnyapathi.domain.gateways.UserRepositoryGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

import in.srnyapathi.domain.model.User;

import java.util.List;

@Component
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepositoryGateway userRepositoryGateway;

    @Override
    public User createUser(User user) {
        validateUser(user);
        return userRepositoryGateway.createUser(user);
    }

    @Override
    public User updateUser(User user) {
        validateUser(user);
        return userRepositoryGateway.updateUser(user);
    }

    @Override
    public void deleteUser(String id) {
        userRepositoryGateway.deleteUser(id);

    }

    @Override
    public User getUserById(String id) {
        return userRepositoryGateway.getUserById(id);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepositoryGateway.getAllUsers();
    }

    void validateUser(User user) {
        if (ObjectUtils.isEmpty(user)) {
            // some validation in case of failure it will create an exception
        }

        if (ObjectUtils.isEmpty(user.getEmail())) {
            // some validation in case of failure it will create an exception
        }

        if (ObjectUtils.isEmpty(user.getName())) {
            // some validation in case of failure it will create an exception
        }

    }

}
