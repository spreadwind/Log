package com.wind.log.fragments;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 */
public abstract class BaseFragment extends Fragment {
    public Context mContext;

    public BaseFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        //获取上下文操作
        mContext = getActivity();
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View currentView = initView();
        return currentView;
    }

    @Override
    public void onActivityCreated(Bundle saveInstanceState) {
        initData(); // 初始化数据
        super.onActivityCreated(saveInstanceState);
    }
    /**
     * 抽象方法，子类调用
     */

    public abstract View initView();
    public abstract void initData();
}
