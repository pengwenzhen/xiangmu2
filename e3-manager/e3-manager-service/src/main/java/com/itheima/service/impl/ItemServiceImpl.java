package com.itheima.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itheima.item.pagelist.EasyUIDataGridResult;
import com.itheima.item.pagelist.EasyUITreeNode;
import com.itheima.mapper.TbItemCatMapper;
import com.itheima.mapper.TbItemMapper;
import com.itheima.mapper.TbUserMapper;
import com.itheima.pojo.TbItem;
import com.itheima.pojo.TbItemCatExample;
import com.itheima.pojo.TbItemCatExample.Criteria;
import com.itheima.pojo.TbItemExample;
import com.itheima.pojo.TbUser;
import com.itheima.pojo.TbUserExample;
import com.itheima.service.ItemService;
@Service
public class ItemServiceImpl implements ItemService{
	@Autowired
	private TbItemMapper itemMapper;

	@Override
	public EasyUIDataGridResult getItemList(Integer page, Integer rows) {
		//设置分页信息
		PageHelper.startPage(page, rows);
		//执行查询
		TbItemExample example = new TbItemExample();
		List<TbItem> list = itemMapper.selectByExample(example);
		//取分页信息
		PageInfo<TbItem> pageInfo = new PageInfo<>(list);
		
		//创建返回结果对象
		EasyUIDataGridResult result = new EasyUIDataGridResult(pageInfo.getTotal(),list);
		return result;
	}



}
