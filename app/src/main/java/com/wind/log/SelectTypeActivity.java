package com.wind.log;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.wind.log.adapter.TypeAdapter;

import java.util.Arrays;
import java.util.List;

public class SelectTypeActivity extends AppCompatActivity {
    private RecyclerView rvType;
    private TextView txtSelectType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_type);
        rvType = (RecyclerView) findViewById(R.id.rv_left);
        txtSelectType = (TextView) findViewById(R.id.txt_type);
        initData();

    }

    private void initData() {
        final String[] type = getResources().getStringArray(R.array.demo);
        final List<String> list = Arrays.asList(type);

        TypeAdapter typeAdapter = new TypeAdapter(this, list, new RvListener() {
            @Override
            public void onItemClick(int id, int position) {
                Intent intent = new Intent();
                String type = list.get(position);
                intent.putExtra("type_return", type);
                setResult(RESULT_OK, intent);
                finish();
            }
        });
        rvType.setLayoutManager(new LinearLayoutManager(this));
        rvType.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        rvType.setAdapter(typeAdapter);
    }

}
