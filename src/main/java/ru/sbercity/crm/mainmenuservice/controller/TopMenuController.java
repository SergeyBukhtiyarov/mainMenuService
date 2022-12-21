package ru.sbercity.crm.mainmenuservice.controller;

import org.hibernate.envers.Audited;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.sbercity.crm.mainmenuservice.entity.MainMenu;
import ru.sbercity.crm.mainmenuservice.entity.TopMenu;
import ru.sbercity.crm.mainmenuservice.mapper.TopMenuMapper;
import ru.sbercity.crm.mainmenuservice.model.MainMenuDto;
import ru.sbercity.crm.mainmenuservice.model.TopMenuDto;
import ru.sbercity.crm.mainmenuservice.repository.TopMenuRepository;
import ru.sbercity.crm.mainmenuservice.service.TopMenuService;
import ru.sbercity.sdk.common.controller.MainAbstractPageableController;

@RestController
@RequestMapping("/api/topmenu-service")
public class TopMenuController extends MainAbstractPageableController<TopMenu, TopMenuDto> {
    private final TopMenuService topMenuService;
    private final TopMenuMapper mapper;

    @Autowired
    public TopMenuController(TopMenuMapper mapper, TopMenuRepository repository, TopMenuService topMenuService) {
        super(TopMenu.class,TopMenuDto.class,mapper,repository);
        this.mapper=mapper;
        this.topMenuService=topMenuService;
    }


}
