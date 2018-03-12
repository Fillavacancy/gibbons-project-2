/**
 * FileName: SysDictTypeController
 * Author:   xiangjunzhong
 * Date:     2018/3/7 15:31
 * Description:
 */
package com.gibbons.admin.controller;

import com.gibbons.admin.biz.impl.DictTypeBiz;
import com.gibbons.admin.entity.DictType;
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
 * @create 2018/3/7 15:31
 * @since 1.0.0
 */
@RestController
@RequestMapping("dict/type")
@Api(description = "数据字典类型")
public class DictTypeController extends BaseController<DictTypeBiz, DictType> {

    @ApiOperation(value = "添加数据字典类型", notes = "根据 DictType 对象添加数据字典类型")
    @ApiImplicitParam(name = "dictType", value = "数据字典类型 dictType", required = true, dataType = "DictType")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public ObjectRestResponse add(@RequestBody DictType dictType) {
        return super.add(dictType);
    }

    @ApiOperation(value = "修改数据字典类型", notes = "根据url的id 修改数据字典类型")
    @ApiImplicitParam(name = "dictType", value = "数据字典类型 dictType", required = true, dataType = "DictType")
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public ObjectRestResponse update(@RequestBody DictType dictType) {
        return super.update(dictType);
    }

    @ApiOperation(value = "删除数据字典类型", notes = "根据url的id 删除数据字典类型")
    @ApiImplicitParam(name = "id", value = "数据字典类型 ID", required = true, dataType = "Integer", paramType = "id")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ObjectRestResponse remove(@PathVariable int id) {
        return super.remove(id);
    }

    @ApiOperation(value = "查询数据字典类型", notes = "查询所有 分页查询")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "page", value = "页码", required = true, dataType = "Integer"),
            @ApiImplicitParam(name = "limit", value = "条数", required = true, dataType = "Integer"),
            @ApiImplicitParam(name = "sortRow", value = "排序列", dataType = "String"),
            @ApiImplicitParam(name = "sortDire", value = "排序方向", dataType = "String")
    })
    @RequestMapping(value = "/page", method = RequestMethod.GET)
    public TableResultResponse<DictType> list(@RequestParam Map<String, Object> params) {
        return super.list(params);
    }
}