package cc.au.hkzk.entity;


import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="hum_employee")
public class HumEmployee {

  private long id;
  private String empNo;
  private String empName;
  private String empSex;
  private String nation;
  private java.sql.Timestamp birthday;
  private String familyAddr;
  private String familyTel;
  private String mobile;
  private String nativePlace;
  private java.sql.Timestamp checkinDt;
  private String deptNo;
  private String deptName;
  private String duty;
  private String titles;
  private String empType;
  private java.sql.Timestamp lzDate;
  private String lzCause;
  private String lzMode;
  private String blackFlag;
  private java.sql.Timestamp contractStartdt;
  private java.sql.Timestamp contractEnddt;
  private java.sql.Timestamp officialDate;
  private String status;
  private String insuranceNo;
  private String wedlock;
  private String idCard;
  private String photo;
  private double age;
  private String dorm;
  private String school;
  private String specialty;
  private String diploma;
  private java.sql.Timestamp idCardDate;
  private String bankAccount1;
  private String bankAccount2;
  private String cuser1;
  private String cuser2;
  private String cuser3;
  private String cuser4;
  private String cuser5;
  private String cuser6;
  private double ruser1;
  private double ruser2;
  private java.sql.Timestamp duser1;
  private java.sql.Timestamp duser2;
  private String operator;
  private java.sql.Timestamp modifyTime;
  private String remark;
  private long empid;
  private String cardid;
  private String fingerprint;
  private long emprivilege;
  private long pinl;
  private String cuser7;
  private String cuser8;
  private String cuser9;
  private String cuser10;
  private double ruser3;
  private double ruser4;
  private double ruser5;
  private double ruser6;
  private java.sql.Timestamp duser3;
  private java.sql.Timestamp duser4;
  private java.sql.Timestamp duser5;
  private java.sql.Timestamp duser6;
  private String issued;
  private String overPwd;
  private long cardtype;
  private double lastBalance;
  private java.sql.Timestamp lastDate;
  private long cardId;
  private long sysId;
  private java.sql.Timestamp issueDate;
  private String isreg;
  private String isdown;
  private String lzOperator;
  private long lastCardsequ;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getEmpNo() {
    return empNo;
  }

  public void setEmpNo(String empNo) {
    this.empNo = empNo;
  }


  public String getEmpName() {
    return empName;
  }

  public void setEmpName(String empName) {
    this.empName = empName;
  }


  public String getEmpSex() {
    return empSex;
  }

  public void setEmpSex(String empSex) {
    this.empSex = empSex;
  }


  public String getNation() {
    return nation;
  }

  public void setNation(String nation) {
    this.nation = nation;
  }


  public java.sql.Timestamp getBirthday() {
    return birthday;
  }

  public void setBirthday(java.sql.Timestamp birthday) {
    this.birthday = birthday;
  }


  public String getFamilyAddr() {
    return familyAddr;
  }

  public void setFamilyAddr(String familyAddr) {
    this.familyAddr = familyAddr;
  }


  public String getFamilyTel() {
    return familyTel;
  }

  public void setFamilyTel(String familyTel) {
    this.familyTel = familyTel;
  }


  public String getMobile() {
    return mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }


  public String getNativePlace() {
    return nativePlace;
  }

  public void setNativePlace(String nativePlace) {
    this.nativePlace = nativePlace;
  }


  public java.sql.Timestamp getCheckinDt() {
    return checkinDt;
  }

  public void setCheckinDt(java.sql.Timestamp checkinDt) {
    this.checkinDt = checkinDt;
  }


  public String getDeptNo() {
    return deptNo;
  }

  public void setDeptNo(String deptNo) {
    this.deptNo = deptNo;
  }


  public String getDeptName() {
    return deptName;
  }

  public void setDeptName(String deptName) {
    this.deptName = deptName;
  }


  public String getDuty() {
    return duty;
  }

  public void setDuty(String duty) {
    this.duty = duty;
  }




  public String getTitles() {
    return titles;
  }

  public void setTitles(String titles) {
    this.titles = titles;
  }


  public String getEmpType() {
    return empType;
  }

  public void setEmpType(String empType) {
    this.empType = empType;
  }


  public java.sql.Timestamp getLzDate() {
    return lzDate;
  }

  public void setLzDate(java.sql.Timestamp lzDate) {
    this.lzDate = lzDate;
  }


  public String getLzCause() {
    return lzCause;
  }

