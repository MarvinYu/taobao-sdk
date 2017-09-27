package com.antgroup.zmxy.openplatform.api.domain;

import com.antgroup.zmxy.openplatform.api.ZhimaObject;
import com.antgroup.zmxy.openplatform.api.internal.mapping.ApiField;
import com.antgroup.zmxy.openplatform.api.internal.mapping.ApiListField;

import java.util.List;

/**
 * 处罚信息列表
 *
 * @author auto create
 * @since 1.0, 2017-03-21 23:22:51
 */
public class PunishmentList extends ZhimaObject {

	private static final long serialVersionUID = 8744669732363172867L;

	/** 
	 * null
	 */
	@ApiListField("punishment_list")
	@ApiField("punishment")
	private List<Punishment> punishmentList;

	public void setPunishmentList(List<Punishment> punishmentList) {
		this.punishmentList = punishmentList;
	}
	public List<Punishment> getPunishmentList( ) {
		return this.punishmentList;
	}

}
