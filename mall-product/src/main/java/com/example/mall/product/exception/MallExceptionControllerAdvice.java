package com.example.mall.product.exception;

import com.example.mall.common.exception.BizCodeEnume;
import com.example.mall.common.utils.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;

/**
 * @author poemismine
 * @email 18286490103@163.com
 * @date: 2022/1/29 21:40
 */
@Slf4j
//@ControllerAdvice(basePackages = {"com.example.mall.product.controller"})
//@ResponseBody
@RestControllerAdvice
public class MallExceptionControllerAdvice {
    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public R handlerValidException(MethodArgumentNotValidException e) {
        log.error("异常信息{}，异常类{}", e.getMessage(), e.getClass());
        BindingResult bindingResult = e.getBindingResult();
        HashMap<String, String> data = new HashMap<>();
        bindingResult.getFieldErrors().forEach(i -> {
            data.put(i.getField(), i.getDefaultMessage());
        });
        return R.error(BizCodeEnume.VALID_EXCEPTION.getCode(), BizCodeEnume.VALID_EXCEPTION.getMsg()).put("data", data);
    }

    @ExceptionHandler(value = Throwable.class)
    public R handlerException(Throwable e) {
        log.error("异常信息{}, 异常类{}, 异常栈{}", e.getMessage(), e.getClass(), e.getStackTrace());
        return R.error(BizCodeEnume.UNKNOW_EXCEPTION.getCode(), BizCodeEnume.UNKNOW_EXCEPTION.getMsg()).put("data", e.getMessage());
    }
}
