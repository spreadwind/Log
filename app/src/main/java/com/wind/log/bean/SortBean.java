package com.wind.log.bean;

/**
 * Created by H on 2017/9/24.
 */

public class SortBean {

    private int id;
    private int imageId;
    private String name;

    public SortBean(int id, int imageId, String name) {
        this.id = id;
        this.imageId = imageId;
        this.name = name;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
