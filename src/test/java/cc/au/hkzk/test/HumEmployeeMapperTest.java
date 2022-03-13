package cc.au.hkzk.test;

import cc.au.hkzk.entity.TestHk;
import cc.au.hkzk.entity.TestZk;
import cc.au.hkzk.mapper.hk.TestHkMapper;
import cc.au.hkzk.mapper.zk.TestZkMapper;
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
    private TestZkMapper testZkMapper;

    @Autowired
    private TestHkMapper testHkMapper;

    @Test
    public void test1(){
        List<TestZk> testZks = testZkMapper.selectAll();
        List<TestHk> testHks = testHkMapper.selectAll();
    }
}