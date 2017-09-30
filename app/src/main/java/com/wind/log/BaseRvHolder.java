package com.wind.log;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by H on 2017/9/17.
 */

public abstract class BaseRvHolder<T> extends RecyclerView.ViewHolder {
    private RvListener mListener;

    public BaseRvHolder(View itemView, int type, RvListener listener) {
        super(itemView);
        this.mListener = listener;
        itemView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                mListener.onItemClick(v.getId(), getAdapterPosition());
            }
        });
    }
    public abstract void bindHolder(T t, int position);

}
