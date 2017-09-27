package com.antgroup.zmxy.openplatform.api.response;

import com.antgroup.zmxy.openplatform.api.ZhimaResponse;
import com.antgroup.zmxy.openplatform.api.internal.mapping.ApiField;

import java.util.UUID;

/**
 * ALIPAY API: zhima.credit.antifraud.score.get response.
 * 
 * @author auto create
 * @since 1.0, 2017-06-02 14:55:56
 */
public class ZhimaCreditAntifraudScoreGetResponse extends ZhimaResponse {

	private static final long serialVersionUID = 7236657584367443792L;

	private String id=UUID.randomUUID().toString();
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	/** 
	 * 芝麻信用对于每一次请求返回的业务号。后续可以通过此业务号进行对账
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 申请欺诈评分，分数范围是[0,100]的整数,分数越高信息越真实
	 */
	@ApiField("score")
	private Long score;

	/**
	 * 请求ID
	 */
	private String reqId;
	
	/**
	 * 请求对象中的业务流水凭证
	 */
	private String transactionId;
	
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

	public void setScore(Long score) {
		this.score = score;
	}
	public Long getScore( ) {
		return this.score;
	}
	public String getReqId() {
		return reqId;
	}
	public void setReqId(String reqId) {
		this.reqId = reqId;
	}
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

}
