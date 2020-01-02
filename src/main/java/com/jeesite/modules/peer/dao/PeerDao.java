/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.jeesite.modules.peer.dao;

import com.jeesite.common.dao.CrudDao;
import com.jeesite.common.mybatis.annotation.MyBatisDao;
import com.jeesite.modules.peer.entity.Peer;

/**
 * peerDAO接口
 * @author gzq
 * @version 2019-12-31
 */
@MyBatisDao
public interface PeerDao extends CrudDao<Peer> {
	
}