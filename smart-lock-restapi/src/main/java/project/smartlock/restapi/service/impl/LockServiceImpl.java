package project.smartlock.restapi.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.smartlock.data.dao.LockDao;
import project.smartlock.data.dto.LockDto;
import project.smartlock.data.mapper.LockDtoMapper;
import project.smartlock.data.model.Lock;
import project.smartlock.restapi.service.LockService;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class LockServiceImpl implements LockService {

    @Autowired
    private LockDtoMapper lockDtoMapper;

    @Autowired
    private LockDao lockDao;

    @Override
    public List<LockDto> getAllLock() {
        List<Lock> locks = lockDao.findAll();
        return lockDtoMapper.entityListToDtoList(locks);
    }

    @Override
    public LockDto getLock(Long lockId) {
        Optional<Lock> lockOptional = lockDao.findById(lockId);

        if (!lockOptional.isPresent() || lockOptional.get().isDeleted()) {
            throw new NoSuchElementException(String.format("Lock '%d' not found ", lockId));
        }
        return lockDtoMapper.entityToDto(lockOptional.get());
    }

    @Override
    public LockDto addLock(LockDto lockDto) {
        Lock createdLock = lockDao.save(lockDtoMapper.dtoToEntity(lockDto));
        return lockDtoMapper.entityToDto(createdLock);
    }


    @Override
    public LockDto updateLock(Long lockId, LockDto lockDto) {
        Optional<Lock> lockOptional = lockDao.findById(lockId);

        if (!lockOptional.isPresent() || lockOptional.get().isDeleted()) {
            throw new NoSuchElementException(String.format("Lock '%d' not found ", lockId));
        }
        Lock lockToUpdate = lockDtoMapper.dtoToEntity(lockDto);
        lockToUpdate.setId(lockId);
        lockDao.save(lockToUpdate);
        return lockDtoMapper.entityToDto(lockToUpdate);
    }

    @Override
    public LockDto deleteLock(Long lockId) {
        Optional<Lock> lockOptional = lockDao.findById(lockId);

        if (!lockOptional.isPresent() || lockOptional.get().isDeleted()) {
            throw new NoSuchElementException(String.format("Lock '%d' not found ", lockId));
        }
        Lock lock = lockOptional.get();
        lock.setDeleted(true);
        lockDao.save(lock);
        return lockDtoMapper.entityToDto(lock);
    }

}
