package ru.sbercity.crm.mainmenuservice.controller;

import org.hibernate.envers.Audited;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.sbercity.crm.mainmenuservice.entity.LateralMenu;
import ru.sbercity.crm.mainmenuservice.mapper.LateralMenuMapper;
import ru.sbercity.crm.mainmenuservice.model.LateralMenuDto;
import ru.sbercity.crm.mainmenuservice.repository.LateralMenuRepository;
import ru.sbercity.crm.mainmenuservice.service.LateralMenuService;
import ru.sbercity.sdk.common.controller.MainAbstractPageableController;

@RequestMapping("/api/lateralmenu-service")
@RestController
public class LateralMenuController extends MainAbstractPageableController<LateralMenu, LateralMenuDto> {
    private final LateralMenuService lateralMenuService;
    private final LateralMenuMapper mapper;

    @Autowired
    public LateralMenuController(LateralMenuMapper mapper, LateralMenuRepository repository,LateralMenuService lateralMenuService) {
        super(LateralMenu.class,LateralMenuDto.class,mapper,repository);
        this.mapper=mapper;
        this.lateralMenuService=lateralMenuService;

    }
}
