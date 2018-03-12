/**
 * FileName: AdvisoryController
 * Author:   xiangjunzhong
 * Date:     2018/3/9 14:02
 * Description:
 */
package com.gibbons.information.controller;

import com.gibbons.common.rest.BaseController;
import com.gibbons.common.vo.ObjectRestResponse;
import com.gibbons.common.vo.TableResultResponse;
import com.gibbons.information.biz.impl.AdvisoryBiz;
import com.gibbons.information.entity.Advisory;
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
 * @create 2018/3/9 14:02
 * @since 1.0.0
 */
@RestController
@RequestMapping("advisory")
@Api(description = "资讯管理")
public class AdvisoryController extends BaseController<AdvisoryBiz, Advisory> {

    @ApiOperation(value = "添加资讯", notes = "根据 Dict 对象添加资讯")
    @ApiImplicitParam(name = "advisory", value = "资讯 advisory", required = true, dataType = "Advisory")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public ObjectRestResponse add(@RequestBody Advisory advisory) {
        return super.add(advisory);
    }

    @ApiOperation(value = "修改资讯", notes = "根据url的id 修改资讯")
    @ApiImplicitParam(name = "advisory", value = "资讯 advisory", required = true, dataType = "Advisory")
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public ObjectRestResponse update(@RequestBody Advisory advisory) {
        return super.update(advisory);
    }

    @ApiOperation(value = "删除资讯", notes = "根据url的id 删除资讯")
    @ApiImplicitParam(name = "id", value = "资讯 ID", required = true, dataType = "Integer", paramType = "id")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ObjectRestResponse remove(@PathVariable int id) {
        return super.remove(id);
    }

    @ApiOperation(value = "查询资讯", notes = "查询所有 分页查询")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "page", value = "页码", required = true, dataType = "Integer"),
            @ApiImplicitParam(name = "limit", value = "条数", required = true, dataType = "Integer"),
            @ApiImplicitParam(name = "sortRow", value = "排序列", dataType = "String"),
            @ApiImplicitParam(name = "sortDire", value = "排序方向", dataType = "String")
    })
    @RequestMapping(value = "/page", method = RequestMethod.GET)
    public TableResultResponse<Advisory> list(@RequestParam Map<String, Object> params) {
        return super.list(params);
    }
}