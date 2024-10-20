package in.srnyapathi.domain.gateways;

import java.util.List;

import in.srnyapathi.domain.model.Role;

public interface RoleRepositoryGateway {

    void createRole(Role role);

    // Read a role by its ID
    Role getRoleById(String id);

    // Update an existing role
    void updateRole(String id, Role role);

    // Delete a role by its ID
    void deleteRole(String id);

    // List all roles
    List<Role> getAllRoles();

}
