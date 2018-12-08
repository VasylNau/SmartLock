package project.smartlock.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.smartlock.model.User;

@Repository
public interface UserDao extends JpaRepository<Long, User> {

}
