package com.wind.log.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.wind.log.R;
import com.wind.log.bean.CostBean;

import java.util.List;

/**
 * Created by H on 2017/9/5.
 */

public class CostListAdapter extends RecyclerView.Adapter<CostListAdapter.ViewHolder> {

    private List<CostBean> mCostBeanList;

    static class ViewHolder extends RecyclerView.ViewHolder {
        RelativeLayout rlBill;
        TextView txtCostType;
        TextView txtCostNote;
        TextView txtCostMoney;
        TextView txtCostDate;


        public ViewHolder(View view) {
            super(view);
            rlBill = (RelativeLayout) view.findViewById(R.id.rl_bill) ;
            txtCostType = (TextView) view.findViewById(R.id.txt_cost_type);
            txtCostNote = (TextView) view.findViewById(R.id.txt_cost_note);
            txtCostMoney = (TextView) view.findViewById(R.id.txt_cost_money);
            txtCostDate = (TextView) view.findViewById(R.id.txt_cost_date);
        }
    }

    public CostListAdapter(List<CostBean> costList) {
        mCostBeanList = costList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cost_item, parent, false);
        final ViewHolder holder = new ViewHolder(view);
        holder.rlBill.setOnClickListener(new View.OnClickListener() {
              @Override
                  public void onClick(View v) {
                      int position = holder.getAdapterPosition();
                      CostBean costBean = mCostBeanList.get(position);
                  Toast.makeText(v.getContext(), "you click"+ costBean.getMoney(), Toast.LENGTH_SHORT).show();
                  /*Intent intent = new Intent (v.getContext(), AddCostActivity.class);
                  startActivity(intent);*/
                  }
        });

        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        CostBean costBean = mCostBeanList.get(position);
        holder.txtCostType.setText(costBean.getType());
        holder.txtCostNote.setText(costBean.getNote());
        holder.txtCostMoney.setText(costBean.getMoney());
        holder.txtCostDate.setText(costBean.getDate());
//        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return mCostBeanList.size();
    }

}
