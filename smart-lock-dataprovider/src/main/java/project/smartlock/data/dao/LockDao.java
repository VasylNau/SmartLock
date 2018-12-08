package project.smartlock.data.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.smartlock.data.model.Lock;

@Repository
public interface LockDao extends JpaRepository<Long, Lock> {
}
