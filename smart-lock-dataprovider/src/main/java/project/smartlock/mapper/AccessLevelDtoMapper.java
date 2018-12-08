package project.smartlock.mapper;

import org.mapstruct.Mapper;
import project.smartlock.dto.AccessLevelDto;
import project.smartlock.model.AccessLevel;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AccessLevelDtoMapper {

    AccessLevelDto entityToDto(AccessLevel accessLevel);
    AccessLevel dtoToEntity(AccessLevelDto accessLevelDto);

    List<AccessLevelDto> entityListToDtoList(List<AccessLevel> accessLevelList);
    List<AccessLevel> dtoListToEntityList(List<AccessLevelDto> accessLevelDtoList);
    
}
