package in.srnyapathi.domain.service;

import in.srnyapathi.domain.model.Permission;

public interface PermissionService{
    void createPermission(Permission permission);
    Permission getPermissionById(Long id);
    void updatePermission(Long id, Permission permission);
    void deletePermission(Long id);
    
}
