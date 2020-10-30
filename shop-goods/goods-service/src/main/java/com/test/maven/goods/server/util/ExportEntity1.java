package com.test.maven.goods.server.util;

import java.math.BigDecimal;
import java.util.Date;

public class ExportEntity1 {

    @ExportSortAnnotation(sort = 2)
    private String name;
    @ExportSortAnnotation(sort = 3)
    private BigDecimal amount;
    @ExportSortAnnotation(sort = 4)
    private Date birthday;
    @ExportSortAnnotation(sort = 1)
    private int length;

    public ExportEntity1(String name, BigDecimal amount, Date birthday, int length) {
        this.name = name;
        this.amount = amount;
        this.birthday = birthday;
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
