package com.fss.adapter.listview;

import android.content.Context;
import android.databinding.ViewDataBinding;


import com.fss.common.kotlin.Pair;

import java.util.List;


/**
 * Created by gongbo on 2018/5/21.
 * 列表视图适配器
 */
public class BaseBindingAdapter<M> extends BaseBindingSingleAdapter<M, ViewDataBinding> {

    public BaseBindingAdapter(Context context, List<M> datas, int bindingId) {
        super(context, datas, bindingId);
    }

    public BaseBindingAdapter(Context context, List<M> datas, int bindingId, int layoutId) {
        super(context, datas, bindingId, layoutId);
    }

    public BaseBindingAdapter(Context context, List<M> datas, int bindingId, Pair<Integer, Integer>... layoutIds) {
        super(context, datas, bindingId, layoutIds);
    }
}
