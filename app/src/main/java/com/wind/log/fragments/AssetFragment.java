package com.wind.log.fragments;


import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.wind.log.R;
import com.wind.log.adapter.AAdapter;
import com.wind.log.bean.AssetBean;
import com.wind.log.db.Daily;

import org.litepal.crud.DataSupport;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.sset
 */
public class AssetFragment extends BaseFragment {
    private List<AssetBean> mAssetBeanList = new ArrayList<>();

    public AssetFragment() {
        // Required empty public constructor
    }

    @Override
    public View initView() {
        return View.inflate(mContext, R.layout.fragment_asset, null);
    }
    @Override
    public void initData() {

        initAssetData(); //初始化数据
        RecyclerView rvAsset = (RecyclerView) (getActivity().findViewById(R.id.rv_asset));
        LinearLayoutManager layoutManager = new LinearLayoutManager(mContext);
        rvAsset.setLayoutManager(layoutManager);
        AAdapter adapter = new AAdapter(mAssetBeanList) ;
//        rvAsset.addItemDecoration(new DividerItemDecoration(mContext, DividerItemDecoration.VERTICAL));
        rvAsset.setAdapter(adapter);
    }

    private void initAssetData() {

        List<Daily> dailys = DataSupport.order("date desc").find(Daily.class);
//        for (Daily daily : dailys) {
        for (int j=0; j<20; j++) {

            AssetBean assetBean = new AssetBean(R.drawable.icon_add ,"银行卡","余额为：", "6666");
            AssetBean assetBean2 = new AssetBean(R.drawable.icon_add ,"现金","余额为：", "8888");
            AssetBean assetBean3 = new AssetBean(R.drawable.icon_add ,"借出","别人欠我的钱", "1500");

          /*  assetBean.assetType = daily.getType();
            assetBean.setName = daily.getDate();
            assetBean.money = daily.getMoney();*/
            mAssetBeanList.add(assetBean);
            mAssetBeanList.add(assetBean2);
            mAssetBeanList.add(assetBean3);
        }
    }
}
