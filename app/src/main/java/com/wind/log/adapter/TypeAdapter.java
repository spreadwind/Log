package com.wind.log.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import com.wind.log.R;
import com.wind.log.RvListener;
import com.wind.log.holder.BaseRvHolder;
import com.wind.log.holder.TypeHolder;

import java.util.List;

/**
 * Created by H on 2017/9/30.
 */

public class TypeAdapter extends BaseRvAdapter<String> {
    public TypeAdapter(Context context, List<String> list, RvListener listener) {
        super(context, list, listener);
    }

    @Override
    protected BaseRvHolder getHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.type_item, parent, false);
        return new TypeHolder(view, viewType, listener);
    }


}
