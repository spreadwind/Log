package com.wind.log;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.wind.log.bean.CostBean;
import com.wind.log.db.Daily;

import org.litepal.LitePal;
import org.litepal.crud.DataSupport;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */

public class MainActivity extends AppCompatActivity {
    private List<CostBean> mCostBeanList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mCostBeanList = new ArrayList<>();


        initCostData(); //初始化数据
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        CostListAdapter adapter = new CostListAdapter(mCostBeanList);
        recyclerView.setAdapter(adapter);

        //记一笔的点击事件 悬浮按钮
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab_add);
        fab.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                LitePal.getDatabase();          //创建数据库
                Intent intent = new Intent (MainActivity.this, AddCostActivity.class);
                startActivity(intent);
            }
        });
    }

    private void initCostData() {

        List<Daily> dailys = DataSupport.order("date desc").find(Daily.class);
        for (Daily daily : dailys) {

            CostBean costBean = new CostBean();
            /*costBean.costType = "ktqn";
            costBean.costDate = "95-10";
            costBean.costMoney = "88";*/
            costBean.costType = daily.getType();
            costBean.costDate = daily.getDate();
            costBean.costMoney = daily.getMoney();
            mCostBeanList.add(costBean);
        }
    }
}
