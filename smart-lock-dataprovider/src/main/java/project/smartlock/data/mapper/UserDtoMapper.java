package project.smartlock.data.mapper;

import org.mapstruct.Mapper;
import project.smartlock.data.dto.UserDto;
import project.smartlock.data.model.User;

import java.util.List;

@Mapper(
        componentModel = "spring",
        uses = {RoleDtoMapper.class,
                UserToLockRelationDtoMapper.class,
                UnlockingHistoryItemDtoMapper.class}
)
public interface UserDtoMapper {

    UserDto entityToDto(User user);
    User dtoToEntity(UserDto userDto);

    List<UserDto> entityListToDtoList(List<User> users);
    List<User> dtoListToEntityList(List<UserDto> userDtoList);
}
