package project.smartlock.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class UserToLockRelationDto {

    private Long id;
    private UserDto user;
    private LockDto lock;
    private AccessLevelDto accessLevel;

}
