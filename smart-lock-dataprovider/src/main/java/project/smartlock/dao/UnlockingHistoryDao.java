package project.smartlock.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.smartlock.model.UnlockingHistoryItem;

@Repository
public interface UnlockingHistoryDao extends JpaRepository<Long, UnlockingHistoryItem> {

}
