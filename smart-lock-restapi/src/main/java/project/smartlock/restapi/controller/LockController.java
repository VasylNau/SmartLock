package project.smartlock.restapi.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.smartlock.data.dto.LockDto;
import project.smartlock.restapi.service.LockService;

@RestController
@RequestMapping("/api/locks")
public class LockController {

    @Autowired
    private LockService lockService;

    @GetMapping("/{id}")
    public LockDto getBusinessResult(@PathVariable Long id) {
        return lockService.getLock(id);
    }

}
