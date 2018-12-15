package project.smartlock.restapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import project.smartlock.data.config.DataJpaConfig;

@SpringBootApplication(
        scanBasePackages = {
                "project.smartlock.restapi",
                "project.smartlock.restapi.configuration",
                "project.smartlock.restapi.controller",
                "project.smartlock.restapi.service.impl",
        },
        scanBasePackageClasses = {
                DataJpaConfig.class
        }
)
public class SmartLockApi {

    public static void main(String[] args) {
        SpringApplication.run(SmartLockApi.class, args);
    }
}
