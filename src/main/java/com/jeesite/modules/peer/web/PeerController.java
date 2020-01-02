/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.jeesite.modules.peer.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jeesite.common.config.Global;
import com.jeesite.common.entity.Page;
import com.jeesite.common.web.BaseController;
import com.jeesite.modules.peer.entity.Peer;
import com.jeesite.modules.peer.service.PeerService;

/**
 * peerController
 * @author gzq
 * @version 2019-12-31
 */
@Controller
@RequestMapping(value = "${adminPath}/peer/peer")
public class PeerController extends BaseController {

	@Autowired
	private PeerService peerService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public Peer get(String id, boolean isNewRecord) {
		return peerService.get(id, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("peer:peer:view")
	@RequestMapping(value = {"list", ""})
	public String list(Peer peer, Model model) {
		model.addAttribute("peer", peer);
		return "modules/peer/peerList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("peer:peer:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<Peer> listData(Peer peer, HttpServletRequest request, HttpServletResponse response) {
		peer.setPage(new Page<>(request, response));
		Page<Peer> page = peerService.findPage(peer);
		
		/* 利用数据查询当前网络中正在运行的节点信息 */
		
		
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("peer:peer:view")
	@RequestMapping(value = "form")
	public String form(Peer peer, Model model) {
		model.addAttribute("peer", peer);
		return "modules/peer/peerForm";
	}

	/**
	 * 保存peer
	 */
	@RequiresPermissions("peer:peer:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated Peer peer) {
		peerService.save(peer);
		return renderResult(Global.TRUE, text("保存peer成功！"));
	}
	
	/**
	 * 删除peer
	 */
	@RequiresPermissions("peer:peer:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(Peer peer) {
		peerService.delete(peer);
		return renderResult(Global.TRUE, text("删除peer成功！"));
	}
	
}