  public void setLzCause(String lzCause) {
    this.lzCause = lzCause;
  }


  public String getLzMode() {
    return lzMode;
  }

  public void setLzMode(String lzMode) {
    this.lzMode = lzMode;
  }


  public String getBlackFlag() {
    return blackFlag;
  }

  public void setBlackFlag(String blackFlag) {
    this.blackFlag = blackFlag;
  }


  public java.sql.Timestamp getContractStartdt() {
    return contractStartdt;
  }

  public void setContractStartdt(java.sql.Timestamp contractStartdt) {
    this.contractStartdt = contractStartdt;
  }


  public java.sql.Timestamp getContractEnddt() {
    return contractEnddt;
  }

  public void setContractEnddt(java.sql.Timestamp contractEnddt) {
    this.contractEnddt = contractEnddt;
  }


  public java.sql.Timestamp getOfficialDate() {
    return officialDate;
  }

  public void setOfficialDate(java.sql.Timestamp officialDate) {
    this.officialDate = officialDate;
  }


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  public String getInsuranceNo() {
    return insuranceNo;
  }

  public void setInsuranceNo(String insuranceNo) {
    this.insuranceNo = insuranceNo;
  }


  public String getWedlock() {
    return wedlock;
  }

  public void setWedlock(String wedlock) {
    this.wedlock = wedlock;
  }


  public String getIdCard() {
    return idCard;
  }

  public void setIdCard(String idCard) {
    this.idCard = idCard;
  }


  public String getPhoto() {
    return photo;
  }

  public void setPhoto(String photo) {
    this.photo = photo;
  }


  public double getAge() {
    return age;
  }

  public void setAge(double age) {
    this.age = age;
  }


  public String getDorm() {
    return dorm;
  }

  public void setDorm(String dorm) {
    this.dorm = dorm;
  }


  public String getSchool() {
    return school;
  }

  public void setSchool(String school) {
    this.school = school;
  }


  public String getSpecialty() {
    return specialty;
  }

  public void setSpecialty(String specialty) {
    this.specialty = specialty;
  }


  public String getDiploma() {
    return diploma;
  }

  public void setDiploma(String diploma) {
    this.diploma = diploma;
  }


  public java.sql.Timestamp getIdCardDate() {
    return idCardDate;
  }

  public void setIdCardDate(java.sql.Timestamp idCardDate) {
    this.idCardDate = idCardDate;
  }


  public String getBankAccount1() {
    return bankAccount1;
  }

  public void setBankAccount1(String bankAccount1) {
    this.bankAccount1 = bankAccount1;
  }


  public String getBankAccount2() {
    return bankAccount2;
  }

  public void setBankAccount2(String bankAccount2) {
    this.bankAccount2 = bankAccount2;
  }


  public String getCuser1() {
    return cuser1;
  }

  public void setCuser1(String cuser1) {
    this.cuser1 = cuser1;
  }


  public String getCuser2() {
    return cuser2;
  }

  public void setCuser2(String cuser2) {
    this.cuser2 = cuser2;
  }


  public String getCuser3() {
    return cuser3;
  }

  public void setCuser3(String cuser3) {
    this.cuser3 = cuser3;
  }


  public String getCuser4() {
    return cuser4;
  }

  public void setCuser4(String cuser4) {
    this.cuser4 = cuser4;
  }


  public String getCuser5() {
    return cuser5;
  }

  public void setCuser5(String cuser5) {
    this.cuser5 = cuser5;
  }


  public String getCuser6() {
    return cuser6;
  }

  public void setCuser6(String cuser6) {
    this.cuser6 = cuser6;
  }


  public double getRuser1() {
    return ruser1;
  }

  public void setRuser1(double ruser1) {
    this.ruser1 = ruser1;
  }


  public double getRuser2() {
    return ruser2;
  }

  public void setRuser2(double ruser2) {
    this.ruser2 = ruser2;
  }


  public java.sql.Timestamp getDuser1() {
    return duser1;
  }

  public void setDuser1(java.sql.Timestamp duser1) {
    this.duser1 = duser1;
  }


  public java.sql.Timestamp getDuser2() {
    return duser2;
  }

  public void setDuser2(java.sql.Timestamp duser2) {
    this.duser2 = duser2;
  }


  public String getOperator() {
    return operator;
  }

  public void setOperator(String operator) {
    this.operator = operator;
  }


  public java.sql.Timestamp getModifyTime() {
    return modifyTime;
  }

