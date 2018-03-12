/**
 * FileName: AnnouncementController
 * Author:   xiangjunzhong
 * Date:     2018/3/9 14:09
 * Description:
 */
package com.gibbons.information.controller;

import com.gibbons.common.rest.BaseController;
import com.gibbons.common.vo.ObjectRestResponse;
import com.gibbons.common.vo.TableResultResponse;
import com.gibbons.information.biz.impl.AnnouncementBiz;
import com.gibbons.information.entity.Announcement;
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
 * @create 2018/3/9 14:09
 * @since 1.0.0
 */
@RestController
@RequestMapping("anno")
@Api(description = "公告管理")
public class AnnouncementController extends BaseController<AnnouncementBiz, Announcement> {

    @ApiOperation(value = "添加公告", notes = "根据 Dict 对象添加公告")
    @ApiImplicitParam(name = "announcement", value = "公告 announcement", required = true, dataType = "Announcement")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public ObjectRestResponse add(@RequestBody Announcement announcement) {
        return super.add(announcement);
    }

    @ApiOperation(value = "修改公告", notes = "根据url的id 修改公告")
    @ApiImplicitParam(name = "announcement", value = "公告 announcement", required = true, dataType = "Announcement")
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public ObjectRestResponse update(@RequestBody Announcement announcement) {
        return super.update(announcement);
    }

    @ApiOperation(value = "删除公告", notes = "根据url的id 删除公告")
    @ApiImplicitParam(name = "id", value = "公告 ID", required = true, dataType = "Integer", paramType = "id")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ObjectRestResponse remove(@PathVariable int id) {
        return super.remove(id);
    }

    @ApiOperation(value = "查询公告", notes = "查询所有 分页查询")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "page", value = "页码", required = true, dataType = "Integer"),
            @ApiImplicitParam(name = "limit", value = "条数", required = true, dataType = "Integer"),
            @ApiImplicitParam(name = "sortRow", value = "排序列", dataType = "String"),
            @ApiImplicitParam(name = "sortDire", value = "排序方向", dataType = "String")
    })
    @RequestMapping(value = "/page", method = RequestMethod.GET)
    public TableResultResponse<Announcement> list(@RequestParam Map<String, Object> params) {
        return super.list(params);
    }
}