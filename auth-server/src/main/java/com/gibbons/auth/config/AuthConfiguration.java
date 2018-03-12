/**
 * FileName: AuthConfiguration
 * Author:   xiangjunzhong
 * Date:     2018/3/2 14:49
 * Description:
 */
package com.gibbons.auth.config;

import com.gibbons.common.handler.GlobalExceptionHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xiangjunzhong
 * @create 2018/3/2 14:49
 * @since 1.0.0
 */
@Configuration
public class AuthConfiguration {

    @Bean
    GlobalExceptionHandler getGlobalExceptionHandler() {
        return new GlobalExceptionHandler();
    }
}