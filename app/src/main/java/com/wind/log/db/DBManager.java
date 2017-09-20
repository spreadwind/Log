package com.wind.log.db;

import android.content.Context;

import org.litepal.LitePal;
import org.litepal.crud.DataSupport;

/**
 * Created by H on 2017/9/15.
 * 对数据库中各表的CRUD操作
 */

public class DBManager extends DataSupport {
    private Context context;
    private DBManager dbManager;

    //创建数据库
    public void createDB() {
        LitePal.getDatabase();
    }

    //添加数据
    public void addData() {

    }

    //更新数据
    public void updateData() {

    }

    //查询数据
    public void findData() {

    }

    //删除数据
    public void deleteData() {

    }

    //删除全部数据
    public void deleteAllData() {
        DataSupport.deleteAll(Daily.class);
    }
}
