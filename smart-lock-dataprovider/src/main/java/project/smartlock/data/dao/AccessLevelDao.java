package project.smartlock.data.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.smartlock.data.model.AccessLevel;

@Repository
public interface AccessLevelDao extends JpaRepository<Integer, AccessLevel> {
}
