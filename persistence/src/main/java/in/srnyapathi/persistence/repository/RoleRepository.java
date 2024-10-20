package in.srnyapathi.persistence.repository;

import in.srnyapathi.persistence.entity.RoleEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends CrudRepository<RoleEntity,String>{
    
}
