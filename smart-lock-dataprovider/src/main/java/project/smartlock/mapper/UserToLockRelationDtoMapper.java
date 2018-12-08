package project.smartlock.mapper;

import org.mapstruct.Mapper;
import project.smartlock.dto.UserToLockRelationDto;
import project.smartlock.model.User;
import project.smartlock.model.UserToLockRelation;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserToLockRelationDtoMapper {

    UserToLockRelationDto entityToDto(UserToLockRelation userToLockRelation);
    UserToLockRelation dtoToEntity(UserToLockRelationDto userToLockRelationDto);

    List<UserToLockRelationDto> entityListToDtoList(List<UserToLockRelation> userToLockRelationList);
    List<User> dtoListToEntityList(List<UserToLockRelationDto> userToLockRelationDtoList);
}
