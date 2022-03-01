package cc.au.hkzk.mapper.hk;

import cc.au.hkzk.entity.HkEmployee;
import cc.au.hkzk.util.ComMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface HkEmployeeMapper extends ComMapper<HkEmployee> {
}
