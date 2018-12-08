package project.smartlock.data.mapper;

import org.mapstruct.Mapper;
import project.smartlock.data.dto.UserToLockRelationDto;
import project.smartlock.data.model.UserToLockRelation;

import java.util.List;

@Mapper(
        componentModel = "spring",
        uses = {UserDtoMapper.class, AccessLevelDtoMapper.class, LockDtoMapper.class}
)
public interface UserToLockRelationDtoMapper {

    UserToLockRelationDto entityToDto(UserToLockRelation userToLockRelation);
    UserToLockRelation dtoToEntity(UserToLockRelationDto userToLockRelationDto);

    List<UserToLockRelationDto> entityListToDtoList(List<UserToLockRelation> userToLockRelationList);
    List<UserToLockRelation> dtoListToEntityList(List<UserToLockRelationDto> userToLockRelationDtoList);
}
