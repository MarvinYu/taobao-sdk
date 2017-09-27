package com.antgroup.zmxy.openplatform.api.domain;

import com.antgroup.zmxy.openplatform.api.ZhimaObject;
import com.antgroup.zmxy.openplatform.api.internal.mapping.ApiField;
import com.antgroup.zmxy.openplatform.api.internal.mapping.ApiListField;

import java.util.List;

/**
 * 欠税信息
 *
 * @author auto create
 * @since 1.0, 2017-03-16 22:40:31
 */
public class TaxOwe extends ZhimaObject {

	private static final long serialVersionUID = 7477146882771959753L;

	/** 
	 * null
	 */
	@ApiListField("tax_owe")
	@ApiField("ep_element")
	private List<EpElement> taxOwe;

	public void setTaxOwe(List<EpElement> taxOwe) {
		this.taxOwe = taxOwe;
	}
	public List<EpElement> getTaxOwe( ) {
		return this.taxOwe;
	}

}
