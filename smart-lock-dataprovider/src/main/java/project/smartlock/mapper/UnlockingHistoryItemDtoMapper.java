package project.smartlock.mapper;

import org.mapstruct.Mapper;
import project.smartlock.dto.UnlockingHistoryItemDto;
import project.smartlock.model.UnlockingHistoryItem;

import java.util.List;

@Mapper(
        componentModel = "spring",
        uses = {UserDtoMapper.class, LockDtoMapper.class}
)
public interface UnlockingHistoryItemDtoMapper {

    UnlockingHistoryItemDto entityToDto(UnlockingHistoryItem unlockingHistoryItem);
    UnlockingHistoryItem dtoToEntity(UnlockingHistoryItemDto unlockingHistoryItemDto);

    List<UnlockingHistoryItemDto> entityListToDtoList(List<UnlockingHistoryItem> unlockingHistoryItems);
    List<UnlockingHistoryItem> dtoListToEntityList(List<UnlockingHistoryItemDto> unlockingHistoryItemDtoList);
}
