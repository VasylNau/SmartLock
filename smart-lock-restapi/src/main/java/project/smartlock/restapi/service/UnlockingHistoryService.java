package project.smartlock.restapi.service;

import project.smartlock.data.dto.UnlockingHistoryItemDto;

import java.util.List;

public interface UnlockingHistoryService {

    List<UnlockingHistoryItemDto> getUnlockingHistoryItems();

}
