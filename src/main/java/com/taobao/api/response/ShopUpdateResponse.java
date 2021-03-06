package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Shop;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.shop.update response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class ShopUpdateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8599363568641555261L;

	/** 
	 * 店铺信息
	 */
	@ApiField("shop")
	private Shop shop;


	public void setShop(Shop shop) {
		this.shop = shop;
	}
	public Shop getShop( ) {
		return this.shop;
	}
	


}
