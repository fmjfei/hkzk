package cc.au.hkzk.mapper.zk;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.Date;

@Mapper
public interface ZkLastUpdTimeMapper {

    @Select("select top 1 SyncTime from backupsync order by SyncTime desc;")
    public Date getLast();

}
