package com.wind.log;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.wind.log.bean.AssetBean;

import java.util.List;

/**
 * Created by H on 2017/9/5.
 */

public class AAdapter extends RecyclerView.Adapter<AAdapter.ViewHolder> {

    private List<AssetBean> mAssetBeanList;

    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvCard;
        TextView tvInfo;
        TextView tvMoney;

        public ViewHolder(View view) {
            super(view);
            tvCard = (TextView) view.findViewById(R.id.tv_card);
            tvInfo = (TextView) view.findViewById(R.id.tv_info);
            tvMoney = (TextView) view.findViewById(R.id.tv_money);
        }
    }

    public AAdapter(List<AssetBean> assetList) {
        mAssetBeanList = assetList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.asset_item, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        AssetBean assetBean = mAssetBeanList.get(position);
        holder.tvCard.setText(assetBean.getName());
        holder.tvInfo.setText(assetBean.getInfo());
        holder.tvMoney.setText(assetBean.getMoney());
    }

    @Override
    public int getItemCount() {
        return mAssetBeanList.size();
    }

}
