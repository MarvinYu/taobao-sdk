package com.antgroup.zmxy.openplatform.api.response;

import com.antgroup.zmxy.openplatform.api.ZhimaResponse;
import com.antgroup.zmxy.openplatform.api.internal.mapping.ApiField;

/**
 * ALIPAY API: zhima.auth.engine.organizationauth response.
 * 
 * @author auto create
 * @since 1.0, 2017-06-01 20:42:56
 */
public class ZhimaAuthEngineOrganizationauthResponse extends ZhimaResponse {

	private static final long serialVersionUID = 4422245898734694792L;

	/** 
	 * 27位openId，用于标识芝麻会员在
	 */
	@ApiField("open_id")
	private String openId;

	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getOpenId( ) {
		return this.openId;
	}

}
