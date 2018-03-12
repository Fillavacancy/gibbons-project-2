/**
 * FileName: MsgsBiz
 * Author:   xiangjunzhong
 * Date:     2018/3/9 14:07
 * Description:
 */
package com.gibbons.information.biz.impl;

import com.gibbons.common.biz.BaseBiz;
import com.gibbons.information.entity.Msgs;
import com.gibbons.information.mapper.MsgsMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xiangjunzhong
 * @create 2018/3/9 14:07
 * @since 1.0.0
 */
@Service
@Transactional
public class MsgsBiz extends BaseBiz<MsgsMapper, Msgs> {

}