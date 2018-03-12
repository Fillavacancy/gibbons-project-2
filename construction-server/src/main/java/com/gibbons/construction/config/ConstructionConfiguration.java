/**
 * FileName: WebConfig
 * Author:   xiangjunzhong
 * Date:     2018/3/1 14:40
 * Description:
 */
package com.gibbons.construction.config;

import com.gibbons.common.handler.GlobalExceptionHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xiangjunzhong
 * @create 2018/3/1 14:40
 * @since 1.0.0
 */
@Configuration
public class ConstructionConfiguration extends WebMvcConfigurerAdapter {

    @Bean
    GlobalExceptionHandler getGlobalExceptionHandler() {
        return new GlobalExceptionHandler();
    }
}