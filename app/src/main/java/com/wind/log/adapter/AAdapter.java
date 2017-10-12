package com.wind.log.adapter;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.wind.log.R;
import com.wind.log.bean.AssetBean;

import java.util.List;

/**
 * Created by H on 2017/9/5.
 * 此为不用基类时的适配器
 */

public class AAdapter extends RecyclerView.Adapter<AAdapter.ViewHolder> {

    private List<AssetBean> mAssetBeanList;

    static class ViewHolder extends RecyclerView.ViewHolder {
        CardView cvAsset;
        TextView tvCard;
        TextView tvInfo;
        TextView tvMoney;

        public ViewHolder(View view) {
            super(view);
            cvAsset = (CardView) view.findViewById(R.id.cardview_asset);
            tvCard = (TextView) view.findViewById(R.id.tv_card);
            tvInfo = (TextView) view.findViewById(R.id.tv_note);
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
        final ViewHolder holder = new ViewHolder(view);

        holder.cvAsset.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                int position = holder.getAdapterPosition();
                AssetBean assetBean = mAssetBeanList.get(position);
                Toast.makeText(v.getContext(), "hello"+ assetBean.getMoney(), Toast.LENGTH_SHORT).show();
            }
        });
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        AssetBean assetBean = mAssetBeanList.get(position);
        holder.tvCard.setText(assetBean.getName());
        holder.tvInfo.setText(assetBean.getNote());
        holder.tvMoney.setText(assetBean.getMoney());
    }

    @Override
    public int getItemCount() {
        return mAssetBeanList.size();
    }

}
