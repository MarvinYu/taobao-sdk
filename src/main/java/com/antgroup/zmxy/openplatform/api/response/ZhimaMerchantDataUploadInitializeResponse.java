package com.antgroup.zmxy.openplatform.api.response;

import com.antgroup.zmxy.openplatform.api.ZhimaResponse;
import com.antgroup.zmxy.openplatform.api.internal.mapping.ApiField;

/**
 * ALIPAY API: zhima.merchant.data.upload.initialize response.
 * 
 * @author auto create
 * @since 1.0, 2017-04-28 14:30:00
 */
public class ZhimaMerchantDataUploadInitializeResponse extends ZhimaResponse {

	private static final long serialVersionUID = 6686465923493526652L;

	/** 
	 * 模板文件url地址
	 */
	@ApiField("template_url")
	private String templateUrl;

	public void setTemplateUrl(String templateUrl) {
		this.templateUrl = templateUrl;
	}
	public String getTemplateUrl( ) {
		return this.templateUrl;
	}

}
