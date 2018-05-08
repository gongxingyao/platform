package com.jexy.ctrl.user;

import com.jexy.po.UserInfo;
import com.jexy.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserCtrl {
    @Autowired
    UserService userService;

    @GetMapping("/getUser/{id}")
    public UserInfo getUserInfo(@PathVariable("id") Long id) {
        return userService.getUserInfoById(id);
    }

    @DeleteMapping("/deleteUser/{id}")
    public int deleteUserInfo(@PathVariable("id") Long id) {
        return userService.deleteUserInfo(id);
    }

    @PutMapping("/updateUser")
    public int updateUserInfo(@RequestBody UserInfo userInfo) {
        return userService.updateUserInfo(userInfo);
    }
    @PostMapping("/insertUser")
    public int insertUser(@RequestBody UserInfo userInfo){
        return userService.insertUser(userInfo);
    }

}
