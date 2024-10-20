
package in.srnyapathi.persistence.gateway;

import in.srnyapathi.domain.gateways.UserRepositoryGateway;
import in.srnyapathi.domain.model.User;
import in.srnyapathi.persistence.mapper.PersistenceMapper;
import in.srnyapathi.persistence.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
@RequiredArgsConstructor
public class UserRepositoryGatewayImpl implements UserRepositoryGateway {
    private final UserRepository userRepository;
    private final PersistenceMapper persistenceMapper;
    @Override
    public User createUser(User user) {
        return persistenceMapper.toDomain(userRepository.save(persistenceMapper.toEntity(user)));
    }

    @Override
    public User updateUser(User user) {
        return persistenceMapper.toDomain(userRepository.save(persistenceMapper.toEntity(user)));

    }

    @Override
    public void deleteUser(String id) {
        userRepository.deleteById(id);
    }

    @Override
    public User getUserById(String id) {
        return userRepository.findById(id)
                .map(persistenceMapper::toDomain)
                .orElse(new User());
    }

    @Override
    public List<User> getAllUsers() {
        return persistenceMapper.toUserDomainList(userRepository.findAll());
    }
}