package project.smartlock.data.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.smartlock.data.model.UnlockingHistoryItem;

@Repository
public interface UnlockingHistoryDao extends JpaRepository<UnlockingHistoryItem, Long> {

}
