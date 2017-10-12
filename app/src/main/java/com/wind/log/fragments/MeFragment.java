package com.wind.log.fragments;


import android.support.v4.app.Fragment;
import android.view.View;

import com.wind.log.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MeFragment extends BaseFragment {


    public MeFragment() {
        // Required empty public constructor
    }


    @Override
    public View initView() {
        return View.inflate(mContext, R.layout.fragment_me, null);
    }

    @Override
    public void initData() {

    }

}
