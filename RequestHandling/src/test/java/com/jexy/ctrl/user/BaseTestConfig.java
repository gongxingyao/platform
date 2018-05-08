package com.jexy.ctrl.user;

import com.jexy.PlatformApplication;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created At 2018/4/18 13:51
 * Author's name gongxingyao
 * email:gongxingyao@bignox.com
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = PlatformApplication.class,webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@MapperScan("com.jexy.mapper")
public class BaseTestConfig {
}
