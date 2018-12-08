package project.smartlock.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
public class LockDto {

    private Long id;

    private String name;
    private String description;

    private Boolean active;
    private Boolean deleted;

    private List<UnlockingHistoryItemDto> unlockingHistoryItems;
    private List<UserToLockRelationDto> relatedUsers;
}
