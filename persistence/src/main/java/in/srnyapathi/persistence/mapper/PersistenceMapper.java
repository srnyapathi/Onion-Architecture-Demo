package in.srnyapathi.persistence.mapper;


import in.srnyapathi.domain.model.Permission;
import in.srnyapathi.domain.model.Role;
import in.srnyapathi.domain.model.User;
import in.srnyapathi.persistence.entity.PermissionEntity;
import in.srnyapathi.persistence.entity.RoleEntity;
import in.srnyapathi.persistence.entity.UserEntity;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Mapper
public interface PersistenceMapper {

    UserEntity toEntity(User user);

    User toDomain(UserEntity userEntity);

    // Map list of UserEntity to list of User
    default List<User> toUserDomainList(Iterable<UserEntity> all) {
        return StreamSupport.stream(all.spliterator(), false)
                .map(this::toDomain)
                .collect(Collectors.toList());

    }

    default RoleEntity toEntity(Role role) {
        return new RoleEntity(role.getId(),
                role.getRoleName(), role.getPermissionList()
                .stream()
                .map(this::toPermissionEntity)
                .collect(Collectors.toList()));

    }


    Role toDomain(RoleEntity entity);

    default List<Role> toRoleDomainList(Iterable<RoleEntity> all) {
        return StreamSupport.stream(all.spliterator(), false)
                .map(this::toDomain)
                .collect(Collectors.toList());
    }



    PermissionEntity toPermissionEntity(Permission permission);

    Permission toPermissionDomain(PermissionEntity e);

}


