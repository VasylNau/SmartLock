package project.smartlock.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UnlockingHistoryItemDto {

    private Long id;
    private String date;
    private String time;
    private String ipAddress;

    private UserDto user;
    private LockDto lock;

}
