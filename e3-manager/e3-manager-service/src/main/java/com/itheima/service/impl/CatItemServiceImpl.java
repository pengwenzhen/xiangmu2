package com.itheima.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itheima.item.pagelist.EasyUITreeNode;
import com.itheima.mapper.TbItemCatMapper;
import com.itheima.pojo.TbItemCat;
import com.itheima.pojo.TbItemCatExample;
import com.itheima.pojo.TbItemCatExample.Criteria;
import com.itheima.service.CatItemService;
@Service
public class CatItemServiceImpl implements CatItemService{
	@Autowired
	private TbItemCatMapper itemCatMapper;
	@Override
	public List<EasyUITreeNode> getItemCatList(Long parentId) {
		List<EasyUITreeNode> list = new ArrayList<>();
		//根据parentId查询节点列表
		TbItemCatExample example = new TbItemCatExample();
		Criteria criteria = example.createCriteria();
		Criteria criteria2 = criteria.andParentIdEqualTo(parentId);
		List<TbItemCat> list2 = itemCatMapper.selectByExample(example);
		for (TbItemCat tbItemCat : list2) {
			EasyUITreeNode node = new EasyUITreeNode();
			node.setId(tbItemCat.getId());
			node.setState(tbItemCat.getIsParent()?"closed":"open");
			node.setText(tbItemCat.getName());
			list.add(node);
		}
		return list;
	}
}
