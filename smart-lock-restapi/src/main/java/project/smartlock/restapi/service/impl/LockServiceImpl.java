package project.smartlock.restapi.service.impl;

import org.aspectj.weaver.ast.Not;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.smartlock.data.dao.LockDao;
import project.smartlock.data.dto.LockDto;
import project.smartlock.data.mapper.LockDtoMapper;
import project.smartlock.data.model.Lock;
import project.smartlock.restapi.service.LockService;

import java.util.Optional;

@Service
public class LockServiceImpl implements LockService {

    @Autowired
    private LockDtoMapper lockDtoMapper;

    @Autowired
    private LockDao lockDao;

    @Override
    public LockDto addLock(LockDto lock) {

        return null;
    }

    public LockDto getLock(Long lockId) {
        Optional<Lock> lockOptional = lockDao.findById(lockId);
        if (!lockOptional.isPresent()) {
            // Todo: finish implementing
        }
        return lockDtoMapper.entityToDto(lockOptional.get());
    }

    @Override
    public LockDto updateLock(LockDto lock) {
        return null;
    }

    @Override
    public LockDto deleteLock(Long lockId) {
        return null;
    }

}
