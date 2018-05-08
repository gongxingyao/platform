package com.jexy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * Created At 2018/4/18 13:37
 * Author's name gongxingyao
 * email:gongxingyao@bignox.com
 */
@SpringBootApplication
@MapperScan("com.jexy.mapper")
public class PlatformApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(PlatformApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(PlatformApplication.class,args);
    }
}
