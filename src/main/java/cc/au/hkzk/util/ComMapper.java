package cc.au.hkzk.util;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface ComMapper<T> extends Mapper<T>, MySqlMapper<T> {

}