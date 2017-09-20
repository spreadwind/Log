package com.wind.log;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.wind.log.bean.CostBean;

import java.util.List;

/**
 * Created by H on 2017/9/5.
 */

public class CostListAdapter extends RecyclerView.Adapter<CostListAdapter.ViewHolder> {

    private List<CostBean> mCostBeanList;

    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvCostType;
        TextView tvCostDate;
        TextView tvCostMoney;

        public ViewHolder(View view) {
            super(view);
            tvCostType = (TextView) view.findViewById(R.id.tv_cost_type);
            tvCostDate = (TextView) view.findViewById(R.id.tv_cost_date);
            tvCostMoney = (TextView) view.findViewById(R.id.tv_cost_money);
        }
    }

    public CostListAdapter(List<CostBean> costList) {
        mCostBeanList = costList;
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
        CostBean costBean = mCostBeanList.get(position);
        holder.tvCostType.setText(costBean.getCostType());
        holder.tvCostDate.setText(costBean.getCostDate());
        holder.tvCostMoney.setText(costBean.getCostMoney());

    }

    @Override
    public int getItemCount() {
        return mCostBeanList.size();
    }


}
