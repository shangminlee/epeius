package com.xxxx.epeius.front.controller;

import com.xxxx.epeius.backend.struct.UserModel;
import com.xxxx.epeius.common.template.Result;
import com.xxxx.epeius.front.service.IBackendService;
import com.xxxx.epeius.front.service.IFrontService;
import com.xxxx.epeius.front.struct.AccountModel;
import com.xxxx.epeius.front.struct.ProposalModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * Description: 示例1控制层
 * Author: lishangmin
 * Created: 2019-03-25 14:04
 */
@RestController
@Slf4j
@RequestMapping("/front")
public class FrontController {

	@Resource
	private IFrontService iFrontService;

	@Resource
	private IBackendService iBackendService;

	@GetMapping("/insure")
	public Result<ProposalModel> insure(){
		// 通过Feign 调用第三方微服务
		UserModel userModel = iBackendService.getUser(UUID.randomUUID().toString()).getData();

		//if(userModel != null) throw new RuntimeException("1111");

		// 组织数据
		AccountModel account =  AccountModel.builder().name(userModel.getName()).role(userModel.getRole())
				.userId(UUID.randomUUID().toString()).build();

		// 调用自己的服务
		ProposalModel proposalModel = iFrontService.insure(account);
		return Result.success(proposalModel);
	}

	// 异常处理, 异常处理统一放到 handler 包下
	// @ExceptionHandler
	// public String doError(Exception ex) throws Exception{
	//	 ex.printStackTrace();
	//	 return ex.getMessage();
	// }

}
