package project.smartlock.data.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
public class UserDto {

    private Long id;
    private String name;
    private String email;
    private String phone;
    private String language;

    private Boolean deleted;
    private Boolean active;
    private Boolean locked;


    private List<RoleDto> roles;

    private List<UnlockingHistoryItemDto> unlockingHistoryItems;

    private List<UserToLockRelationDto> relatedLocks;
}
