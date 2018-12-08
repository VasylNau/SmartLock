package project.smartlock.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.smartlock.model.UserToLockRelation;

@Repository
public interface UserToLockRelationDao extends JpaRepository<Long, UserToLockRelation> {
}
