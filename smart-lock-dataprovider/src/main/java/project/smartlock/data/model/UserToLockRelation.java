package project.smartlock.data.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "user_lock")
@Getter @Setter
@EqualsAndHashCode
public class UserToLockRelation {

    @Id
    @GeneratedValue
    private Long id;

    @EqualsAndHashCode.Exclude
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @EqualsAndHashCode.Exclude
    @ManyToOne
    @JoinColumn(name = "lock_id")
    private Lock lock;

    @EqualsAndHashCode.Exclude
    @ManyToOne
    @JoinColumn(name = "access_level_id")
    private AccessLevel accessLevel;

}
