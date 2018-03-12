package com.gibbons.common.handler;

import com.gibbons.common.constant.CommonConstants;
import com.gibbons.common.exception.BaseException;
import com.gibbons.common.exception.auth.ClientTokenException;
import com.gibbons.common.exception.auth.UserTokenException;
import com.gibbons.common.exception.bank.BankValidateException;
import com.gibbons.common.exception.bank.DepositException;
import com.gibbons.common.exception.bank.TransferException;
import com.gibbons.common.vo.BaseResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;

/**
 * Created by ace on 2017/9/8.
 */
@ControllerAdvice("com.gibbons")
@ResponseBody
public class GlobalExceptionHandler {

    private Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(BaseException.class)
    public BaseResponse baseExceptionHandler(HttpServletResponse response, BaseException ex) {
        logger.error(ex.getMessage(), ex);
        response.setStatus(CommonConstants.EX_OTHER_CODE);
        return new BaseResponse(ex.getStatus(), ex.getMessage());
    }

    @ExceptionHandler(Exception.class)
    public BaseResponse otherExceptionHandler(HttpServletResponse response, Exception ex) {
        response.setStatus(CommonConstants.EX_OTHER_CODE);
        logger.error(ex.getMessage(), ex);
        return new BaseResponse(CommonConstants.EX_OTHER_CODE, ex.getMessage());
    }

    @ExceptionHandler(ClientTokenException.class)
    public BaseResponse clientTokenExceptionHandler(HttpServletResponse response, ClientTokenException ex) {
        response.setStatus(403);
        logger.error(ex.getMessage(), ex);
        return new BaseResponse(ex.getStatus(), ex.getMessage());
    }

    @ExceptionHandler(UserTokenException.class)
    public BaseResponse userTokenExceptionHandler(HttpServletResponse response, UserTokenException ex) {
        response.setStatus(401);
        logger.error(ex.getMessage(), ex);
        return new BaseResponse(ex.getStatus(), ex.getMessage());
    }

    @ExceptionHandler(BankValidateException.class)
    public BaseResponse bankValidateExceptionHandler(HttpServletResponse response, BankValidateException ex) {
        response.setStatus(CommonConstants.BANK_VALIDATE_CODE);
        logger.error(ex.getMessage(), ex);
        return new BaseResponse(ex.getStatus(), ex.getMessage());
    }

    @ExceptionHandler(TransferException.class)
    public BaseResponse transferExceptionHandler(HttpServletResponse response, TransferException ex) {
        response.setStatus(CommonConstants.BANK_TRANSFER_CODE);
        logger.error(ex.getMessage(), ex);
        return new BaseResponse(ex.getStatus(), ex.getMessage());
    }

    @ExceptionHandler(DepositException.class)
    public BaseResponse depositExceptionHandler(HttpServletResponse response, DepositException ex) {
        response.setStatus(CommonConstants.BANK_DEPOSIT_CODE);
        logger.error(ex.getMessage(), ex);
        return new BaseResponse(ex.getStatus(), ex.getMessage());
    }
}
