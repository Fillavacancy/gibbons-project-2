package com.gibbons.admin.rpc;

import com.gibbons.admin.rpc.service.PermissionService;
import com.gibbons.admin.vo.user.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * ${DESCRIPTION}
 *
 * @author wanghaobin
 * @create 2017-06-21 8:15
 */
@RestController
@RequestMapping("api")
public class UserRest {

    @Autowired
    private PermissionService permissionService;

    @RequestMapping(value = "/user/validate", method = RequestMethod.POST)
    public @ResponseBody
    UserInfo validate(@RequestParam("username") String username, @RequestParam("password") String password) {
        return permissionService.validate(username, password);
    }
}
