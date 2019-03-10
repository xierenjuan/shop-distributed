package com.test.common.dto;

public class GoodsDto {
    private Long id;
    private String name;
    private Boolean putaway;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getPutaway() {
        return putaway;
    }

    public void setPutaway(Boolean putaway) {
        this.putaway = putaway;
    }
}
