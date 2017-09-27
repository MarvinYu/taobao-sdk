package com.antgroup.zmxy.openplatform.api.response;

import com.antgroup.zmxy.openplatform.api.ZhimaResponse;
import com.antgroup.zmxy.openplatform.api.domain.EpElement;
import com.antgroup.zmxy.openplatform.api.internal.mapping.ApiField;
import com.antgroup.zmxy.openplatform.api.internal.mapping.ApiListField;

import java.util.List;

/**
 * ALIPAY API: zhima.credit.pe.lawsuit.detail.get response.
 * 
 * @author auto create
 * @since 1.0, 2017-04-10 11:16:58
 */
public class ZhimaCreditPeLawsuitDetailGetResponse extends ZhimaResponse {

	private static final long serialVersionUID = 7653463739682857287L;

	/** 
	 * 芝麻信用对于每一次请求返回的业务号。后续可以通过此业务号进行对账
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 个人涉诉信息元素
	 */
	@ApiListField("lawsuit_detail")
	@ApiField("ep_element")
	private List<EpElement> lawsuitDetail;

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

	public void setLawsuitDetail(List<EpElement> lawsuitDetail) {
		this.lawsuitDetail = lawsuitDetail;
	}
	public List<EpElement> getLawsuitDetail( ) {
		return this.lawsuitDetail;
	}

}
