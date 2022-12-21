package ru.sbercity.crm.mainmenuservice.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import ru.sbercity.crm.mainmenuservice.entity.TopMenu;

import java.util.UUID;

@Repository
public interface TopMenuRepository extends PagingAndSortingRepository<TopMenu, UUID> {
}
