package project.smartlock.data.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "project.smartlock.data.dao")
@EntityScan(basePackages = {"project.smartlock.data.model"})
@ComponentScan(
        basePackages = {
                "project.smartlock.data",
                "project.smartlock.data.mapper"
        }
)
public class DataJpaConfig {
}
