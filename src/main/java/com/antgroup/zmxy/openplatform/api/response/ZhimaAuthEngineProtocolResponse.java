package com.antgroup.zmxy.openplatform.api.response;

import com.antgroup.zmxy.openplatform.api.ZhimaResponse;
import com.antgroup.zmxy.openplatform.api.internal.mapping.ApiField;

/**
 * ALIPAY API: zhima.auth.engine.protocol response.
 * 
 * @author auto create
 * @since 1.0, 2017-04-07 10:46:58
 */
public class ZhimaAuthEngineProtocolResponse extends ZhimaResponse {

	private static final long serialVersionUID = 2134612972219677553L;

	/** 
	 * 27位openId，用于标识芝麻会员在商户端的身份标识
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
