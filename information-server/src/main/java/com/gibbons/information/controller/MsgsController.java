/**
 * FileName: MsgsController
 * Author:   xiangjunzhong
 * Date:     2018/3/9 14:11
 * Description:
 */
package com.gibbons.information.controller;

import com.gibbons.common.rest.BaseController;
import com.gibbons.common.vo.ObjectRestResponse;
import com.gibbons.common.vo.TableResultResponse;
import com.gibbons.information.biz.impl.MsgsBiz;
import com.gibbons.information.entity.Msgs;
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
 * @create 2018/3/9 14:11
 * @since 1.0.0
 */
@RestController
@RequestMapping("msgs")
@Api(description = "留言管理")
public class MsgsController extends BaseController<MsgsBiz, Msgs> {

    @ApiOperation(value = "添加留言", notes = "根据 Dict 对象添加留言")
    @ApiImplicitParam(name = "msgs", value = "留言 msgs", required = true, dataType = "Msgs")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public ObjectRestResponse add(@RequestBody Msgs msgs) {
        return super.add(msgs);
    }

    @ApiOperation(value = "删除留言", notes = "根据url的id 删除留言")
    @ApiImplicitParam(name = "id", value = "留言 ID", required = true, dataType = "Integer", paramType = "id")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ObjectRestResponse remove(@PathVariable int id) {
        return super.remove(id);
    }

    @ApiOperation(value = "查询留言", notes = "查询所有 分页查询")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "page", value = "页码", required = true, dataType = "Integer"),
            @ApiImplicitParam(name = "limit", value = "条数", required = true, dataType = "Integer"),
            @ApiImplicitParam(name = "sortRow", value = "排序列", dataType = "String"),
            @ApiImplicitParam(name = "sortDire", value = "排序方向", dataType = "String")
    })
    @RequestMapping(value = "/page", method = RequestMethod.GET)
    public TableResultResponse<Msgs> list(@RequestParam Map<String, Object> params) {
        return super.list(params);
    }

    @ApiOperation(value = "回复留言", notes = "根据url的id 回复留言")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "留言 ID", required = true, dataType = "Integer", paramType = "path"),
            @ApiImplicitParam(name = "msgs", value = "留言 msgs", required = true, dataType = "Msgs")
    })
    @RequestMapping(value = "reply/msgs/{id}", method = RequestMethod.POST)
    public ObjectRestResponse replyMsgs(@RequestBody Msgs msgs) {
        return new ObjectRestResponse<Msgs>();
    }
}