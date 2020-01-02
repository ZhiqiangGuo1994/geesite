/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.jeesite.modules.peer.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.jeesite.modules.peer.entity.Peer;
import com.jeesite.modules.peer.dao.PeerDao;

/**
 * peerService
 * @author gzq
 * @version 2019-12-31
 */
@Service
@Transactional(readOnly=true)
public class PeerService extends CrudService<PeerDao, Peer> {
	
	/**
	 * 获取单条数据
	 * @param peer
	 * @return
	 */
	@Override
	public Peer get(Peer peer) {
		return super.get(peer);
	}
	
	/**
	 * 查询分页数据
	 * @param peer 查询条件
	 * @param peer.page 分页对象
	 * @return
	 */
	@Override
	public Page<Peer> findPage(Peer peer) {
		return super.findPage(peer);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param peer
	 */
	@Override
	@Transactional(readOnly=false)
	public void save(Peer peer) {
		super.save(peer);
	}
	
	/**
	 * 更新状态
	 * @param peer
	 */
	@Override
	@Transactional(readOnly=false)
	public void updateStatus(Peer peer) {
		super.updateStatus(peer);
	}
	
	/**
	 * 删除数据
	 * @param peer
	 */
	@Override
	@Transactional(readOnly=false)
	public void delete(Peer peer) {
		super.delete(peer);
	}
	
}