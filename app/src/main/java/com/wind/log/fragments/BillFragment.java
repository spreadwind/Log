package com.wind.log.fragments;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.wind.log.AddCostActivity;
import com.wind.log.CostListAdapter;
import com.wind.log.R;
import com.wind.log.bean.CostBean;
import com.wind.log.db.Daily;

import org.litepal.LitePal;
import org.litepal.crud.DataSupport;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class BillFragment extends BaseFragment {

    private List<CostBean> mCostBeanList = new ArrayList<>();

    public BillFragment() {
        // Required empty public constructor
    }

    @Override
    public View initView() {
        return View.inflate(mContext, R.layout.fragment_bill, null);
    }
    @Override
    public void initData() {

        initCostData(); //初始化数据
        RecyclerView recyclerView = (RecyclerView) (getActivity().findViewById(R.id.rv_cost));
        LinearLayoutManager layoutManager = new LinearLayoutManager(mContext);
        recyclerView.setLayoutManager(layoutManager);
        CostListAdapter adapter = new CostListAdapter(mCostBeanList);
        recyclerView.setAdapter(adapter);

        //记一笔的点击事件 悬浮按钮
        FloatingActionButton fab = (FloatingActionButton) (getActivity().findViewById(R.id.fab_add));
        fab.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                LitePal.getDatabase();          //创建数据库
                Intent intent = new Intent (mContext, AddCostActivity.class);
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

