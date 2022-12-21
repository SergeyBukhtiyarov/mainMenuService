package ru.sbercity.crm.mainmenuservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.sbercity.crm.mainmenuservice.entity.MainMenu;
import ru.sbercity.crm.mainmenuservice.mapper.MainMenuMapper;
import ru.sbercity.crm.mainmenuservice.model.MainMenuDto;
import ru.sbercity.crm.mainmenuservice.repository.MainMenuRepository;
import ru.sbercity.crm.mainmenuservice.service.MainMenuService;
import ru.sbercity.sdk.common.controller.MainAbstractPageableController;

@RequestMapping("/api/mainmenu-service")
@RestController
public class MainMenuController extends MainAbstractPageableController<MainMenu,MainMenuDto> {
    private final MainMenuService mainMenuService;
    private final MainMenuMapper mapper;

    @Autowired
    public  MainMenuController(MainMenuMapper mapper, MainMenuRepository repository,MainMenuService mainMenuService){
        super(MainMenu.class,MainMenuDto.class,mapper, repository);
        this.mapper=mapper;
        this.mainMenuService=mainMenuService;
    }

}
