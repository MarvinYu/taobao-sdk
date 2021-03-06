package com.antgroup.zmxy.openplatform.api.response;

import com.antgroup.zmxy.openplatform.api.ZhimaResponse;
import com.antgroup.zmxy.openplatform.api.domain.EpInfo;
import com.antgroup.zmxy.openplatform.api.internal.mapping.ApiField;

/**
 * ALIPAY API: zhima.credit.ep.contact.name.get response.
 * 
 * @author auto create
 * @since 1.0, 2016-05-06 11:45:17
 */
public class ZhimaCreditEpContactNameGetResponse extends ZhimaResponse {

	private static final long serialVersionUID = 4162482949636568712L;

	/** 
	 * 芝麻信用对于每一次请求返回的业务号。后续可以通过此业务号进行对账。
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 企业联系信息
	 */
	@ApiField("company_contact")
	private EpInfo companyContact;

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

	public void setCompanyContact(EpInfo companyContact) {
		this.companyContact = companyContact;
	}
	public EpInfo getCompanyContact( ) {
		return this.companyContact;
	}

}
