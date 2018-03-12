package com.gibbons.auth.feign;

import com.gibbons.auth.bean.UserInfo;
import feign.hystrix.FallbackFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * ${DESCRIPTION}
 *
 * @author wanghaobin
 * @create 2017-06-21 8:11
 */
@FeignClient(value = "admin-server", fallbackFactory = IUserService.UserServiceImpl.class)
public interface IUserService {

    @RequestMapping(value = "/api/user/validate", method = RequestMethod.POST)
    public UserInfo validate(@RequestParam("username") String username, @RequestParam("password") String password);

    @Component
    class UserServiceImpl implements FallbackFactory<IUserService> {

        private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

        @Override
        public IUserService create(Throwable throwable) {
            logger.info("fallback reason was: {} ", throwable.getMessage());
            return (username, password) -> {
                System.out.println("熔断");
                return new UserInfo("admin", "管理员", "1", "123456");
            };
        }
    }
}
