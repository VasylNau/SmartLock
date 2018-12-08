package project.smartlock.restapi;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "project.smartlock")
public class SmartLockApi {

    public static void main(String[] args) {
        SpringApplication.run(SmartLockApi.class, args);
    }
}
