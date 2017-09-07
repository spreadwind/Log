package com.wind.log;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

/**
 * Created by H on 2017/9/3.
 */

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String CREATE_DAILY = "create table if not exists Daily ("
            + "id integer primary key autoincrement, "
            + "cost_type varchar, "
            + "cost_date varchar, "
            + "cost_money varchar)";

    private Context mContext;

  /*  public DatabaseHelper(Context context) {
        super(context,"Daily",null,1);
        mContext = context;
    }*/

    public DatabaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
        mContext = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_DAILY);
        Toast.makeText(mContext, "Create succeed", Toast.LENGTH_SHORT).show();
    }

    public void insertCost(CostBean costBean) {
        SQLiteDatabase database = getWritableDatabase();
        ContentValues cv  = new ContentValues();
        cv.put("cost_type", costBean.getCostType());
        cv.put("cost_date", costBean.getCostDate());
        cv.put("cost_money", costBean.getcostMoney());
        database.insert("daily",null,cv);
        }
    public Cursor getAllCostData() {
        SQLiteDatabase database = getWritableDatabase();
        return  database.query("daily", null, null, null, null, null,"cost_date" + "ASC");
    }

    public void deleteAllData() {
        SQLiteDatabase database = getWritableDatabase();
        database.delete("daily",null,null);
    }
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
