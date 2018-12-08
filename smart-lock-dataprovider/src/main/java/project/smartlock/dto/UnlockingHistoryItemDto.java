package project.smartlock.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
public class UnlockingHistoryItemDto {

    private Long id;
    private LocalDate date;
    private LocalTime time;
    private String ipAddress;

    private UserDto user;

    private LockDto lock;

}
