package cc.au.hkzk.service;

import cc.au.hkzk.entity.HkInfo;
import cc.au.hkzk.entity.ZkCardinfo;
import cc.au.hkzk.entity.ZkEmployee;
import cc.au.hkzk.entity.ZkMchargere;
import cc.au.hkzk.mapper.hk.HkInfoMapper;
import cc.au.hkzk.mapper.zk.ZkCardinfoMapper;
import cc.au.hkzk.mapper.zk.ZkEmployeeMapper;
import cc.au.hkzk.mapper.zk.ZkMchargereMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.Date;
import java.util.List;

@Slf4j
@Component
public class EmpCardSync {

    @Autowired
    HkInfoMapper hkinfo;

    @Autowired
    ZkCardinfoMapper zkcard;

    @Autowired
    ZkEmployeeMapper zkemp;

    @Autowired
    ZkMchargereMapper zkmcharg;

    @Transactional(rollbackFor = Exception.class)
    public String SyncZkData(Long testDate){

        Date boundary = null;
        if(0L == testDate) {
            boundary = hkinfo.getNowTime();
            log.warn("HKDB");
        }
        else{
            boundary = new Date(testDate);  // 1646064000000L 22年3月1日
            log.debug("TEST指定日期之后的数据::"+boundary.toString());
        }
        List<HkInfo> hkinfos = hkinfo.getUpdateInfo(boundary);
        String result = "需要更新"+hkinfos.size()+"条数据:";
        for(HkInfo hki:hkinfos){

/*            //Temp TEST
            result += "<br>TEST::" + hki.toString();
            continue;*/

            if(-1 == hki.getStatus()){
                //老员工离职
                log.debug("老员工离职--->");
                //TODO 暂且认为删除离职员工卡号没有问题，不影响原有刷卡记录，但需要测试
                int delc2 = zkcard.deleteByPrimaryKey(hki.getCardnumber());
                int delc3 = zkmcharg.deleteByPrimaryKey(hki.getCardnumber());

                Example zkedel = new Example(ZkEmployee.class);
                zkedel.createCriteria().andEqualTo("empno",hki.getCertno());
                int delc1 = zkemp.deleteByExample(zkedel);

                String res = "老员工"+hki.toString()+"离职删除信息"+delc1+"行，删除卡信息"+delc2+"行和"+delc3+"行";
                log.debug(res);
                result = result + "\n<br>" + res;

            } else if (newEmp(hki.getCertno())) {
                //新员工新卡
                log.debug("新员工新卡--->");
                if(-1 == hki.getCardstatus()){
                    log.debug("新员工卡信息无效，跳过。");
                    continue;
                }
                ZkEmployee newemp = new ZkEmployee();
                int i1 = zkemp.insert(setNewEmp(hki));
                int i2 = zkcard.insert(setNewCard(hki));
                int i3 = zkmcharg.insert(setNewMc(hki));

                String res = "新员工"+hki.toString()+"插入"+i1+"行人员信息，"+i2+"行卡信息，"+i3+"行卡辅助信息";
                log.debug(res);
                result = result + "\n<br>" + res;
            } else if (-1 == hki.getCardstatus()) {
                //老员工旧卡删除
                log.debug("老员工旧卡删除--->");
                int delc1 = zkcard.deleteByPrimaryKey(hki.getCardnumber());
                int delc2 = zkmcharg.deleteByPrimaryKey(hki.getCardnumber());

                String res = "老员工"+hki.toString()+"删除旧卡数据"+delc1+"和"+delc2+"行";
                log.debug(res);
                result = result + "\n<br>" + res;
            } else if (newCard(hki.getCardnumber())){
                //老员工增加新卡
                log.debug("老员工增加新卡--->");
                int in1 = zkcard.insert(setNewCard(hki));
                int in2 = zkmcharg.insert(setNewMc(hki));

                Example zkeupd = new Example(ZkEmployee.class);
                zkeupd.createCriteria().andEqualTo("empno",hki.getCertno());
                int updc1 = zkemp.updateByExampleSelective(setNewEmp(hki),zkeupd);

                String res = "老员工"+hki.toString()+"新增新卡数据"+in1+"和"+in2+"行,更新绑定信息"+updc1+"行";
                log.debug(res);
                result = result + "\n<br>" + res;
            } else {
                //老员工信息变更
                log.debug("老员工信息变更--->");
                int u1 = zkcard.updateByPrimaryKey(setNewCard(hki));
                int u2 = zkmcharg.updateByPrimaryKey(setNewMc(hki));

                Example zkesel = new Example(ZkEmployee.class);
                zkesel.createCriteria().andEqualTo("empno",hki.getCertno());
                int u3 = zkemp.updateByExampleSelective(setNewEmp(hki),zkesel);

                String res = "老员工"+hki.toString()+"更新"+u3+"行人员信息，"+u1+"行卡信息，"+u2+"行卡辅助信息";
                log.debug(res);
                result = result + "\n<br>" + res;
            }
        }
        log.warn(result);
        return result;
    }

    private boolean newEmp(String empno){
        Example zkesel = new Example(ZkEmployee.class);
        zkesel.createCriteria().andEqualTo("empno",empno);
        ZkEmployee zke = zkemp.selectOneByExample(zkesel);
        return null == zke || null == zke.getEmpno();
    }

    private boolean newCard(String cardno){
        ZkCardinfo zkc = zkcard.selectByPrimaryKey(cardno);
        return null == zkc || null == zkc.getCardId();
    }

    private ZkEmployee setNewEmp(HkInfo hk){
        ZkEmployee newemp = new ZkEmployee();
        newemp.setCardId(hk.getCardnumber());
        newemp.setSysId(hk.getCardnumber());
        newemp.setCardtype(hk.getMobile()); //事先约定好
        newemp.setEmpno(hk.getCertno());
        newemp.setEmpname(hk.getPersonname());
        newemp.setDeptname(hk.getOrgname());
        newemp.setDeptno(hk.getOrgcode());
        newemp.setOperator("AUTO");
        newemp.setModifytime(new Date());
        newemp.setIssueDate(new Date());
        newemp.setCheckindt(new Date());
        return newemp;
    }

    private ZkCardinfo setNewCard(HkInfo hk){
        ZkCardinfo newcard = new ZkCardinfo();
        newcard.setSysId(hk.getCardnumber());
        newcard.setCardId(hk.getCardnumber());
        newcard.setEmpname(hk.getPersonname());
        newcard.setEmpno(hk.getCertno());
        newcard.setDeptname(hk.getOrgname());
        newcard.setDeptno(hk.getOrgcode());
        newcard.setIssueDate(new Date());
        newcard.setIsvalid(true);
        newcard.setCardSequ(1);
        newcard.setOrderdate(new Date(946656000000L));
        newcard.setCardStatus(1);
        newcard.setValidDate(new Date(4070880000000L));
        return newcard;
    }

    private ZkMchargere setNewMc(HkInfo hk){
        ZkMchargere newmc = new ZkMchargere();
        newmc.setEmpId(hk.getCertno());
        newmc.setEmpname(hk.getPersonname());
        newmc.setCardId(hk.getCardnumber());
        newmc.setSysId(hk.getCardnumber());
        newmc.setOpDate(new Date());
        newmc.setOpYmd(new Date());
        newmc.setCardSequ(1);
        newmc.setDeptname(hk.getOrgname());
        newmc.setDeptno(hk.getOrgcode());
        return newmc;
    }
}
