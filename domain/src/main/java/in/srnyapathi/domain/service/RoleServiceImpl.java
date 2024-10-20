package in.srnyapathi.domain.service;

import java.util.List;

import in.srnyapathi.domain.model.Role;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component

@RequiredArgsConstructor
public class RoleServiceImpl implements RoleService {

    @Override
    public void createRole(Role role) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createRole'");
    }

    @Override
    public Role getRoleById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getRoleById'");
    }

    @Override
    public void updateRole(Long id, Role role) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateRole'");
    }

    @Override
    public void deleteRole(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteRole'");
    }

    @Override
    public List<Role> getAllRoles() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllRoles'");
    }
    
}
