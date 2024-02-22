package org.common.entities;

import lombok.Data;

/**
 * @description 通用的JSON返回格式
 * @author: 马云龙
 * @Date: 2024/1/11 15:26
 */
@Data
public class CommonResult<T> {

    private Integer code;
    private String message;
    private T data;

    public CommonResult() {
    }

    public CommonResult(Integer code, String message) {
        this(code, message, null);
    }

    public CommonResult(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }
}
