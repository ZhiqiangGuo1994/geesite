/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.jeesite.modules.product.dao;

import com.jeesite.common.dao.CrudDao;
import com.jeesite.common.mybatis.annotation.MyBatisDao;
import com.jeesite.modules.product.entity.Product;

/**
 * productDAO接口
 * @author gzq
 * @version 2019-12-11
 */
@MyBatisDao
public interface ProductDao extends CrudDao<Product> {
	
}