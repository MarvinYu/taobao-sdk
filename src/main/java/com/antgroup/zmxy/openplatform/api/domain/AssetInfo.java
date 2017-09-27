package com.antgroup.zmxy.openplatform.api.domain;

import com.antgroup.zmxy.openplatform.api.ZhimaObject;
import com.antgroup.zmxy.openplatform.api.internal.mapping.ApiField;
import com.antgroup.zmxy.openplatform.api.internal.mapping.ApiListField;

import java.util.List;

/**
 * 资产信息
 *
 * @author auto create
 * @since 1.0, 2017-03-24 17:44:13
 */
public class AssetInfo extends ZhimaObject {

	private static final long serialVersionUID = 8554446554179916526L;

	/** 
	 * null
	 */
	@ApiListField("asset_list")
	@ApiField("ep_info")
	private List<EpInfo> assetList;

	public void setAssetList(List<EpInfo> assetList) {
		this.assetList = assetList;
	}
	public List<EpInfo> getAssetList( ) {
		return this.assetList;
	}

}
