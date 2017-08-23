package com.itheima.item.pagelist;

import java.io.Serializable;
import java.util.List;

public class EasyUIDataGridResult implements Serializable{
	 private Integer total;

	    private List<?> rows;

	    public EasyUIDataGridResult() {
			super();
			// TODO Auto-generated constructor stub
		}

		public EasyUIDataGridResult(Integer total, List<?> rows) {
	        this.total = total;
	        this.rows = rows;
	    }

	    public EasyUIDataGridResult(Long total, List<?> rows) {
	        this.total = total.intValue();
	        this.rows = rows;
	    }

	    public Integer getTotal() {
	        return total;
	    }

	    public void setTotal(Integer total) {
	        this.total = total;
	    }

	    public List<?> getRows() {
	        return rows;
	    }

	    public void setRows(List<?> rows) {
	        this.rows = rows;
	    }
}
