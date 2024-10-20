package in.srnyapathi.persistence.gateway;

import in.srnyapathi.domain.gateways.PermissionRepositoryGateway;
import in.srnyapathi.domain.model.Permission;
import in.srnyapathi.persistence.entity.PermissionEntity;
import in.srnyapathi.persistence.mapper.PermissionMapper;
import in.srnyapathi.persistence.repository.PermissionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class PermissionRepositoryGatewayImpl implements PermissionRepositoryGateway {

    private final PermissionRepository repository;
    private final PermissionMapper mapper;

    @Override
    public void createPermission(Permission permission) {
        repository.save(mapper.toEntity(permission));
    }

    @Override
    public Permission getPermissionById(String id) {
        return repository.findById(id)
                .map(mapper::toDomain)
                .orElse(new Permission());

    }

    @Override
    public void updatePermission(String id, Permission permission) {
        repository.save(mapper.toEntity(permission));
    }

    @Override
    public void deletePermission(String id) {
        repository.deleteById(id);
    }
}
