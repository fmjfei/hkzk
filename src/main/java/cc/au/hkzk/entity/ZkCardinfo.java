package cc.au.hkzk.entity;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Table(name="cardinfo")
public class ZkCardinfo {
    private String empno;
    private String empname;
    @Id
    private String sysId;
    private String cardId;
    private Date issueDate;
    private Double cardBalance = 0.00;
    private Boolean isvalid; //false失效，true有效
    private Integer cardSequ;
    private Integer chargeVer = 0;
    private Date orderdate;
    private Integer ordertype = 0;
    private Integer orderlev = 0;
    private Integer cardStatus; //1正常，2挂失
    private Date validDate;
    private String deptno;
    private String deptname;
}
