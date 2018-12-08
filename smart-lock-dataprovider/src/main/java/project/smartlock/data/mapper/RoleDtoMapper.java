package project.smartlock.data.mapper;

import org.mapstruct.Mapper;
import project.smartlock.data.dto.RoleDto;
import project.smartlock.data.model.Role;

import java.util.List;

@Mapper(componentModel = "spring")
public interface RoleDtoMapper {

    RoleDto entityToDto(Role role);
    Role dtoToEntity(RoleDto roleDto);

    List<RoleDto> entityListToDtoList(List<Role> roles);
    List<Role> dtoListToEntityList(List<RoleDto> roleDtoList);
}
