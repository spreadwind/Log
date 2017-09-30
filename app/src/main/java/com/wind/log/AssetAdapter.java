package com.wind.log;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by H on 2017/9/24.
 */

public class AssetAdapter extends BaseRvAdapter<String> {

    public AssetAdapter(Context context, List<String> list, RvListener listener) {
        super(context, list, listener);
    }

    @Override
    protected BaseRvHolder getHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.asset_item, parent, false);
        return new AssetHolder(view, viewType, listener);
    }
}
