package com.wind.log.bean;

/**
 * Created by H on 2017/9/24.
 */

public class AssetBean {

    private int ImageId;
    private String name;
    private String note;
    private String money;

    public AssetBean(int imageId, String name,String note, String money) {
        ImageId = imageId;
        this.name = name;
        this.note = note;
        this.money = money;
    }

    public int getImageId() {
        return ImageId;
    }

    public void setImageId(int imageId) {
        ImageId = imageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String info) {
        this.note = note;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }
}
