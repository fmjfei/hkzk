package cc.au.hkzk.entity;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Table(name="mchargerecords")
public class ZkMchargere {
    private String empId;
    private String empname;
    @Id
    private String sysId;
    private String cardId;
    private Double chargeMoney = 0.00;
    private Double cardBalance = 0.00;
    private Date opDate;
    private Date opYmd;
    private Integer kind = 0;
    private Integer cardSequ;
    private Integer clockId = 0;
    private String opcardId = "AUTO";
    private String deptno;
    private String deptname;
}
