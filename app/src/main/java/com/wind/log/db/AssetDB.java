package com.wind.log.db;

/**
 * Created by H on 2017/10/10.
 */

public class AssetDB {

    private int ImageId;
    private String name;
    private String info;
    private String money;

    public AssetDB(int imageId, String name,String info, String money) {
        ImageId = imageId;
        this.name = name;
        this.info = info;
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

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }
}

