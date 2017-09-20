package com.wind.log;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import com.wind.log.bean.CostBean;
import com.wind.log.db.Daily;

import java.util.List;

public class AddCostActivity extends AppCompatActivity {
    private List<CostBean> mCostBeanList;
//    private EditText mEditTextRemarks;
    private EditText mEdtType;
//    private TextView mTvType;
    private EditText mEdtMoney;
//    private Spinner mSpinerType;
    private DatePicker mCostDate;
    private Button mButtonAdd;
    private Button mButtonCancel;

//    private static final String[] types = {"衣服", "饮食", "房租水电", "交通", "娱乐", "生活用品", "其他"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_cost);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mEdtMoney = (EditText) this.findViewById(R.id.edt_cost_money);
        mEdtType = (EditText) this.findViewById(R.id.edt_cost_type);
        mCostDate = (DatePicker) this.findViewById(R.id.dp_cost_time);

//        mSpinerType = (Spinner) this.findViewById(R.id.sp_cost_type);
        Button mButtonSave = (Button) findViewById(R.id.btn_save);

        mButtonSave.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                addCostData();
                Toast.makeText(AddCostActivity.this, "数据保存成功", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent (AddCostActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
           }
        });
   /*     //点击类型文本，进入选择类型界面
      mTvType.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (AddCostActivity.this, SelectTypeActivity.class);
                startActivity(intent);
                finish();
            }
        });
*/
    }

    private void addCostData() {
        //往数据库添加数据
        Daily daily = new Daily();
        daily.setType(mEdtType.getText().toString());
        daily.setMoney(mEdtMoney.getText().toString());
        daily.setDate(mCostDate.getYear() + "-" + (mCostDate.getMonth() + 1) +
                "-" + mCostDate.getDayOfMonth());
        daily.save();
//        mCostBeanList.add(costBean);


    }


}
