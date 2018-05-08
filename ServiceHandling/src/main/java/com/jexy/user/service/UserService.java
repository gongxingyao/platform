package com.jexy.user.service;

import com.jexy.mapper.UserInfoMapper;
import com.jexy.po.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created At 2018/4/17 18:16
 * Author's name gongxingyao
 * email:gongxingyao@bignox.com
 */
@Service
public class UserService {

    @Autowired
    UserInfoMapper userInfoMapper;
    public UserInfo getUserInfoById(Long id) {
        return userInfoMapper.selectByPrimaryKey(id);
    }

    public int deleteUserInfo(Long id) {
        return userInfoMapper.deleteByPrimaryKey(id);
    }

    public int updateUserInfo(UserInfo userInfo) {
        return userInfoMapper.updateByPrimaryKeySelective(userInfo);
    }

    public int insertUser(UserInfo userInfo) {
        return userInfoMapper.insertSelective(userInfo);
    }
}
