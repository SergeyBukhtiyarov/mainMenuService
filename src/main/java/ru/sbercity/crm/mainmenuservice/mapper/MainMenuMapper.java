package ru.sbercity.crm.mainmenuservice.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import ru.sbercity.crm.mainmenuservice.entity.MainMenu;
import ru.sbercity.crm.mainmenuservice.model.MainMenuDto;
import ru.sbercity.sdk.common.mapper.GenericMapper;

@Mapper(componentModel = "spring", uses = ReferenceMapper.class)
public interface MainMenuMapper extends GenericMapper<MainMenu, MainMenuDto> {
    @Override
    @Mapping(target = "id", ignore = false)
    MainMenu asEntity(MainMenuDto dto);
}
