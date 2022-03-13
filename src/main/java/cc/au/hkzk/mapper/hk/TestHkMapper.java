package cc.au.hkzk.mapper.hk;

import cc.au.hkzk.entity.TestHk;
import cc.au.hkzk.util.ComMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface TestHkMapper extends ComMapper<TestHk> {
}
