package ru.sbercity.crm.mainmenuservice.model;

import lombok.Data;
import ru.sbercity.sdk.common.model.AuditEntityDto;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@Data
public class MainMenuDto extends AuditEntityDto implements Serializable {
    private UUID id;
    private String name;
    private UUID ruleId;
//    private Date createdDate;
//    private UUID createdBy;
//    private Date lastModifiedDate;
//    private UUID lastModifiedBy;
    private Date deletedDate;
    private Date deletedBy;
    private Boolean isDelete;




}
