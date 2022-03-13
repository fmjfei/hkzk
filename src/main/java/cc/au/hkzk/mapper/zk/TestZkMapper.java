package cc.au.hkzk.mapper.zk;

import cc.au.hkzk.entity.TestZk;
import cc.au.hkzk.util.ComMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface TestZkMapper extends ComMapper<TestZk> {
}
