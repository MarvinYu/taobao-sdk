package com.antgroup.zmxy.openplatform.api.domain;

import com.antgroup.zmxy.openplatform.api.ZhimaObject;
import com.antgroup.zmxy.openplatform.api.internal.mapping.ApiField;
import com.antgroup.zmxy.openplatform.api.internal.mapping.ApiListField;

import java.util.List;

/**
 * 行业关注名单详情
 *
 * @author auto create
 * @since 1.0, 2016-06-17 09:59:45
 */
public class ZmWatchListDetail extends ZhimaObject {

	private static final long serialVersionUID = 2265537655115721982L;

	/** 
	 * 风险信息行业编码
	 */
	@ApiField("biz_code")
	private String bizCode;

	/** 
	 * 风险编码
	 */
	@ApiField("code")
	private String code;

	/** 
	 * 扩展信息
	 */
	@ApiListField("extend_info")
	@ApiField("zm_watch_list_extend_info")
	private List<ZmWatchListExtendInfo> extendInfo;

	/** 
	 * 行业名单数据类型，当前为保留字段只返回0，请忽略
	 */
	@ApiField("level")
	private Long level;

	/** 
	 * 数据刷新时间
	 */
	@ApiField("refresh_time")
	private String refreshTime;

	/** 
	 * 结清状态
	 */
	@ApiField("settlement")
	private Boolean settlement;

	/** 
	 * 当用户进行异议处理，并核查完毕之后，仍有异议时，给出的声明
	 */
	@ApiField("statement")
	private String statement;

	/** 
	 * 用户本人对该条负面记录有异议时，表示该异议处理流程的状态
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 行业名单风险类型
	 */
	@ApiField("type")
	private String type;

	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}
	public String getBizCode( ) {
		return this.bizCode;
	}

	public void setCode(String code) {
		this.code = code;
	}
	public String getCode( ) {
		return this.code;
	}

	public void setExtendInfo(List<ZmWatchListExtendInfo> extendInfo) {
		this.extendInfo = extendInfo;
	}
	public List<ZmWatchListExtendInfo> getExtendInfo( ) {
		return this.extendInfo;
	}

	public void setLevel(Long level) {
		this.level = level;
	}
	public Long getLevel( ) {
		return this.level;
	}

	public void setRefreshTime(String refreshTime) {
		this.refreshTime = refreshTime;
	}
	public String getRefreshTime( ) {
		return this.refreshTime;
	}

	public void setSettlement(Boolean settlement) {
		this.settlement = settlement;
	}
	public Boolean getSettlement( ) {
		return this.settlement;
	}

	public void setStatement(String statement) {
		this.statement = statement;
	}
	public String getStatement( ) {
		return this.statement;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setType(String type) {
		this.type = type;
	}
	public String getType( ) {
		return this.type;
	}

}
