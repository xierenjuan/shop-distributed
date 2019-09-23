package com.test.common.entity;

public class Goods {
    /**
     * 
     */
    private Long id;

    private String abc;

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private Boolean putaway;


    public String getAbc() {
        return abc;
    }

    public void setAbc(String abc) {
        this.abc = abc;
    }

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
     * @return name 
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name 
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 
     * @return putaway 
     */
    public Boolean getPutaway() {
        return putaway;
    }

    /**
     * 
     * @param putaway 
     */
    public void setPutaway(Boolean putaway) {
        this.putaway = putaway;
    }
}