package com.wind.log;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.wind.log.CostBean;
import com.wind.log.CostListAdapter;
import com.wind.log.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<CostBean> costList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initCostData(); //初始化数据
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        CostListAdapter adapter = new CostListAdapter(costList);
        recyclerView.setAdapter(adapter);
    }

    private void initCostData() {
//        CostBean costBean = new CostBean();
        for (int i = 0; i < 6; i++) {
            CostBean clock = new CostBean("吃饭", "11-11", "20");
            costList.add(clock);
            CostBean clockq = new CostBean("睡觉", "11-12", "2000");
            costList.add(clockq);



        }
    }
}
