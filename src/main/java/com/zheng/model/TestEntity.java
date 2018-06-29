package com.zheng.model;

import java.io.Serializable;

/**
 * @author
 * @Version 1.0
 * @Data 2018/6/29 16:20
 */
public class TestEntity implements Serializable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
