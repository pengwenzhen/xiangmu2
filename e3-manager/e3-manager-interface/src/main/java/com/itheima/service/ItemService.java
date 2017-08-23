package com.itheima.service;

import java.util.List;

import com.itheima.item.pagelist.EasyUIDataGridResult;
import com.itheima.item.pagelist.EasyUITreeNode;

public interface ItemService {

	EasyUIDataGridResult getItemList(Integer page, Integer rows);


}
