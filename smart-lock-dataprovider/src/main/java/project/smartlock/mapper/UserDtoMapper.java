package project.smartlock.mapper;

import org.mapstruct.Mapper;
import project.smartlock.dto.UserDto;
import project.smartlock.model.User;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserDtoMapper {

    UserDto entityToDto(User user);
    User dtoToEntity(UserDto userDto);

    List<UserDto> entityListToDtoList(List<User> users);
    List<User> dtoListToEntityList(List<UserDto> userDtoList);
}
