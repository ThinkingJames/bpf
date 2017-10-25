package cn.net.ssbt.test.service.impl;

import cn.net.ssbt.test.dao.UserDaoTest;
import cn.net.ssbt.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDaoTest userDao;

    public String getUserName(String id) {
        String name = userDao.getUserName(id);
        return name;
    }
}
