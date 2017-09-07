package com.wind.log;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by H on 2017/9/5.
 */

public class CostListAdapter extends RecyclerView.Adapter<CostListAdapter.ViewHolder> {

    private List<CostBean> mCostList;

    static class ViewHolder extends RecyclerView.ViewHolder {
//        ImageView imgCostView;
        TextView tvCostType;
        TextView tvCostDate;
        TextView tvCostMoney;

        public ViewHolder(View view) {
            super(view);
//            imgCostView = (ImageView) view.findViewById(R.id.img_cost_view);
            tvCostType = (TextView) view.findViewById(R.id.tv_cost_type);
            tvCostDate = (TextView) view.findViewById(R.id.tv_cost_date);
            tvCostMoney = (TextView) view.findViewById(R.id.tv_cost_money);
        }
    }

    public CostListAdapter(List<CostBean> costList) {
        mCostList = costList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_cost_item, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        CostBean costBean = mCostList.get(position);
//        holder.imgCostView.setImageResource(CostBean.getCostView());
        holder.tvCostType.setText(costBean.getCostType());
        holder.tvCostDate.setText(costBean.getCostDate());
        holder.tvCostMoney.setText(costBean.getcostMoney());

    }

    @Override
    public int getItemCount() {
        return mCostList.size();
    }


}
