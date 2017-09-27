package com.antgroup.zmxy.openplatform.api.response;

import com.antgroup.zmxy.openplatform.api.ZhimaResponse;
import com.antgroup.zmxy.openplatform.api.internal.mapping.ApiField;

/**
 * ALIPAY API: zhima.auth.info.authorize response.
 * 
 * @author auto create
 * @since 1.0, 2017-04-07 10:46:17
 */
public class ZhimaAuthInfoAuthorizeResponse extends ZhimaResponse {

	private static final long serialVersionUID = 6461241666532962152L;

	/** 
	 * 用户在商户端的身份标识ID
	 */
	@ApiField("open_id")
	private String openId;

	/** 
	 * 商户透传的值，芝麻不做解析
	 */
	@ApiField("state")
	private String state;

	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getOpenId( ) {
		return this.openId;
	}

	public void setState(String state) {
		this.state = state;
	}
	public String getState( ) {
		return this.state;
	}

}
