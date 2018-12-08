package project.smartlock.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.smartlock.model.AccessLevel;

@Repository
public interface AccessLevelDao extends JpaRepository<Integer, AccessLevel> {
}
