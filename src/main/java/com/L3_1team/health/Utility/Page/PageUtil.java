package com.L3_1team.health.Utility.Page;

public class PageUtil {
	private int pageNum; // ���� ������ ��ȣ
	private int startRow; // �������ȣ
	private int endRow; // �����ȣ
	private int totalPageCount; // ��ü ������ ����
	private int startPageNum; // ���������� ��ȣ
	private int endPageNum; // �������� ��ȣ
	private int totalRowCount;// ��ü ���� ����

	public PageUtil() {
	}

	/**
	 * ����¡ó���� ������ ���� �����ִ� ������
	 * 
	 * @param pageNum        ��������ȣ
	 * @param totalRowCount  ��ü���ǰ���
	 * @param rowBlockCount  ���������� ����
	 * @param pageBlockCount �������������� ����
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
