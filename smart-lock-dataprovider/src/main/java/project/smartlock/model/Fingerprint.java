package project.smartlock.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
public class Fingerprint {

    @Id
    private Long id;

    @Column(name = "fingerprint")
    @Lob
    private byte[] fingerprintData; // TODO: Investigate fingerprinting storing

    @OneToOne(mappedBy = "fingerprint", fetch = FetchType.LAZY)
    private User user;
}
