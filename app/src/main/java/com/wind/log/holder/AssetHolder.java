package com.wind.log.holder;

import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;

import com.wind.log.R;
import com.wind.log.RvListener;

/**
 * Created by H on 2017/9/24.
 */

public class AssetHolder extends BaseRvHolder<String> {

    private CardView cardView;
    private TextView tvCard;
    private TextView tvMoney;
    private TextView tvNote;

    public AssetHolder(View itemView, int type, RvListener listener) {
        super(itemView, type, listener);
        cardView = (CardView) itemView;
        tvCard = (TextView) itemView.findViewById(R.id.tv_card);
        tvNote = (TextView) itemView.findViewById(R.id.tv_note);
        tvMoney = (TextView) itemView.findViewById(R.id.tv_money);
    }
    @Override
    public void bindHolder(String s, int position) {
        tvCard.setText(s);
        tvNote.setText(s);
        tvMoney.setText(s);
        
    }

}
