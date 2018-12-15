package project.smartlock.data.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.smartlock.data.model.Role;

@Repository
public interface RoleDao extends JpaRepository<Role, Integer> {
}
