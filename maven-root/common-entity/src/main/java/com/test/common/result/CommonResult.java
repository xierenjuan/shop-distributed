package com.test.common.result;

import com.github.pagehelper.Page;

import io.swagger.annotations.ApiModelProperty;

public class CommonResult<T> {
	
	@ApiModelProperty("状态")
	private CommonStatus status;
	
	@ApiModelProperty("分页参数")
	private CommonPage page;
	
	@ApiModelProperty("数据")
	private T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public CommonStatus getStatus() {
		return status;
	}

	public void setStatus(CommonStatus status) {
		this.status = status;
	}

    public CommonPage getPage() {
        return page;
    }

    public void setPage(CommonPage page) {
        this.page = page;
    }

	/**
	 * 返回一个默认成功的消息
	 * @return
	 */
	public static <T> CommonResult<T> getSucceedInstance(){
		CommonResult<T> result =  new CommonResult<>();
		CommonStatus status = new CommonStatus();
		status.setSucceed(CommonStatus.STATUS_SUCCESS);
		result.setStatus(status);
		return result;
	}
	
	/**
	 * 返回一个字符串数据成功的消息
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static <T> CommonResult<T> getSucceedInstance(T data){
		CommonResult<T> result =  new CommonResult<>();
		CommonStatus status = new CommonStatus();
		status.setSucceed(CommonStatus.STATUS_SUCCESS);
		result.setStatus(status);
		if (data instanceof Page){
			Page<?> pageData =  (Page<?>) data;
			CommonPage commonPage = new CommonPage();
            commonPage.setPageNum(pageData.getPageNum());
            commonPage.setPageSize(pageData.getPageSize());
            commonPage.setPages(pageData.getPages());
            commonPage.setTotal(pageData.getTotal());
            result.setPage(commonPage);
            result.setData( (T)pageData.getResult() );
		}else {
            result.setData(data);
        }
		return result;
	}




	/**
	 * 返回一个默认失败的消息
	 * @return
	 */
	public static <T> CommonResult<T> getFaiInstance(String code, String desc){
		CommonResult<T> result =  new CommonResult<>();
		CommonStatus status = new CommonStatus();
		status.setSucceed(CommonStatus.STATUS_FAIL);
		status.setErrorCode(code);
		status.setErrorDesc(desc);
		result.setStatus(status);
		return result;
	}

}
