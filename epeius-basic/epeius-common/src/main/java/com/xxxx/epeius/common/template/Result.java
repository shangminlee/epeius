package com.xxxx.epeius.common.template;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Calendar;

/**
 * Description: 通用返回模板
 * Author: lishangmin
 * Created: 2018-06-20 15:41
 */
@SuppressWarnings("deprecation")
@Getter
@Setter
@JsonSerialize(include =  JsonSerialize.Inclusion.NON_NULL)
public class Result<T> implements Serializable {

    /**
     * 状态代码
     */
    private String status;

    /**
     * 信息
     */
    private String msg;

    /**
     * 时间戳
     */
    private long timestamp;

    /**
     * 内容
     */
    private T data;

    public Result() {
    }

    private Result(String status, String msg, T data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
        this.timestamp = Calendar.getInstance().getTimeInMillis();
    }

    private Result(String status, String msg) {
        this.status = status;
        this.msg = msg;
        this.timestamp = Calendar.getInstance().getTimeInMillis();
    }

    /**
     * 创建返回成功对象</br>
     */
    public static <T> Result<T> success(){
        return new Result<>(ResultCode.SUCCESS.getStatus(),ResultCode.SUCCESS.getMsg());
    }

    /**
     * 创建返回成功对象</br>
     * @param msg 成功信息</br>
     */
    public static <T> Result<T> successAndMsg(String msg){
        return new Result<>(ResultCode.SUCCESS.getStatus(),msg);
    }

    /**
     * 创建返回成功对象</br>
     * @param data 数据</br>
     * @param <T>  泛型</br>
     */
    public static <T> Result<T> success(T data){
        return new Result<>(ResultCode.SUCCESS.getStatus(),ResultCode.SUCCESS.getMsg(),data);
    }

    /**
     * 创建返回成功对象</br>
     * @param data 数据</br>
     * @param <T>  泛型</br>
     * @param msg  成功信息</br>
     */
    public static <T> Result<T> success(String msg, T data){
        return new Result<>(ResultCode.SUCCESS.getStatus(),msg,data);
    }

    /**
     * 创建返回失败对象
     */
    public static <T> Result<T> error(){
        return new Result<>(ResultCode.ERROR.getStatus(),ResultCode.ERROR.getMsg());
    }

    /**
     * 创建返回成功对象</br>
     * @param msg 错误信息</br>
     */
    public static <T> Result<T> error(String msg){
        return new Result<>(ResultCode.ERROR.getStatus(),msg);
    }

    /**
     * 创建返回成功对象</br>
     * @param status 错误代码</br>
     * @param msg    错误信息</br>
     */
    public static <T> Result<T> error(String status, String msg){
        return new Result<>(status,msg);
    }

    /**
     * 创建返回成功对象</br>
     * @param resultCode 错误信息</br>
     */
    public static <T> Result<T> error(ResultCode resultCode){
        return new Result<>(resultCode.getStatus(),resultCode.getMsg());
    }

    public static <T> Result<T> error(ResultCode resultCode,T data){
        return new Result<>(resultCode.getStatus(),resultCode.getMsg(),data);
    }

    //JackSon Ignore For RestController
    @JsonIgnore
    //FastJson Ignore For Normal Used
    @JSONField(serialize = false)
    public boolean isSuccess(){
        return this.status.equals(ResultCode.SUCCESS.getStatus());
    }
}
