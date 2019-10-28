package com.gongbo.fss.demo.runpriority

import com.gongbo.fss.base.BaseFssActivity
import com.gongbo.fss.bind.annotation.BindActivity
import com.gongbo.fss.demo.R
import com.gongbo.fss.router.annotation.Route
import com.gongbo.fss.runpriority.annotation.RunPriority
import com.gongbo.fss.runpriority.constant.Priority

import com.gongbo.fss.demo.util.ToastUtils.showToast

@Route
@BindActivity(layout = R.layout.activity_run_priority_test, finish = [R.id.img_back])
class RunPriorityTestActivity : BaseFssActivity() {

    private var time = 0

    //声明为高优先级，会优先调用
    @RunPriority(priority = Priority.HIGH)
    override fun initView() {
        super.initView()
        showToast("initView " + time++)
    }

    //声明为低优先级，会最后调用
    @RunPriority(priority = Priority.LOW)
    override fun initData() {
        super.initData()
        showToast("initData " + time++)
    }

    //声明为普通优先级，这也是默认的优先级，因此也可以不写
    //@RunPriority(priority = Priority.NORMAL)
    override fun initListener() {
        super.initListener()
        showToast("initListener " + time++)
    }
}
