package com.antgroup.zmxy.openplatform.api.domain;

import com.antgroup.zmxy.openplatform.api.ZhimaObject;
import com.antgroup.zmxy.openplatform.api.internal.mapping.ApiField;
import com.antgroup.zmxy.openplatform.api.internal.mapping.ApiListField;

import java.util.List;

/**
 * 案件串联信息
 *
 * @author auto create
 * @since 1.0, 2017-03-21 23:21:05
 */
public class CaseSeries extends ZhimaObject {

	private static final long serialVersionUID = 3819229729858227674L;

	/** 
	 * null
	 */
	@ApiListField("case_series")
	@ApiField("ep_element")
	private List<EpElement> caseSeries;

	public void setCaseSeries(List<EpElement> caseSeries) {
		this.caseSeries = caseSeries;
	}
	public List<EpElement> getCaseSeries( ) {
		return this.caseSeries;
	}

}
