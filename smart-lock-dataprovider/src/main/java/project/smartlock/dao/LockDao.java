package project.smartlock.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.smartlock.model.Lock;

@Repository
public interface LockDao extends JpaRepository<Long, Lock> {
}
