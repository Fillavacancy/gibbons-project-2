/**
 * FileName: UserController
 * Author:   xiangjunzhong
 * Date:     2018/3/7 16:03
 * Description:
 */
package com.gibbons.member.controller;

import com.gibbons.common.rest.BaseController;
import com.gibbons.common.util.jwt.JWTInfo;
import com.gibbons.common.vo.ObjectRestResponse;
import com.gibbons.common.vo.TableResultResponse;
import com.gibbons.member.biz.impl.UserBiz;
import com.gibbons.member.entity.User;
import com.gibbons.member.jwt.ClientTokenUtil;
import com.gibbons.member.jwt.JWTUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
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
@RequestMapping("member")
@Api(description = "会员管理")
public class UserController extends BaseController<UserBiz, User> {

    @Autowired
    private JWTUtil jwtUtil;

    @Value("${jwt.token-header}")
    private String tokenHeader;

    @ApiOperation(value = "注册会员", notes = "根据 User 对象注册会员")
    @ApiImplicitParam(name = "user", value = "注册会员实体 user", required = true, dataType = "User")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public ObjectRestResponse add(@RequestBody User user) {
        return super.add(user);
    }

    @ApiOperation(value = "修改会员", notes = "根据url的id 修改注册会员和本人信息")
    @ApiImplicitParam(name = "user", value = "会员 user", required = true, dataType = "User")
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public ObjectRestResponse update(@RequestBody User user) {
        return super.update(user);
    }

    @ApiOperation(value = "删除注册会员", notes = "根据url的id 删除注册会员")
    @ApiImplicitParam(name = "id", value = "注册会员 ID", required = true, dataType = "Integer", paramType = "id")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ObjectRestResponse remove(@PathVariable int id) {
        return super.remove(id);
    }

    @ApiOperation(value = "修改本人密码", notes = "根据url的id 修改本人密码")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "会员 ID", required = true, dataType = "Integer", paramType = "path"),
            @ApiImplicitParam(name = "password", value = "密码", required = true, dataType = "Integer")
    })
    @RequestMapping(value = "/update/pwd{id}", method = RequestMethod.PUT)
    public ObjectRestResponse updatePassword(@PathVariable int id, String password) {
        baseBiz.updatePassword(id, password);
        return new ObjectRestResponse();
    }

    @ApiOperation(value = "查询注册会员", notes = "根据登录会员ID查询所有注册会员 分页查询")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "page", value = "页码", required = true, dataType = "Integer"),
            @ApiImplicitParam(name = "limit", value = "条数", required = true, dataType = "Integer"),
            @ApiImplicitParam(name = "sortRow", value = "排序列", dataType = "String"),
            @ApiImplicitParam(name = "sortDire", value = "排序方向", dataType = "String")
    })
    @RequestMapping(value = "/pages", method = RequestMethod.GET)
    public TableResultResponse<User> list(HttpServletRequest request, @RequestParam Map<String, Object> params) throws Exception {
        JWTInfo jwtInfo = (JWTInfo) jwtUtil.getInfoFromToken(request.getHeader(tokenHeader));
        params.put("id", jwtInfo.getId());
        return super.list(params);
    }
}