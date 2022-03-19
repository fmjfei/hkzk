package cc.au.hkzk.test;

import cc.au.hkzk.mapper.hk.HkInfoMapper;
import cc.au.hkzk.mapper.zk.ZkEmployeeMapper;
import cc.au.hkzk.service.EmpCardSync;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class HumEmployeeMapperTest {


    @Autowired
    private HkInfoMapper hkinfo;

    @Autowired
    private ZkEmployeeMapper zkemp;

    @Autowired
    private EmpCardSync empcardsync;



/*    @Test
    public void test2(){
        Long l = System.currentTimeMillis() / 1000;
        Date lastime = new Date((1640667537)*1000);
        Date lastime2 = new Date((l - (3600*24*75))*1000);
        Date lastime3 = new Date(l*1000);
        List<HkInfo> hklist = hkinfo.getUpdateInfo(lastime2);
//        List<ZkEmployee> zkemployees = zkemp.selectAll();
    }*/

    @Test
    public  void test3(){
        empcardsync.SyncZkData(1646064000000L);
    }
}