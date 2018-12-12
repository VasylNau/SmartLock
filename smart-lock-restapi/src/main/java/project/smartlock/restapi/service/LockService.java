package project.smartlock.restapi.service;

import org.springframework.stereotype.Service;
import project.smartlock.data.dto.LockDto;

@Service
public interface LockService {

    LockDto addLock(LockDto lock);

    LockDto getLock(Long lockId);

    LockDto updateLock(LockDto lock);

    LockDto deleteLock(Long lockId);


}
