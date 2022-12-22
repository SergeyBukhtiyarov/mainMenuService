package ru.sbercity.crm.mainmenuservice.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.envers.Audited;
import ru.sbercity.sdk.common.entity.IdEntity;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@Table(name = "lateral_menu")
@Audited
public class LateralMenu extends IdEntity implements Serializable {
    @Serial
    private static final long serialVersionUID =1L;

    @Column(name = "name")
    private String name;

    @Column(name = "url")
    private String url;

    @ManyToOne
    @JoinColumn(name = "top_menu_id")
    private TopMenu topMenuId;

    @Column(name = "number")
    private int number;

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
