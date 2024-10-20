package in.srnyapathi.persistence.mapper;

import in.srnyapathi.domain.model.Role;
import in.srnyapathi.persistence.entity.RoleEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface RoleMapper {
    RoleEntity toEntity(Role role);

    Role toDomain(RoleEntity entity);

    List<Role> toDomainList(Iterable<RoleEntity> all);
}
