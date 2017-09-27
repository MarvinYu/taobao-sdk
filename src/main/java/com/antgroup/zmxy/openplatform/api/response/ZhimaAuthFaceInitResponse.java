package com.antgroup.zmxy.openplatform.api.response;

import com.antgroup.zmxy.openplatform.api.ZhimaResponse;
import com.antgroup.zmxy.openplatform.api.internal.mapping.ApiField;

/**
 * ALIPAY API: zhima.auth.face.init response.
 * 
 * @author auto create
 * @since 1.0, 2017-04-01 14:37:42
 */
public class ZhimaAuthFaceInitResponse extends ZhimaResponse {

	private static final long serialVersionUID = 1642989478454296148L;

	/** 
	 * 请求返回的加密串
	 */
	@ApiField("auth_msg")
	private String authMsg;

	public void setAuthMsg(String authMsg) {
		this.authMsg = authMsg;
	}
	public String getAuthMsg( ) {
		return this.authMsg;
	}

}
