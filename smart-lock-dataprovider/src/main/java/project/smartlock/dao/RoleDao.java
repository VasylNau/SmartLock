package project.smartlock.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.smartlock.model.Role;

@Repository
public interface RoleDao extends JpaRepository<Integer, Role> {
}
