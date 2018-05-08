package com.jexy.ctrl.user;

import com.jexy.po.UserInfo;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;

/**
 * Created At 2018/5/5 16:41
 * Author's name gongxingyao
 * email:gongxingyao@bignox.com
 */
public class UserCtrlTest extends BaseTestConfig {

    @Autowired
    TestRestTemplate testRestTemplate;

    @Test
    public void getUserInfo() {
        UserInfo userInfo = testRestTemplate.getForObject("/user/getUser/{id}", UserInfo.class, 1L);
        System.out.println(userInfo);
    }

    @Test
    public void deleteUserInfo() {
    }

    @Test
    public void updateUserInfo() {
    }

    @Test
    public void insertUser() {
    }
}