package com.xxxx.epeius.front.handler;

import com.xxxx.epeius.common.template.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * Description: 示例项目的异常处理
 * Author: lishangmin
 * Created: 2019-04-14 15:05
 */
@Slf4j
@RestControllerAdvice
public class FrontAppCtlExceptionHandler {

	@ExceptionHandler(value = RuntimeException.class)
	public Result doError(RuntimeException ex) throws Exception{
		log.error("异常处理->");
		ex.printStackTrace();
		return Result.error(ex.getMessage());
	}

}
