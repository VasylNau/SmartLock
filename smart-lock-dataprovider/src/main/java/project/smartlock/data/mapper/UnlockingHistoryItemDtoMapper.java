package project.smartlock.data.mapper;

import org.mapstruct.Mapper;
import project.smartlock.data.dto.UnlockingHistoryItemDto;
import project.smartlock.data.model.UnlockingHistoryItem;

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
