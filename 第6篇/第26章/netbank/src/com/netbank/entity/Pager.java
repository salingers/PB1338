package com.netbank.entity;

public class Pager {
	private int curPage;//待顯示頁
	private int perPageRows ;//一頁顯示的記錄數  
	private int rowCount; //記錄總數  
	private int pageCount; //總頁數 	
	public int getCurPage() {
		return curPage;
	}
	public void setCurPage(int currentPage) {
		this.curPage = currentPage;
	}
	public int getPerPageRows() {
		return perPageRows;
	}
	public void setPerPageRows(int perPageRows) {
		this.perPageRows = perPageRows;
	}
	public int getRowCount() {
		return rowCount;
	}
	public void setRowCount(int rowCount) {
		this.rowCount = rowCount;
	}
	public int getPageCount() {
		return (rowCount+perPageRows-1)/perPageRows;
	}
}
