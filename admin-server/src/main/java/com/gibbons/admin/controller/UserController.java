/**
 * FileName: UserController
 * Author:   xiangjunzhong
 * Date:     2018/3/7 16:03
 * Description:
 */
package com.gibbons.admin.controller;

import com.gibbons.admin.biz.impl.UserBiz;
import com.gibbons.admin.entity.User;
import com.gibbons.common.rest.BaseController;
import com.gibbons.common.vo.ObjectRestResponse;
import com.gibbons.common.vo.TableResultResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xiangjunzhong
 * @create 2018/3/7 16:03
 * @since 1.0.0
 */
@RestController
@RequestMapping("user")
@Api(description = "用户管理")
public class UserController extends BaseController<UserBiz, User> {

    @ApiOperation(value = "添加用户", notes = "根据 User 对象添加用户")
    @ApiImplicitParam(name = "user", value = "用户实体 user", required = true, dataType = "User")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public ObjectRestResponse add(@RequestBody User user) {
        return super.add(user);
    }

    @ApiOperation(value = "删除用户", notes = "根据url的id 删除用户")
    @ApiImplicitParam(name = "id", value = "用户 ID", required = true, dataType = "Integer", paramType = "id")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ObjectRestResponse remove(@PathVariable int id) {
        return super.remove(id);
    }

    @ApiOperation(value = "停用启用", notes = "根据id 停用启用")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "用户 ID", required = true, dataType = "Integer", paramType = "path"),
            @ApiImplicitParam(name = "status", value = "用户 状态 -1 1", required = true, dataType = "Integer", paramType = "path")
    })
    @RequestMapping(value = "/{id}/{status}", method = RequestMethod.PUT)
    public ObjectRestResponse disabled(@PathVariable("id") int id, @PathVariable("status") int status) {
        ObjectRestResponse objectRestResponse = new ObjectRestResponse<>();
        String message = "";
        baseBiz.disabled(id, status);
        if (status == -1)
            message = "停用用户成功!";
        else if (status == 1)
            message = "启用用户成功!";
        objectRestResponse.setMessage(message);
        return objectRestResponse;
    }

    @ApiOperation(value = "查询用户", notes = "查询所有 分页查询")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "page", value = "页码", required = true, dataType = "Integer"),
            @ApiImplicitParam(name = "limit", value = "条数", required = true, dataType = "Integer"),
            @ApiImplicitParam(name = "sortRow", value = "排序列", dataType = "String"),
            @ApiImplicitParam(name = "sortDire", value = "排序方向", dataType = "String")
    })
    @RequestMapping(value = "/page", method = RequestMethod.GET)
    public TableResultResponse<User> list(@RequestParam Map<String, Object> params) {
        return super.list(params);
    }
}