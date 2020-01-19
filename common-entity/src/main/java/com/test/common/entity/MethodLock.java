package com.test.common.entity;

import java.util.Date;

public class MethodLock {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 
     */
    private Date createDate;

    /**
     * 
     */
    private Date updateDate;

    /**
     * 
     */
    private Boolean dr;

    /**
     * 锁定的方法名
     */
    private String methodName;

    /**
     * 
     */
    private Long timeOut;

    /**
     * 备注信息
     */
    private String desc;

    /**
     * 主键
     * @return id 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 主键
     * @param id 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 
     * @return create_date 
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 
     * @param createDate 
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 
     * @return update_date 
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * 
     * @param updateDate 
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 
     * @return dr 
     */
    public Boolean getDr() {
        return dr;
    }

    /**
     * 
     * @param dr 
     */
    public void setDr(Boolean dr) {
        this.dr = dr;
    }

    /**
     * 锁定的方法名
     * @return method_name 锁定的方法名
     */
    public String getMethodName() {
        return methodName;
    }

    /**
     * 锁定的方法名
     * @param methodName 锁定的方法名
     */
    public void setMethodName(String methodName) {
        this.methodName = methodName == null ? null : methodName.trim();
    }

    /**
     * 
     * @return time_out 
     */
    public Long getTimeOut() {
        return timeOut;
    }

    /**
     * 
     * @param timeOut 
     */
    public void setTimeOut(Long timeOut) {
        this.timeOut = timeOut;
    }

    /**
     * 备注信息
     * @return desc 备注信息
     */
    public String getDesc() {
        return desc;
    }

    /**
     * 备注信息
     * @param desc 备注信息
     */
    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }
}