/**
 * FileName: SysDictBiz
 * Author:   xiangjunzhong
 * Date:     2018/3/7 15:24
 * Description:
 */
package com.gibbons.admin.biz.impl;

import com.gibbons.admin.entity.Dict;
import com.gibbons.admin.mapper.DictMapper;
import com.gibbons.common.biz.BaseBiz;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xiangjunzhong
 * @create 2018/3/7 15:24
 * @since 1.0.0
 */
@Service
@Transactional
public class DictBiz extends BaseBiz<DictMapper, Dict> {

}