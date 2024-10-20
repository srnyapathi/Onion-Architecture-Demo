package in.srnyapathi.domain.service;

import in.srnyapathi.domain.model.Permission;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PermissionServiceImpl implements PermissionService{

    @Override
    public void createPermission(Permission permission) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createPermission'");
    }

    @Override
    public Permission getPermissionById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPermissionById'");
    }

    @Override
    public void updatePermission(Long id, Permission permission) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updatePermission'");
    }

    @Override
    public void deletePermission(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deletePermission'");
    }
    
}
