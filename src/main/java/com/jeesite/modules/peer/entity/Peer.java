/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.jeesite.modules.peer.entity;

import org.hibernate.validator.constraints.Length;

import com.jeesite.common.entity.DataEntity;
import com.jeesite.common.mybatis.annotation.Column;
import com.jeesite.common.mybatis.annotation.Table;
import com.jeesite.common.mybatis.mapper.query.QueryType;

/**
 * peerEntity
 * @author gzq
 * @version 2019-12-31
 */
@Table(name="peer", alias="a", columns={
		@Column(name="id", attrName="id", label="编号", isPK=true),
		@Column(name="peer_name", attrName="peerName", label="节点名称", queryType=QueryType.LIKE),
		@Column(name="peer_ip", attrName="peerIp", label="节点IP"),
		@Column(name="peer_info", attrName="peerInfo", label="节点信息"),
		@Column(name="create_by", attrName="createBy", label="创建者", isUpdate=false, isQuery=false),
		@Column(name="create_date", attrName="createDate", label="创建时间", isUpdate=false, isQuery=false),
		@Column(name="update_by", attrName="updateBy", label="更新者", isQuery=false),
		@Column(name="update_date", attrName="updateDate", label="更新时间", isQuery=false),
		@Column(name="remarks", attrName="remarks", label="备注信息", queryType=QueryType.LIKE),
	}, orderBy="a.update_date DESC"
)
public class Peer extends DataEntity<Peer> {
	
	private static final long serialVersionUID = 1L;
	private String peerName;		// 节点名称
	private String peerIp;		// 节点IP
	private String peerInfo;		// 节点IP
	
	public Peer() {
		this(null);
	}

	public Peer(String id){
		super(id);
	}
	
	@Length(min=0, max=255, message="节点名称长度不能超过 255 个字符")
	public String getPeerName() {
		return peerName;
	}

	public void setPeerName(String peerName) {
		this.peerName = peerName;
	}
	
	@Length(min=0, max=255, message="节点IP长度不能超过 255 个字符")
	public String getPeerIp() {
		return peerIp;
	}

	public void setPeerIp(String peerIp) {
		this.peerIp = peerIp;
	}
	
	@Length(min=0, max=255, message="节点信息长度不能超过 255 个字符")
	public String getPeerInfo() {
		return peerInfo;
	}

	public void setPeerInfo(String peerInfo) {
		this.peerInfo = peerInfo;
	}
	
}