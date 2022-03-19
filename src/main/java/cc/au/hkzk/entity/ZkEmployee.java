package cc.au.hkzk.entity;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Table(name="hum_employee")
public class ZkEmployee {
/*    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;*/
    private String empno;
    private String empname;
    private String deptno;
    private String deptname;
    private Date checkindt;
    private Integer ruser2 = 0;
    private String operator;
    private Date modifytime;
    private Integer emprivilege = 0;
    private Boolean issued = true;
    private String overPwd = "123456";
    private Integer cardtype;
    private String sysId;
    private String cardId;
    private Date issueDate;
    private Boolean isreg = false;

}
