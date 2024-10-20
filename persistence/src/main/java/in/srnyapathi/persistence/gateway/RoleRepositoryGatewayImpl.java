package in.srnyapathi.persistence.gateway;

import java.util.List;

import in.srnyapathi.domain.gateways.RoleRepositoryGateway;
import in.srnyapathi.domain.model.Role;
import in.srnyapathi.persistence.mapper.RoleMapper;
import in.srnyapathi.persistence.repository.PermissionRepository;
import in.srnyapathi.persistence.repository.RoleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class RoleRepositoryGatewayImpl implements RoleRepositoryGateway {
    private final RoleRepository repository;
    private final RoleMapper mapper;

    @Override
    public void createRole(Role role) {
        repository.save(mapper.toEntity(role));
    }

    @Override
    public Role getRoleById(String id) {
        return repository.findById(id)
                .map(mapper::toDomain)
                .orElse(new Role());
    }

    @Override
    public void updateRole(String id, Role role) {
        role.setId(id);
        repository.save(mapper.toEntity(role));
    }

    @Override
    public void deleteRole(String id) {
        repository.deleteById(id);

    }

    @Override
    public List<Role> getAllRoles() {
        return mapper.toDomainList(repository.findAll());
    }
}
