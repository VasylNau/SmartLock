package project.smartlock.data.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.smartlock.data.model.UserToLockRelation;

@Repository
public interface UserToLockRelationDao extends JpaRepository<UserToLockRelation, Long> {
}
