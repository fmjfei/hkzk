package cc.au.hkzk.test;

import cc.au.hkzk.entity.HkEmployee;
import cc.au.hkzk.entity.ZkEmployee;
import cc.au.hkzk.mapper.hk.HkEmployeeMapper;
import cc.au.hkzk.mapper.zk.ZkEmployeeMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HumEmployeeMapperTest {

    @Autowired
    private ZkEmployeeMapper zkEmployeeMapper;

    @Autowired
    private HkEmployeeMapper hkEmployeeMapper;

    @Test
    public void test1(){
        List<ZkEmployee> zkEmployees = zkEmployeeMapper.selectAll();
        List<HkEmployee> hkEmployees = hkEmployeeMapper.selectAll();
    }
}