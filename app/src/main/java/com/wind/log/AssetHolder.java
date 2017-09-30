package com.wind.log;

import android.view.View;
import android.widget.TextView;

/**
 * Created by H on 2017/9/24.
 */

public class AssetHolder extends BaseRvHolder<String> {

    private TextView tvCard;
    private TextView tvMoney;
    private TextView tvInfo;

    public AssetHolder(View itemView, int type, RvListener listener) {
        super(itemView, type, listener);
        tvCard = (TextView) itemView.findViewById(R.id.tv_card);
        tvInfo = (TextView) itemView.findViewById(R.id.tv_info);

        tvMoney = (TextView) itemView.findViewById(R.id.tv_money);
    }
    @Override
    public void bindHolder(String s, int position) {
        tvCard.setText(s);
        tvInfo.setText(s);
        tvMoney.setText(s);
    }

}
