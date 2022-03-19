package cc.au.hkzk.entity;

import lombok.Data;

import java.util.Date;

@Data
public class HkInfo {
    private String personname;
    private String certno;
    private Integer mobile;
    private String orgname;
    private String orgcode;
    private Integer status;
    private String cardnumber;
    private Integer cardstatus;
    private Date updtime;
}
