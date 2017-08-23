package com.itheima.service;

import java.util.List;

import com.itheima.item.pagelist.EasyUITreeNode;

public interface CatItemService {

	List<EasyUITreeNode> getItemCatList(Long parentId);

}
