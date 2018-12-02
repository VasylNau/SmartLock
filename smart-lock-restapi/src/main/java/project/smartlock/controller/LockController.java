package project.smartlock.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import project.smartlock.model.Lock;
import project.smartlock.service.LockService;

@RestController
public class LockController {

    @Autowired
    private LockService lockService;

    @GetMapping("/locks/")
    public Lock getBusinessResult() {
        return lockService.getTestLock();
    }

}
