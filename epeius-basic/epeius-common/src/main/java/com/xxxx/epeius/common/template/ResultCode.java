package com.xxxx.epeius.common.template;

import lombok.Getter;

/**
 * Description: 通用状态代码
 * Author: lishangmin
 * Created: 2018-06-20 15:53
 */
@Getter
public class ResultCode {

    public final static ResultCode SUCCESS = new ResultCode("0","成功");

    public final static ResultCode ERROR   = new ResultCode("1","失败");

    /**
     * 状态码
     */
    private String status;

    /**
     * 状态信息
     */
    private String msg;

    public ResultCode() {
    }

    public ResultCode(String status, String msg) {
        this.status = status;
        this.msg = msg;
    }

}
