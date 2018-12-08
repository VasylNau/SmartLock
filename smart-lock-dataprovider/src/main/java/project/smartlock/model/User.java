package project.smartlock.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter @Setter
@EqualsAndHashCode
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


    @EqualsAndHashCode.Exclude
    @OneToOne
    @JoinColumn(name = "fingerprint_id")
    private Fingerprint fingerprint;

    @EqualsAndHashCode.Exclude
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private List<Role> roles;

    @EqualsAndHashCode.Exclude
    @OneToMany(mappedBy = "user")
    private List<UnlockingHistoryItem> unlockingHistoryItems;

    @EqualsAndHashCode.Exclude
    @OneToMany(mappedBy = "user")
    private List<UserToLockRelation> relatedLocks;


    public void addHistoryItem(UnlockingHistoryItem item) {
        unlockingHistoryItems.add(item);
        item.setUser(this);
    }

    private void deleteHistoryItem(UnlockingHistoryItem item) {
        unlockingHistoryItems.remove(item);
        item.setUser(null);
    }

    public void addRelatedLock(UserToLockRelation userToLockRelation) {
        relatedLocks.add(userToLockRelation);
        userToLockRelation.setUser(this);
    }

    public void deleteRelatedLock(UserToLockRelation userToLockRelation) {
        relatedLocks.remove(userToLockRelation);
        userToLockRelation.setUser(null);
    }
}
