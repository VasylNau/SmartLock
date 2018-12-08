package project.smartlock.data.mapper;

import org.mapstruct.Mapper;
import project.smartlock.data.dto.LockDto;
import project.smartlock.data.model.Lock;

import java.util.List;

@Mapper(
        componentModel = "spring",
        uses = {UserToLockRelationDtoMapper.class, UnlockingHistoryItemDtoMapper.class}
)
public interface LockDtoMapper {

    LockDto entityToDto(Lock lock);
    Lock dtoToEntity(LockDto lockDto);

    List<LockDto> entityListToDtoList(List<Lock> locks);
    List<Lock> dtoListToEntityList(List<LockDto> lockDtoList);
    
}
