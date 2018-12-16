package project.smartlock.restapi.service;

import org.springframework.stereotype.Service;
import project.smartlock.data.dto.LockDto;

import java.util.List;

@Service
public interface LockService {

    LockDto addLock(LockDto lock);

    LockDto getLock(Long lockId);

    LockDto updateLock(Long lockId, LockDto lock);

    LockDto deleteLock(Long lockId);


    List<LockDto> getAllLock();
}
