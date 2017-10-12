package com.wind.log.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.wind.log.holder.BaseRvHolder;
import com.wind.log.RvListener;

import java.util.List;

/**
 * Created by H on 2017/9/17.
 */

public abstract class BaseRvAdapter<T> extends RecyclerView.Adapter<BaseRvHolder> {
    protected List<T> list;
    protected Context mContext;
    protected RvListener listener;
    protected LayoutInflater mInflater;

    public  BaseRvAdapter(Context context, List<T> list, RvListener listener) {
        mContext = context;
        mInflater = LayoutInflater.from(context);
        this.list = list;
        this.listener = listener;
    }

    @Override
    public BaseRvHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return getHolder(parent, viewType);
    }

    @Override
    public void onBindViewHolder(BaseRvHolder holder, int position) {
        holder.bindHolder(list.get(position), position);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    @Override
    public int getItemViewType(int position) {
        return 0;
    }

    void addItem(String data, int positon) {}

    void removeItem(String data) {}

    protected abstract BaseRvHolder getHolder(ViewGroup parent, int viewType);

}
