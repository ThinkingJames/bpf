package cn.net.ssbt.modules.sys.dao;

import cn.net.ssbt.common.persistence.BaseDao;
import cn.net.ssbt.common.persistence.annotation.MyBatisDao;

@MyBatisDao
public interface UserDao extends BaseDao{
    String getName(String id);
}
