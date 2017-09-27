package com.antgroup.zmxy.openplatform.api.domain;

import com.antgroup.zmxy.openplatform.api.ZhimaObject;
import com.antgroup.zmxy.openplatform.api.internal.mapping.ApiField;
import com.antgroup.zmxy.openplatform.api.internal.mapping.ApiListField;

import java.util.List;

/**
 * 案件串联列表
 *
 * @author auto create
 * @since 1.0, 2017-03-21 23:24:13
 */
public class CaseSeriesList extends ZhimaObject {

	private static final long serialVersionUID = 4665868752368143775L;

	/** 
	 * null
	 */
	@ApiListField("case_series_list")
	@ApiField("case_series")
	private List<CaseSeries> caseSeriesList;

	public void setCaseSeriesList(List<CaseSeries> caseSeriesList) {
		this.caseSeriesList = caseSeriesList;
	}
	public List<CaseSeries> getCaseSeriesList( ) {
		return this.caseSeriesList;
	}

}
