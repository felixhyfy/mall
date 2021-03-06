package com.felix.mall.response;

import com.felix.mall.enums.IErrorCode;
import com.felix.mall.enums.ResponseCode;

/**
 * @author Felix
 * @packageName com.felix.mall.response
 * @className CommonResponse
 * @description 通用返回对象
 * @date 2021/1/10 13:45
 */
public class CommonResponse<T> {

    private long code;
    private String message;
    private T data;

    protected CommonResponse() {
    }

    protected CommonResponse(long code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    /**
     * 成功返回结果
     *
     * @param data 获取的数据
     */
    public static <T> CommonResponse<T> success(T data) {
        return new CommonResponse<T>(ResponseCode.SUCCESS.getCode(), ResponseCode.SUCCESS.getMessage(), data);
    }

    /**
     * 成功返回结果
     *
     * @param data 获取的数据
     * @param  message 提示信息
     */
    public static <T> CommonResponse<T> success(T data, String message) {
        return new CommonResponse<T>(ResponseCode.SUCCESS.getCode(), message, data);
    }

    /**
     * 失败返回结果
     * @param errorCode 错误码
     */
    public static <T> CommonResponse<T> failed(IErrorCode errorCode) {
        return new CommonResponse<T>(errorCode.getCode(), errorCode.getMessage(), null);
    }

    /**
     * 失败返回结果
     * @param errorCode 错误码
     * @param message 错误信息
     */
    public static <T> CommonResponse<T> failed(IErrorCode errorCode,String message) {
        return new CommonResponse<T>(errorCode.getCode(), message, null);
    }

    /**
     * 失败返回结果
     * @param message 提示信息
     */
    public static <T> CommonResponse<T> failed(String message) {
        return new CommonResponse<T>(ResponseCode.FAILED.getCode(), message, null);
    }

    /**
     * 失败返回结果
     */
    public static <T> CommonResponse<T> failed() {
        return failed(ResponseCode.FAILED);
    }

    /**
     * 参数验证失败返回结果
     */
    public static <T> CommonResponse<T> validateFailed() {
        return failed(ResponseCode.VALIDATE_FAILED);
    }

    /**
     * 参数验证失败返回结果
     * @param message 提示信息
     */
    public static <T> CommonResponse<T> validateFailed(String message) {
        return new CommonResponse<T>(ResponseCode.VALIDATE_FAILED.getCode(), message, null);
    }

    /**
     * 未登录返回结果
     */
    public static <T> CommonResponse<T> unauthorized(T data) {
        return new CommonResponse<T>(ResponseCode.UNAUTHORIZED.getCode(), ResponseCode.UNAUTHORIZED.getMessage(), data);
    }

    /**
     * 未授权返回结果
     */
    public static <T> CommonResponse<T> forbidden(T data) {
        return new CommonResponse<T>(ResponseCode.FORBIDDEN.getCode(), ResponseCode.FORBIDDEN.getMessage(), data);
    }

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
