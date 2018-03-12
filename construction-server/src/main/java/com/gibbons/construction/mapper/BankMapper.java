package com.gibbons.construction.mapper;

import com.gibbons.construction.entity.Bank;
import tk.mybatis.mapper.common.Mapper;

public interface BankMapper extends Mapper<Bank> {

    public Bank selectByBankCardNumber(String bankCardNumber);
}