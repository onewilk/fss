package com.fss.demo.base;


import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.Keep;

/**
 * Created by Administrator on 2017/10/21.
 */

public class BaseBindingActivity<VB extends ViewDataBinding> extends BaseActivity {

    @Keep
    protected VB binding;

    @Override
    protected void setContentLayout(int layoutResID) {
        binding = DataBindingUtil.setContentView(this, layoutResID);
    }
}
