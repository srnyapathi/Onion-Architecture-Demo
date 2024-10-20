package in.srnyapathi.domain.application;


import in.srnyapathi.api.ApiModuleConfiguration;
import in.srnyapathi.domain.DomainModuleConfiguration;
import in.srnyapathi.persistence.PersistenceModuleConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"in.srnyapathi"})
@Import({ PersistenceModuleConfig.class, DomainModuleConfiguration.class, ApiModuleConfiguration.class})
@Configuration
@EnableAutoConfiguration
@EnableJpaRepositories(basePackages="in.srnyapathi.persistence.repository")
@EntityScan(basePackages="in.srnyapathi.persistence.entity")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}