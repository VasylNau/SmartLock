package project.smartlock.restapi.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.smartlock.data.dto.UnlockingHistoryItemDto;
import project.smartlock.restapi.service.UnlockingHistoryService;

import java.util.List;

@RestController
@RequestMapping("/api/history/unlocking")
@Slf4j
public class UnlockingHistoryController {

    @Autowired
    private UnlockingHistoryService unlockingHistoryService;

    @GetMapping
    public List<UnlockingHistoryItemDto> getUnlockingHistory() {
        return unlockingHistoryService.getUnlockingHistoryItems();
    }

}
