package cc.au.hkzk.test;

import cc.au.hkzk.entity.HumEmployee;
import cc.au.hkzk.mapper.zk.HumEmployeeMapper;
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
    private HumEmployeeMapper humEmployeeMapper;

    @Test
    public void test1(){
        List<HumEmployee> humEmployees = humEmployeeMapper.selectAll();
    }
}