  public void setModifyTime(java.sql.Timestamp modifyTime) {
    this.modifyTime = modifyTime;
  }


  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }


  public long getEmpid() {
    return empid;
  }

  public void setEmpid(long empid) {
    this.empid = empid;
  }


  public String getCardid() {
    return cardid;
  }

  public void setCardid(String cardid) {
    this.cardid = cardid;
  }


  public String getFingerprint() {
    return fingerprint;
  }

  public void setFingerprint(String fingerprint) {
    this.fingerprint = fingerprint;
  }


  public long getEmprivilege() {
    return emprivilege;
  }

  public void setEmprivilege(long emprivilege) {
    this.emprivilege = emprivilege;
  }


  public long getPinl() {
    return pinl;
  }

  public void setPinl(long pinl) {
    this.pinl = pinl;
  }


  public String getCuser7() {
    return cuser7;
  }

  public void setCuser7(String cuser7) {
    this.cuser7 = cuser7;
  }


  public String getCuser8() {
    return cuser8;
  }

  public void setCuser8(String cuser8) {
    this.cuser8 = cuser8;
  }


  public String getCuser9() {
    return cuser9;
  }

  public void setCuser9(String cuser9) {
    this.cuser9 = cuser9;
  }


  public String getCuser10() {
    return cuser10;
  }

  public void setCuser10(String cuser10) {
    this.cuser10 = cuser10;
  }


  public double getRuser3() {
    return ruser3;
  }

  public void setRuser3(double ruser3) {
    this.ruser3 = ruser3;
  }


  public double getRuser4() {
    return ruser4;
  }

  public void setRuser4(double ruser4) {
    this.ruser4 = ruser4;
  }


  public double getRuser5() {
    return ruser5;
  }

  public void setRuser5(double ruser5) {
    this.ruser5 = ruser5;
  }


  public double getRuser6() {
    return ruser6;
  }

  public void setRuser6(double ruser6) {
    this.ruser6 = ruser6;
  }


  public java.sql.Timestamp getDuser3() {
    return duser3;
  }

  public void setDuser3(java.sql.Timestamp duser3) {
    this.duser3 = duser3;
  }


  public java.sql.Timestamp getDuser4() {
    return duser4;
  }

  public void setDuser4(java.sql.Timestamp duser4) {
    this.duser4 = duser4;
  }


  public java.sql.Timestamp getDuser5() {
    return duser5;
  }

  public void setDuser5(java.sql.Timestamp duser5) {
    this.duser5 = duser5;
  }


  public java.sql.Timestamp getDuser6() {
    return duser6;
  }

  public void setDuser6(java.sql.Timestamp duser6) {
    this.duser6 = duser6;
  }


  public String getIssued() {
    return issued;
  }

  public void setIssued(String issued) {
    this.issued = issued;
  }


  public String getOverPwd() {
    return overPwd;
  }

  public void setOverPwd(String overPwd) {
    this.overPwd = overPwd;
  }


  public long getCardtype() {
    return cardtype;
  }

  public void setCardtype(long cardtype) {
    this.cardtype = cardtype;
  }


  public double getLastBalance() {
    return lastBalance;
  }

  public void setLastBalance(double lastBalance) {
    this.lastBalance = lastBalance;
  }


  public java.sql.Timestamp getLastDate() {
    return lastDate;
  }

  public void setLastDate(java.sql.Timestamp lastDate) {
    this.lastDate = lastDate;
  }


  public long getCardId() {
    return cardId;
  }

  public void setCardId(long cardId) {
    this.cardId = cardId;
  }


  public long getSysId() {
    return sysId;
  }

  public void setSysId(long sysId) {
    this.sysId = sysId;
  }


  public java.sql.Timestamp getIssueDate() {
    return issueDate;
  }

  public void setIssueDate(java.sql.Timestamp issueDate) {
    this.issueDate = issueDate;
  }


  public String getIsreg() {
    return isreg;
  }

  public void setIsreg(String isreg) {
    this.isreg = isreg;
  }


  public String getIsdown() {
    return isdown;
  }

  public void setIsdown(String isdown) {
    this.isdown = isdown;
  }


  public String getLzOperator() {
    return lzOperator;
  }

  public void setLzOperator(String lzOperator) {
    this.lzOperator = lzOperator;
  }


  public long getLastCardsequ() {
    return lastCardsequ;
  }

  public void setLastCardsequ(long lastCardsequ) {
    this.lastCardsequ = lastCardsequ;
  }

}
