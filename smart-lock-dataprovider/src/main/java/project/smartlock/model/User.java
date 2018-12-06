package project.smartlock.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter @Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String phone;
    private String language;

    private Boolean deleted;
    private Boolean active;
    private Boolean locked;


    @OneToOne (fetch = FetchType.EAGER)
    @JoinColumn(name = "fingerprint_id")
    private Fingerprint fingerprint;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private List<Role> roles;


}
