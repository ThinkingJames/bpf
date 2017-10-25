package cn.net.ssbt.modules.sys.service;

import cn.net.ssbt.modules.sys.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public String getName(String id){
        return userDao.getName(id);
    }
}
