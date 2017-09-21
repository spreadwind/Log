package com.wind.log.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.wind.log.R;

//import com.wind.log.AddCostActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class BillFragment extends Fragment {


    public BillFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_bill, container, false);
    }

}

/*    private List<CostBean> mCostBeanList;

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
                Intent intent = new Intent (BillFragment.this, AddCostActivity.class);
                startActivity(intent);
            }
        });
    }

    private void initCostData() {

        List<Daily> dailys = DataSupport.order("date desc").find(Daily.class);
        for (Daily daily : dailys) {

            CostBean costBean = new CostBean();
            costBean.costType = "ktqn";
            costBean.costDate = "95-10";
            costBean.costMoney = "88";
            costBean.costType = daily.getType();
            costBean.costDate = daily.getDate();
            costBean.costMoney = daily.getMoney();
            mCostBeanList.add(costBean);
        }
    }*/

