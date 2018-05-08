package com.jexy.ctrl.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created At 2018/4/16 14:18
 * Author's name gongxingyao
 * email:gongxingyao@bignox.com
 */
@RestController
public class BaseCtrl {
    @GetMapping
    public String index(){
        return "Welcome to Platform";
    }
}
