package ru.sbercity.crm.mainmenuservice.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.sbercity.crm.mainmenuservice.entity.LateralMenu;

import java.util.UUID;

@Repository
public interface LateralMenuRepository extends PagingAndSortingRepository<LateralMenu,UUID> {
}
