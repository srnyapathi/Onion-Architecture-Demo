package in.srnyapathi.persistence.mapper;

import in.srnyapathi.domain.model.Permission;
import in.srnyapathi.persistence.entity.PermissionEntity;
import org.mapstruct.Mapper;

@Mapper
public interface PermissionMapper {
    PermissionEntity toEntity(Permission permission);

    Permission toDomain(PermissionEntity e);


}
