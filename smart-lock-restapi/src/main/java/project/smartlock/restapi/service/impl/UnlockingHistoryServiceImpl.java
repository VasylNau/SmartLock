package project.smartlock.restapi.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.smartlock.data.dao.UnlockingHistoryDao;
import project.smartlock.data.dto.UnlockingHistoryItemDto;
import project.smartlock.data.mapper.UnlockingHistoryItemDtoMapper;
import project.smartlock.data.model.UnlockingHistoryItem;
import project.smartlock.restapi.service.UnlockingHistoryService;

import java.util.List;

@Service
public class UnlockingHistoryServiceImpl implements UnlockingHistoryService {

    @Autowired
    private UnlockingHistoryDao unlockingHistoryDao;

    @Autowired
    private UnlockingHistoryItemDtoMapper unlockingHistoryItemDtoMapper;

    public List<UnlockingHistoryItemDto> getUnlockingHistoryItems() {
        List<UnlockingHistoryItem> historyItems = unlockingHistoryDao.findAll();
        return unlockingHistoryItemDtoMapper.entityListToDtoList(historyItems);
    }

}
