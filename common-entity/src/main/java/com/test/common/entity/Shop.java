package com.test.common.entity;

public class Shop {
    /**
     * 
     */
    private Long id;

    /**
     * 
     */
    private String sname;

    /**
     * 
     */
    private String address;

    /**
     * 
     * @return id 
     */
    public Long getId() {
        return id;
    }

    /**
     * 
     * @param id 
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 
     * @return sname 
     */
    public String getSname() {
        return sname;
    }

    /**
     * 
     * @param sname 
     */
    public void setSname(String sname) {
        this.sname = sname == null ? null : sname.trim();
    }

    /**
     * 
     * @return address 
     */
    public String getAddress() {
        return address;
    }

    /**
     * 
     * @param address 
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }
}