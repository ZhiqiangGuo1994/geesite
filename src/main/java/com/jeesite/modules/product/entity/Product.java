/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.jeesite.modules.product.entity;

import org.hibernate.validator.constraints.Length;

import com.jeesite.common.entity.DataEntity;
import com.jeesite.common.mybatis.annotation.Column;
import com.jeesite.common.mybatis.annotation.Table;
import com.jeesite.common.mybatis.mapper.query.QueryType;

/**
 * productEntity
 * @author gzq
 * @version 2019-12-11
 */
@Table(name="product", alias="a", columns={
		@Column(name="id", attrName="id", label="编号", isPK=true),
		@Column(name="product_name", attrName="productName", label="产品名称", queryType=QueryType.LIKE),
		@Column(name="product_number", attrName="productNumber", label="产品数量"),
		@Column(includeEntity=DataEntity.class),
	}, orderBy="a.update_date DESC"
)
public class Product extends DataEntity<Product> {
	
	private static final long serialVersionUID = 1L;
	private String productName;		// 产品名称
	private Long productNumber;		// 产品数量
	
	public Product() {
		this(null);
	}

	public Product(String id){
		super(id);
	}
	
	@Length(min=0, max=255, message="产品名称长度不能超过 255 个字符")
	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public Long getProductNumber() {
		return productNumber;
	}

	public void setProductNumber(Long productNumber) {
		this.productNumber = productNumber;
	}
	
}