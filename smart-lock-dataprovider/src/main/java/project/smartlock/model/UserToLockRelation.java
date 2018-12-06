package project.smartlock.model;


import lombok.AccessLevel;

import javax.persistence.*;

@Entity
@Table(name = "user_role")
public class UserToLockRelation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User user;
    @ManyToOne
    private Lock lock;
    @ManyToOne
    private AccessLevel accessLevel;

}
