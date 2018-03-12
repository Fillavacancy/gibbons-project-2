/**
 * FileName: AdvisoryBiz
 * Author:   xiangjunzhong
 * Date:     2018/3/9 14:03
 * Description:
 */
package com.gibbons.information.biz.impl;

import com.gibbons.common.biz.BaseBiz;
import com.gibbons.information.entity.Advisory;
import com.gibbons.information.mapper.AdvisoryMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xiangjunzhong
 * @create 2018/3/9 14:03
 * @since 1.0.0
 */
@Service
@Transactional
public class AdvisoryBiz extends BaseBiz<AdvisoryMapper, Advisory> {

}