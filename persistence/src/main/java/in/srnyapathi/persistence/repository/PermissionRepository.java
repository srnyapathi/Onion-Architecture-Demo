package in.srnyapathi.persistence.repository;

import in.srnyapathi.persistence.entity.PermissionEntity;
import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface PermissionRepository extends CrudRepository<PermissionEntity,String>{
    
}
