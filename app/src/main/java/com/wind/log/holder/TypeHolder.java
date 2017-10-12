package com.wind.log.holder;

import android.view.View;
import android.widget.TextView;

import com.wind.log.R;
import com.wind.log.RvListener;

/**
 * Created by H on 2017/9/30.
 */

public class TypeHolder extends BaseRvHolder<String> {
    private TextView txtType;

    public TypeHolder(View itemView, int type, RvListener listener) {
        super(itemView, type, listener);
        txtType = (TextView) itemView.findViewById(R.id.txt_type);
    }

    @Override
    public void bindHolder(String s, int position) {
        txtType.setText(s);
    }

}
