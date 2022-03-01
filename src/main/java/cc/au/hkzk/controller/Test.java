package cc.au.hkzk.controller;

import cc.au.hkzk.entity.HkEmployee;
import cc.au.hkzk.entity.ZkEmployee;
import cc.au.hkzk.mapper.hk.HkEmployeeMapper;
import cc.au.hkzk.mapper.zk.ZkEmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Test {
    @Autowired
    private ZkEmployeeMapper userInfoOneMapper;
    @Autowired
    private HkEmployeeMapper userInfoTwoMapper;


    @RequestMapping("/getOneUserById")
    public ZkEmployee getOneUserById(Long id){
        ZkEmployee entity = new ZkEmployee();
        entity.setId(id);
        ZkEmployee entity1 = userInfoOneMapper.selectOne(entity);
        return entity1;
    }

    @RequestMapping("/getAllUserForOne")
    public List<ZkEmployee> getAllUserForOne(){
        List<ZkEmployee> allUser = userInfoOneMapper.selectAll();
        return allUser;
    }

    @RequestMapping("/getTwoUserById")
    public HkEmployee getTwoUserById(Long id){
        HkEmployee entity = new HkEmployee();
        entity.setId(id);
        HkEmployee entity1 = userInfoTwoMapper.selectOne(entity);
        return entity1;
    }

    @RequestMapping("/getAllUserForTwo")
    public List<HkEmployee> getAllUserForTwo(){
        List<HkEmployee> allUser = userInfoTwoMapper.selectAll();
        return allUser;
    }
}