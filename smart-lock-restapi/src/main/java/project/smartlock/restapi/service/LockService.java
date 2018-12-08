package project.smartlock.restapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.smartlock.data.dto.LockDto;
import project.smartlock.data.mapper.LockDtoMapper;
import project.smartlock.data.model.Lock;

@Service
public class LockService {

    @Autowired
    private LockDtoMapper lockDtoMapper;

    public LockDto getLock(Long lockId) {
        Lock lock = new Lock();
        lock.setId(lockId);
        lock.setName("Home Lock");
        lock.setDescription("Lock for main door at home.");
        return lockDtoMapper.entityToDto(lock);
    }

}
