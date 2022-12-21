package ru.sbercity.crm.mainmenuservice.model;

import lombok.Data;
import ru.sbercity.crm.mainmenuservice.entity.MainMenu;

import java.util.Date;
import java.util.UUID;

@Data
public class TopMenuDto {

    private UUID id;
    private String name;
    private String url;
    private MainMenu mainMenu;
    private int number;
    //    private Date createdDate;
//    private UUID createdBy;
//    private Date lastModifiedDate;
//    private UUID lastModifiedBy;
    private Date deletedDate;
    private Date deletedBy;
    private Boolean isDelete;


}
