package com.wind.log;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */

public class MainActivity extends AppCompatActivity {
    private List<CostBean> mCostBeanList;
    private DatabaseHelper mDatabaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mCostBeanList = new ArrayList<>();
        mDatabaseHelper = new DatabaseHelper(this, "DailyStore.db", null, 1);

        //记一笔的点击事件 悬浮按钮
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab_add);
        fab.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                mDatabaseHelper.getWritableDatabase();
                /*Intent intent = new Intent (MainActivity.this, AddCostActivity.class);
                startActivity(intent);*/
            }
        });

        initCostData(); //初始化数据
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        CostListAdapter adapter = new CostListAdapter(mCostBeanList);
        recyclerView.setAdapter(adapter);
    }

    private void initCostData() {
        mDatabaseHelper.deleteAllData();
        for (int i = 0; i < 6; i++) {
            CostBean costBean = new CostBean(i+"吃饭", "11-11", "20");
            mCostBeanList.add(costBean);
//            mDatabaseHelper.insertCost(costBean);
        }

       /* Cursor cursor = mDatabaseHelper.getAllCostData();
        if (cursor == null) {
            while (cursor.moveToNext()) {
                CostBean costBean = new CostBean();
                costBean.costType = cursor.getString(cursor.getColumnIndex("cost_type"));
                costBean.costDate = cursor.getString(cursor.getColumnIndex("cost_date"));
                costBean.costMoney = cursor.getString(cursor.getColumnIndex("cost_money"));
                mCostBeanList.add(costBean);
            }
            cursor.close();
        }*/

    }
}
