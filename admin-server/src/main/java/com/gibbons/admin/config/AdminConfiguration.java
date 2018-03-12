package com.gibbons.admin.config;

import com.gibbons.admin.jwt.UserAuthUtil;
import com.gibbons.common.handler.GlobalExceptionHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by ace on 2017/9/8.
 */
@Configuration
public class AdminConfiguration extends WebMvcConfigurerAdapter {

    @Bean
    GlobalExceptionHandler getGlobalExceptionHandler() {
        return new GlobalExceptionHandler();
    }

    @Bean
    UserAuthUtil getUserAuthUtil() {
        return new UserAuthUtil();
    }
}
