package project.smartlock.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import project.smartlock.service.TestService;

@RestController

public class TestConroller {

    private TestService testService = new TestService();

    @GetMapping(value = "/")
    public String getBusinessResult() {
        return testService.makeHardBusinessOperation();
    }

}
