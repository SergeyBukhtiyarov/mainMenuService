package ru.sbercity.crm.mainmenuservice.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.envers.Audited;
import ru.sbercity.sdk.common.entity.IdEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serial;
import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@Table(name = "main_menu")
@Audited
public class MainMenu extends IdEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Column(name = "name")
    private String name;

    @Column(name = "rule_id")
    private UUID ruleId;

//    @Column(name = "created_date")
//    private Date createdDate;
//
//    @Column(name = "created_by")
//    private UUID createdBy;
//
//    @Column(name = "last_modified_date")
//    private Date lastModifiedDate;
//
//    @Column(name = "last_modified_by")
//    private UUID lastModifiedBy;

    @Column(name = "deleted_date")
    private Date deletedDate;

    @Column(name = "deleted_by")
    private Date deletedBy;

    @Column(name = "is_deleted")
    private Boolean isDelete;




}
