package com.test.common.entity;

import java.math.BigDecimal;

public class Order {
    /**
     * 
     */
    private Long id;

    /**
     * 
     */
    private BigDecimal amount;

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
     * @return amount 
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * 
     * @param amount 
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}