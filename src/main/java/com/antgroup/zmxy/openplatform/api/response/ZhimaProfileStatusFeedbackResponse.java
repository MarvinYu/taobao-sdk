package com.antgroup.zmxy.openplatform.api.response;

import com.antgroup.zmxy.openplatform.api.ZhimaResponse;
import com.antgroup.zmxy.openplatform.api.internal.mapping.ApiField;

/**
 * ALIPAY API: zhima.profile.status.feedback response.
 * 
 * @author auto create
 * @since 1.0, 2016-03-31 14:36:04
 */
public class ZhimaProfileStatusFeedbackResponse extends ZhimaResponse {

	private static final long serialVersionUID = 5648454133781822323L;

	/** 
	 * 业务处理结果
	 */
	@ApiField("biz_success")
	private Boolean bizSuccess;

	public void setBizSuccess(Boolean bizSuccess) {
		this.bizSuccess = bizSuccess;
	}
	public Boolean getBizSuccess( ) {
		return this.bizSuccess;
	}

}
