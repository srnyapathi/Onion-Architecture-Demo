package in.srnyapathi.domain.service;

import java.util.List;

import in.srnyapathi.domain.model.Role;

public interface RoleService {

    void createRole(Role role);

    // Read a role by its ID
    Role getRoleById(Long id);

    // Update an existing role
    void updateRole(Long id, Role role);

    // Delete a role by its ID
    void deleteRole(Long id);

    // List all roles
    List<Role> getAllRoles();
    
}
