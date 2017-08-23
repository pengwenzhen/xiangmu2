package com.itheima.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.itheima.item.pagelist.EasyUITreeNode;
import com.itheima.service.CatItemService;

@Controller
public class CatItemController {
	@Autowired
	private CatItemService catItemService;
	@RequestMapping("/item/cat/list")
	@ResponseBody
	public List<EasyUITreeNode> getItemCatList(@RequestParam(value="id" ,defaultValue="0")Long parentId){
		List<EasyUITreeNode> list = catItemService.getItemCatList(parentId);
		return list;
	}
}
