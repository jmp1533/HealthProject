package com.L3_1team.health.Utility.Page;

public class PageUtil {
	private int pageNum; // 현재 페이지 번호
	private int startRow; // 시작행번호
	private int endRow; // 끝행번호
	private int totalPageCount; // 전체 페이지 갯수
	private int startPageNum; // 시작페이지 번호
	private int endPageNum; // 끝페이지 번호
	private int totalRowCount;// 전체 행의 갯수

	public PageUtil() {
	}

	/**
	 * 페이징처리에 관련한 값을 구해주는 생성자
	 * 
	 * @param pageNum        페이지번호
	 * @param totalRowCount  전체글의갯수
	 * @param rowBlockCount  보여줄행의 갯수
	 * @param pageBlockCount 보여줄페이지의 갯수
	 * 
	 */
	public PageUtil(int pageNum, int totalRowCount, int rowBlockCount, int pageBlockCount) {
		this.pageNum = pageNum;
		this.totalRowCount = totalRowCount;

		startRow = (pageNum - 1) * rowBlockCount + 1;
		endRow = startRow + rowBlockCount - 1;
		totalPageCount = (int) Math.ceil(totalRowCount / (double) rowBlockCount);
		startPageNum = (pageNum - 1) / pageBlockCount * pageBlockCount + 1;
		endPageNum = startPageNum + pageBlockCount - 1;
		
		if (totalPageCount < endPageNum) {
			endPageNum = totalPageCount;
		}
		
		if (endPageNum == 0) {
			endPageNum = 1;
		}
	}

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getStartRow() {
		return startRow;
	}

	public void setStartRow(int startRow) {
		this.startRow = startRow;
	}

	public int getEndRow() {
		return endRow;
	}

	public void setEndRow(int endRow) {
		this.endRow = endRow;
	}

	public int getTotalPageCount() {
		return totalPageCount;
	}

	public void setTotalPageCount(int totalPageCount) {
		this.totalPageCount = totalPageCount;
	}

	public int getStartPageNum() {
		return startPageNum;
	}

	public void setStartPageNum(int startPageNum) {
		this.startPageNum = startPageNum;
	}

	public int getEndPageNum() {
		return endPageNum;
	}

	public void setEndPageNum(int endPageNum) {
		this.endPageNum = endPageNum;
	}

	public int getTotalRowCount() {
		return totalRowCount;
	}

	public void setTotalRowCount(int totalRowCount) {
		this.totalRowCount = totalRowCount;
	}
}
