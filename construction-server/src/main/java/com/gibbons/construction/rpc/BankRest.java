/**
 * FileName: BankRest
 * Author:   xiangjunzhong
 * Date:     2018/3/9 17:56
 * Description:
 */
package com.gibbons.construction.rpc;

import com.gibbons.common.rest.BaseController;
import com.gibbons.common.vo.ObjectRestResponse;
import com.gibbons.construction.biz.impl.BankBiz;
import com.gibbons.construction.entity.Bank;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xiangjunzhong
 * @create 2018/3/9 17:56
 * @since 1.0.0
 */
@RestController
@RequestMapping("api")
public class BankRest extends BaseController<BankBiz, Bank> {

    @RequestMapping(value = "/bank/validate", method = RequestMethod.POST)
    public ObjectRestResponse validate(@RequestParam("bankCardNumber") String bankCardNumber, @RequestParam("password") String password) {
        super.baseBiz.validate(bankCardNumber, password);
        return new ObjectRestResponse();
    }

    @RequestMapping(value = "/bank/transfer", method = RequestMethod.POST)
    public boolean transfer(@RequestParam("bankCardNumber") String bankCardNumber, @RequestParam("password") String password, @RequestParam("amount") BigDecimal amount) {
        return super.baseBiz.transfer(bankCardNumber, password, amount);
    }

    @RequestMapping(value = "/bank/deposit", method = RequestMethod.POST)
    public boolean deposit(@RequestParam("bankCardNumber") String bankCardNumber, @RequestParam("password") String password, @RequestParam("amount") BigDecimal amount) {
        return super.baseBiz.deposit(bankCardNumber, password, amount);
    }
}