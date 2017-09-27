package com.antgroup.zmxy.openplatform.api.response;

import com.antgroup.zmxy.openplatform.api.ZhimaResponse;
import com.antgroup.zmxy.openplatform.api.internal.mapping.ApiField;
import com.antgroup.zmxy.openplatform.api.internal.mapping.ApiListField;

import java.util.List;
import java.util.UUID;

/**
 * ALIPAY API: zhima.credit.antifraud.verify response.
 * 
 * @author auto create
 * @since 1.0, 2017-06-02 14:56:23
 */
public class ZhimaCreditAntifraudVerifyResponse extends ZhimaResponse {

	private static final long serialVersionUID = 8396283691861596855L;
	
	private String id=UUID.randomUUID().toString();

	/** 
	 * 芝麻信用对于每一次请求返回的业务号。后续可以通过此业务号进行对账
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 欺诈信息验证，输出验证码verifyCode列表,verifyCode和文案的映射关系参见"产品接口说明"
	 */
	@ApiListField("verify_code")
	@ApiField("string")
	private List<String> verifyCode;

	/**
	 * 请求ID
	 */
	private String reqId;
	
	/**
	 * 请求对象中的业务流水凭证
	 */
	private String transactionId;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

	public void setVerifyCode(List<String> verifyCode) {
		this.verifyCode = verifyCode;
	}
	public List<String> getVerifyCode( ) {
		return this.verifyCode;
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
