package com.xxxx.epeius.front.service.impl;

import com.xxxx.epeius.front.service.IFrontService;
import com.xxxx.epeius.front.struct.AccountModel;
import com.xxxx.epeius.front.struct.ProposalModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Description:
 * Author: lishangmin
 * Created: 2019-03-26 17:00
 */
@Service
@Slf4j
public class IFrontServiceImpl implements IFrontService {

	@Override
	public ProposalModel insure(AccountModel account) {
		log.debug("示例服务--1：{}",account.getName());
		return ProposalModel.builder().account(account).proposalNo(UUID.randomUUID().toString()).build();
	}

}
