package com.example.jxxy.mobileshop_luwei.activity;

import android.support.annotation.LayoutRes;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import com.example.jxxy.mobileshop_luwei.R;

import com.example.jxxy.mobileshop_luwei.common.BaseActivity;
import com.example.jxxy.mobileshop_luwei.fragment.NavigationFragment;

public class MainActivity extends BaseActivity {
   @Override
   public  @LayoutRes
   int getContentViewId(){
       return R.layout.activity_main;
   }

    @Override
    protected void initView() {
        super.initView();
        FragmentManager manager=getSupportFragmentManager();
        FragmentTransaction transaction=manager.beginTransaction();
        transaction.replace(R.id.f1_main,new NavigationFragment());
        transaction.commit();
    }
}
