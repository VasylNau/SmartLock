package project.smartlock.service;

import org.springframework.stereotype.Service;
import project.smartlock.model.Lock;

@Service
public class LockService {

    public Lock getTestLock() {
        Lock lock = new Lock();
        lock.setId(1646456L);
        lock.setName("Home Lock");
        lock.setDescription("Lock for main door at home.");
        return lock;
    }

}
