package ru.sbercity.crm.mainmenuservice.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import ru.sbercity.crm.mainmenuservice.entity.MainMenu;
import ru.sbercity.crm.mainmenuservice.entity.TopMenu;
import ru.sbercity.crm.mainmenuservice.model.MainMenuDto;
import ru.sbercity.crm.mainmenuservice.model.TopMenuDto;
import ru.sbercity.sdk.common.mapper.GenericMapper;

@Mapper(componentModel = "spring", uses = ReferenceMapper.class)
public interface TopMenuMapper extends GenericMapper<TopMenu, TopMenuDto> {
    @Override
    @Mapping(target = "id", ignore = false)
    TopMenu asEntity(TopMenuDto dto);
}
