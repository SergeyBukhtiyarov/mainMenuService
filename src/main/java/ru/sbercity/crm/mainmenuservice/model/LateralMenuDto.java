package ru.sbercity.crm.mainmenuservice.model;

import lombok.Data;
import ru.sbercity.crm.mainmenuservice.entity.TopMenu;

import java.util.Date;
import java.util.UUID;

@Data
public class LateralMenuDto {
    private UUID id;
    private String name;
    private String url;
    private TopMenu topMenu;
    private int number;
    //    private Date createdDate;
//    private UUID createdBy;
//    private Date lastModifiedDate;
//    private UUID lastModifiedBy;
    private Date deletedDate;
    private Date deletedBy;
    private Boolean isDelete;


}
