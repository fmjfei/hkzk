package cc.au.hkzk.entity;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Table(name="backupsync")
public class ZkBackup {
    private String deptno;
    private String deptname;
    private String empno;
    private String empname;
    private String cardId;
    private Date issueDate;
    private Date checkindt;
    private Date updtime;

    private Boolean isvalid; //false失效，true有效
    private Integer cardSequ;
    private Integer cardStatus; //1正常，2挂失
    private Date validDate;

    private Date synctime = new Date();
    private String remarks = "Default Add";
}
