package com.test.common.result;


import java.util.List;

import com.github.pagehelper.Page;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiParam;

public class CommonPage {

	@ApiParam(value="当前页码(不传默认是第一页)")
	@ApiModelProperty(value="当前页码")
	private int pageNum = 1;
	
	@ApiParam(value="每页多少条")
	@ApiModelProperty(value="每页多少条")
	private int pageSize = 20;
	
	@ApiParam(value="总共多少条")
	@ApiModelProperty(value="总共多少条")
	private long total;
	
	@ApiParam(value="总共多少页")
	@ApiModelProperty(value="总共多少页")
	private int pages;

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}
	
	/**
	 * 得到一个不分页的分页对象
	 * @return
	 */
	public static CommonPage getMaxSizePage() {
		CommonPage page = new CommonPage();
		page.setPageNum(1);
		page.setPageSize( Integer.MAX_VALUE );
		
		return page;
	}

	/**
	 * 判断是否是page对象
	 * @param orignal  查询出的原生list
	 * @param cl
	 * @param <A>
	 * @return
	 */
	public static <A> Page<A> getPageList(List<?> orignal, Class<A> cl){
		Page<A> pageOuts = new Page<A>();
		if(orignal instanceof Page){
			Page or = (Page) orignal;
			pageOuts.setTotal(or.getTotal());
			pageOuts.setPageSize(or.getPageSize());
			pageOuts.setPageNum(or.getPageNum());
			pageOuts.setPages(or.getPages());
			return pageOuts;
		}
		return pageOuts;
	}
	
}
