package com.test.common.result;

import io.swagger.annotations.ApiModelProperty;

public class CommonStatus {
    
    public static final String STATUS_SUCCESS = "1";//成功
	public static final String STATUS_FAIL = "0";//失败
	public static final String INVALID_STRING = "";
	
	@ApiModelProperty("是否成功(1 成功 ,0 失败)")
	private String succeed;
	
	@ApiModelProperty("异常码")
	private String errorCode;
	
	@ApiModelProperty("异常描述")
	private String errorDesc;
	
	public String getSucceed() {
		return succeed;
	}

	public void setSucceed(String succeed) {
		this.succeed = succeed;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorDesc() {
		return errorDesc;
	}

	public void setErrorDesc(String errorDesc) {
		this.errorDesc = errorDesc;
	}
    
}
