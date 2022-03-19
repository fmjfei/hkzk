package cc.au.hkzk.mapper.hk;

import cc.au.hkzk.entity.HkInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.Date;
import java.util.List;

@Mapper
public interface HkInfoMapper {

    @Select("select LOCALTIMESTAMP")
    public Date getNowTime();

    @Select("select b.person_name personname, b.mobile, b.cert_no certno, b.status, a.card_number cardnumber, a.upd_time updtime, a.status cardstatus, c.org_name orgname, c.org_code orgcode\n" +
            "from tb_cached_card a, tb_cached_person b, tb_cached_org c\n" +
            "where 1=1 and a.person_id = b.person_id and b.org_id = c.org_id and length(a.card_number) > 8\n" +
            "and c.status = 0 and (a.upd_time >= #{lastupdate} or b.upd_time >= #{lastupdate})")
    public List<HkInfo> getUpdateInfo(Date lastupdate);

}
