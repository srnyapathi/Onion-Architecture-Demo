package in.srnyapathi.api;


import in.srnyapathi.api.mapper.UserMapper;
import in.srnyapathi.api.mapper.UserMapperImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class ApiModuleConfiguration {
    @Bean
    UserMapper userMapper(){
        return new UserMapperImpl();
    }
}
