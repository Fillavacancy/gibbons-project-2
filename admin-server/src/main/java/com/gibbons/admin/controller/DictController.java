/**
 * FileName: SysDictController
 * Author:   xiangjunzhong
 * Date:     2018/3/7 15:30
 * Description:
 */
package com.gibbons.admin.controller;

import com.gibbons.admin.biz.impl.DictBiz;
import com.gibbons.admin.entity.Dict;
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
 * @create 2018/3/7 15:30
 * @since 1.0.0
 */
@RestController
@RequestMapping("dict")
@Api(description = "数据字典")
public class DictController extends BaseController<DictBiz, Dict> {

    @ApiOperation(value = "添加数据字典", notes = "根据 Dict 对象添加数据字典")
    @ApiImplicitParam(name = "dict", value = "数据字典 dict", required = true, dataType = "Dict")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public ObjectRestResponse add(@RequestBody Dict dict) {
        return super.add(dict);
    }

    @ApiOperation(value = "修改数据字典", notes = "根据url的id 修改数据字典")
    @ApiImplicitParam(name = "dict", value = "数据字典 dict", required = true, dataType = "Dict")
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public ObjectRestResponse update(@RequestBody Dict dict) {
        return super.update(dict);
    }

    @ApiOperation(value = "删除数据字典", notes = "根据url的id 删除数据字典")
    @ApiImplicitParam(name = "id", value = "数据字典 ID", required = true, dataType = "Integer", paramType = "id")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ObjectRestResponse remove(@PathVariable int id) {
        return super.remove(id);
    }

    @ApiOperation(value = "查询数据字典", notes = "查询所有 分页查询")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "page", value = "页码", required = true, dataType = "Integer"),
            @ApiImplicitParam(name = "limit", value = "条数", required = true, dataType = "Integer"),
            @ApiImplicitParam(name = "sortRow", value = "排序列", dataType = "String"),
            @ApiImplicitParam(name = "sortDire", value = "排序方向", dataType = "String")
    })
    @RequestMapping(value = "/page", method = RequestMethod.GET)
    public TableResultResponse<Dict> list(@RequestParam Map<String, Object> params) {
        return super.list(params);
    }
}