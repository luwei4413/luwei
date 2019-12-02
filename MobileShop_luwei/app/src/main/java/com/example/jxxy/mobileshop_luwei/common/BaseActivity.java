package com.example.jxxy.mobileshop_luwei.common;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import butterknife.ButterKnife;
public abstract class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(getContentViewId());
        ButterKnife.bind(this);
        initData();
        initView();
    }

    protected void initData(){

    }
    protected void initView(){

    }
    public abstract  int getContentViewId();
    public void toastshort(String msg){
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();
    }
    public void toastlong(String msg){
        Toast.makeText(this,msg,Toast.LENGTH_LONG).show();
    }
}
