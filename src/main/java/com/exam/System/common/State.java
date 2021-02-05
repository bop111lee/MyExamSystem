package com.exam.System.common;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 错误码code, message包装, 用于简化业务代码
 *
 * @author liangjinhao
 * Created on 2020/11/26
 */
@Data
@AllArgsConstructor
public class State {

    /**
     * 错误码
     */
    private Integer code;

    /**
     * 错误信息
     */
    private String message;
}