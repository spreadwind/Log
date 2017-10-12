package com.wind.log.db;

import org.litepal.crud.DataSupport;

/**
 * Created by H on 2017/9/5.
 * 创建数据库的数据表：保存记帐信息
 */

public class Daily extends DataSupport {

    private int id;
    private String type;
    private String note;
    private String date;
    private String money;  //应用用double


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }


}





