package cc.au.hkzk.entity;


import lombok.Data;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigInteger;
import java.util.Date;

@Component
@Data
@Table(name="hum_employee")
public class TestHk {
  @Id
  @KeySql(useGeneratedKeys = true)
  private Long  id;
  private String empno;
  private String empname;
  private String deptno;
  private String deptname;
  private Boolean issued;
  private Integer cardtype;
  private BigInteger cardId;
  private BigInteger sysId;
  private Date issueDate;
}
