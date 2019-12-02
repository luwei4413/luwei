package com.example.jxxy.mobileshop_luwei.fragment;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.ImageButton;

import com.example.jxxy.mobileshop_luwei.R;

import com.example.jxxy.mobileshop_luwei.common.BaseFragment;
public class NavigationFragment extends BaseFragment implements View.OnClickListener{
   private ImageButton mIBHome;
   private ImageButton mIBCategory;
   private ImageButton mIBCart;
   private ImageButton mIBPersonal;
   private HomeFragment homeFragment;
   private CartFragment cartFragment;
   private PersonalFragment personalFragment;
   private CategroyFragment categroyFragment;

    @Override
    public int getContentViewId() {
        return R.layout.fragment_navigation;
    }
    @Override
    protected void initView(View view){
        super.initView(view);
        mIBHome=view.findViewById(R.id.ib_home);
        mIBCategory=view.findViewById(R.id.ib_category);
        mIBCart=view.findViewById(R.id.ib_cart);
        mIBPersonal=view.findViewById(R.id.ib_personal);
        mIBPersonal.setOnClickListener(this);
        mIBCart.setOnClickListener(this);
        mIBCategory.setOnClickListener(this);
        mIBHome.setOnClickListener(this);
        select(mIBHome);
    }
    private void select(View v){
        mIBHome.setImageResource(R.drawable.tab_item_home_normal);
        mIBCategory.setImageResource(R.drawable.tab_item_category_normal);
        mIBCart.setImageResource(R.drawable.tab_item_cart_normal);
        mIBPersonal.setImageResource(R.drawable.tab_item_personal_normal);
        FragmentManager fragmentManager=getFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        if (homeFragment!=null){
            fragmentTransaction.hide(homeFragment);
        }
        if (cartFragment!=null){
            fragmentTransaction.hide(cartFragment);
        }
        if (categroyFragment!=null){
            fragmentTransaction.hide(categroyFragment);
        }
        if (personalFragment!=null){
            fragmentTransaction.hide(personalFragment);
        }
        switch (v.getId()){
            case R.id.ib_home:
                mIBHome.setImageResource(R.drawable.tab_item_home_focus);
                if (homeFragment==null){
                    homeFragment=new HomeFragment();
                    fragmentTransaction.add(R.id.f1_main_navigation,homeFragment);
                }else {
                    fragmentTransaction.show(homeFragment);
                }
                break;
            case R.id.ib_cart:
                mIBCart.setImageResource(R.drawable.tab_item_cart_focus);
                if (cartFragment==null){
                    cartFragment=new CartFragment();
                    fragmentTransaction.add(R.id.f1_main_navigation,cartFragment);
                }else {
                    fragmentTransaction.show(cartFragment);
                }
                break;
            case R.id.ib_category:
                mIBCategory.setImageResource(R.drawable.tab_item_category_focus);
                if (categroyFragment==null){
                    categroyFragment=new CategroyFragment();
                    fragmentTransaction.add(R.id.f1_main_navigation,categroyFragment);
                }else {
                    fragmentTransaction.show(categroyFragment);
                }
                break;
            case R.id.ib_personal:
                mIBPersonal.setImageResource(R.drawable.tab_item_personal_focus);
                if (personalFragment==null){
                    personalFragment=new PersonalFragment();
                    fragmentTransaction.add(R.id.f1_main_navigation,personalFragment);
                }else {
                    fragmentTransaction.show(personalFragment);
                }
                break;
        }
        fragmentTransaction.commit();
    }
    @Override
    public void onClick(View v) {
        select(v);
    }

}