package in.srnyapathi.domain.gateways;

import in.srnyapathi.domain.model.Permission;

public interface PermissionRepositoryGateway {
    void createPermission(Permission permission);

    Permission getPermissionById(String id);

    void updatePermission(String id, Permission permission);

    void deletePermission(String id);

}
