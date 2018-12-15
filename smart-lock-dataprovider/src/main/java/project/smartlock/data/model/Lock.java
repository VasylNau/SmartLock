package project.smartlock.data.model;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter @Setter
@EqualsAndHashCode
public class Lock {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String description;

    @Getter(AccessLevel.NONE) private Boolean active;
    @Getter(AccessLevel.NONE) private Boolean deleted;

    @EqualsAndHashCode.Exclude
    @OneToMany(mappedBy = "lock")
    private List<UnlockingHistoryItem> unlockingHistoryItems;

    @EqualsAndHashCode.Exclude
    @OneToMany(mappedBy = "lock")
    private List<UserToLockRelation> relatedUsers;


    public void addHistoryItem(UnlockingHistoryItem item) {
        unlockingHistoryItems.add(item);
        item.setLock(this);
    }

    private void deleteHistoryItem(UnlockingHistoryItem item) {
        unlockingHistoryItems.remove(item);
        item.setLock(null);
    }


    public void addRelatedUser(UserToLockRelation userToLockRelation) {
        relatedUsers.add(userToLockRelation);
        userToLockRelation.setLock(this);
    }

    public void deleteRelatedUser(UserToLockRelation userToLockRelation) {
        relatedUsers.remove(userToLockRelation);
        userToLockRelation.setLock(null);
    }

    public Boolean isActive() {
        return active;
    }

    public Boolean isDeleted() {
        return deleted;
    }

}
