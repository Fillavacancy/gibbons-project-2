/**
 * FileName: InformationConfiguration
 * Author:   xiangjunzhong
 * Date:     2018/3/9 14:12
 * Description:
 */
package com.gibbons.information.config;

import com.gibbons.common.handler.GlobalExceptionHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xiangjunzhong
 * @create 2018/3/9 14:12
 * @since 1.0.0
 */
@Configuration
public class InformationConfiguration extends WebMvcConfigurerAdapter {

    @Bean
    GlobalExceptionHandler getGlobalExceptionHandler() {
        return new GlobalExceptionHandler();
    }
}