/**
 * FileName: DownloadCenterController
 * Author:   xiangjunzhong
 * Date:     2018/3/9 14:30
 * Description:
 */
package com.gibbons.information.controller;

import com.gibbons.common.vo.ObjectRestResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xiangjunzhong
 * @create 2018/3/9 14:30
 * @since 1.0.0
 */
@RestController
@RequestMapping("download/center")
@Api(description = "下载中心")
public class DownloadCenterController {

    @ApiOperation(value = "下载咨询", notes = "根据url的id 下载咨询")
    @ApiImplicitParam(name = "id", value = "资讯 ID", required = true, dataType = "Integer", paramType = "path")
    @RequestMapping(value = "download/advisory/{id}", method = RequestMethod.POST)
    public ObjectRestResponse downloadAdvice(@PathVariable Integer id) {
        return new ObjectRestResponse();
    }
}