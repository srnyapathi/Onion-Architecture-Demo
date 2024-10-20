package in.srnyapathi.persistence;


import in.srnyapathi.persistence.mapper.*;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
@ConfigurationPropertiesScan
public class PersistenceModuleConfig {

    @Bean
    PersistenceMapper persistenceMapper() {
        return new PersistenceMapperImpl();
    }

    @Bean
    PermissionMapper permissionMapper(){
        return new PermissionMapperImpl();
    }

    @Bean
    RoleMapper roleMapper(){
        return  new RoleMapperImpl();
    }



}
