package cn.net.ssbt.test;

import com.alibaba.druid.pool.DruidDataSource;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class DateSourceTest extends BaseTest{

    @Autowired
    DruidDataSource dataSource;

    @Test
    public void getDataSource(){
        System.out.println(dataSource);
    }

}
