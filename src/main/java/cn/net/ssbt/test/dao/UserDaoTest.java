package cn.net.ssbt.test.dao;

import cn.net.ssbt.common.persistence.annotation.MyBatisDao;

@MyBatisDao("userDaoTest")
public interface UserDaoTest {
    String getUserName(String id);
}
