package cc.au.hkzk.controller;

import cc.au.hkzk.entity.TestHk;
import cc.au.hkzk.entity.TestZk;
import cc.au.hkzk.mapper.hk.TestHkMapper;
import cc.au.hkzk.mapper.zk.TestZkMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Test {
    @Autowired
    private TestZkMapper userInfoOneMapper;
    @Autowired
    private TestHkMapper userInfoTwoMapper;


    @RequestMapping("/getOneUserById")
    public TestZk getOneUserById(Long id){
        TestZk entity = new TestZk();
        entity.setId(id);
        TestZk entity1 = userInfoOneMapper.selectOne(entity);
        return entity1;
    }

    @RequestMapping("/getAllUserForOne")
    public List<TestZk> getAllUserForOne(){
        List<TestZk> allUser = userInfoOneMapper.selectAll();
        return allUser;
    }

    @RequestMapping("/getTwoUserById")
    public TestHk getTwoUserById(Long id){
        TestHk entity = new TestHk();
        entity.setId(id);
        TestHk entity1 = userInfoTwoMapper.selectOne(entity);
        return entity1;
    }

    @RequestMapping("/getAllUserForTwo")
    public List<TestHk> getAllUserForTwo(){
        List<TestHk> allUser = userInfoTwoMapper.selectAll();
        return allUser;
    }
}