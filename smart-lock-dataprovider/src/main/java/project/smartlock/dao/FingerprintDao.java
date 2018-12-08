package project.smartlock.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.smartlock.model.Fingerprint;

@Repository
public interface FingerprintDao extends JpaRepository<Long, Fingerprint> {
}
