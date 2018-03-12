/**
 * FileName: WebConfig
 * Author:   xiangjunzhong
 * Date:     2018/3/1 14:40
 * Description:
 */
package com.gibbons.member.config;

import com.gibbons.common.handler.GlobalExceptionHandler;
import com.gibbons.member.interceptor.ServiceAuthRestInterceptor;
import com.gibbons.member.interceptor.ClientTokenInterceptor;
import com.gibbons.member.interceptor.UserAuthRestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
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
public class MemberConfiguration extends WebMvcConfigurerAdapter {

    @Bean
    GlobalExceptionHandler getGlobalExceptionHandler() {
        return new GlobalExceptionHandler();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(getClientInterceptor()).addPathPatterns("/**");
        registry.addInterceptor(getJWTInterceptor()).addPathPatterns("/**");
        super.addInterceptors(registry);
    }

    @Bean
    ServiceAuthRestInterceptor getClientInterceptor() {
        return new ServiceAuthRestInterceptor();
    }

    @Bean
    UserAuthRestInterceptor getJWTInterceptor() {
        return new UserAuthRestInterceptor();
    }

    @Bean
    ClientTokenInterceptor getClientTokenInterceptor() {
        return new ClientTokenInterceptor();
    }
}