package com.antgroup.zmxy.openplatform.api.response;

import com.antgroup.zmxy.openplatform.api.ZhimaResponse;
import com.antgroup.zmxy.openplatform.api.internal.mapping.ApiField;

/**
 * ALIPAY API: zhima.credit.ep.score.get response.
 * 
 * @author auto create
 * @since 1.0, 2017-05-16 15:56:45
 */
public class ZhimaCreditEpScoreGetResponse extends ZhimaResponse {

	private static final long serialVersionUID = 5188481914362678379L;

	/** 
	 * 芝麻信用对于每一次请求返回的业务号。后续可以通过此业务号进行对账
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 被查询企业的经营成长分，分值在[1000,2000]之间，如果无法打分则是N/A
	 */
	@ApiField("zm_score")
	private String zmScore;

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

	public void setZmScore(String zmScore) {
		this.zmScore = zmScore;
	}
	public String getZmScore( ) {
		return this.zmScore;
	}

}
