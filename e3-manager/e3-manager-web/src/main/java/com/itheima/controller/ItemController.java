package com.itheima.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.itheima.item.pagelist.EasyUIDataGridResult;
import com.itheima.item.pagelist.EasyUITreeNode;
import com.itheima.pojo.TbUser;
import com.itheima.service.ItemService;

@Controller
public class ItemController {
	@Autowired
	private ItemService itemService;
	@RequestMapping("/")
	public String showItemList(){
		return "index";
	}
	@RequestMapping("/{page}")
	public String showPage(@PathVariable String page) {
		return page;
	}
	@RequestMapping("/item/list")
	@ResponseBody
	public EasyUIDataGridResult findUser(Integer page ,Integer rows){
		EasyUIDataGridResult dataGrid = itemService.getItemList(page,rows);
		return dataGrid;
	}
	

}
