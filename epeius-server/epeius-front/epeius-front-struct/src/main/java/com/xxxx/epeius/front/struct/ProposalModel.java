package com.xxxx.epeius.front.struct;

import lombok.Builder;
import lombok.Data;

/**
 * Description: 示例代码
 * Author: lishangmin
 * Created: 2019-03-26 16:26
 */
@Data
@Builder
public class ProposalModel {

	private String proposalNo;

	private AccountModel account;

	public ProposalModel() {
	}

	public ProposalModel(String proposalNo, AccountModel account) {
		this.proposalNo = proposalNo;
		this.account = account;
	}
}
