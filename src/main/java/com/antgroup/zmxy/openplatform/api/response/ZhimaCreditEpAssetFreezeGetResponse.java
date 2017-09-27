package com.antgroup.zmxy.openplatform.api.response;

import com.antgroup.zmxy.openplatform.api.ZhimaResponse;
import com.antgroup.zmxy.openplatform.api.domain.AssetInfo;
import com.antgroup.zmxy.openplatform.api.internal.mapping.ApiField;

/**
 * ALIPAY API: zhima.credit.ep.asset.freeze.get response.
 * 
 * @author auto create
 * @since 1.0, 2017-05-09 15:54:12
 */
public class ZhimaCreditEpAssetFreezeGetResponse extends ZhimaResponse {

	private static final long serialVersionUID = 1743851226241867799L;

	/** 
	 * 芝麻信用对于每一次请求返回的业务号。后续可以通过此业务号进行对账
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 资产冻结信息
	 */
	@ApiField("user_asset_freeze_info")
	private AssetInfo userAssetFreezeInfo;

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

	public void setUserAssetFreezeInfo(AssetInfo userAssetFreezeInfo) {
		this.userAssetFreezeInfo = userAssetFreezeInfo;
	}
	public AssetInfo getUserAssetFreezeInfo( ) {
		return this.userAssetFreezeInfo;
	}

}
