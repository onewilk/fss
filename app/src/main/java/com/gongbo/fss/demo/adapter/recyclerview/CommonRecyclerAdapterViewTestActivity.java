package com.gongbo.fss.demo.adapter.recyclerview;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.gongbo.fss.adapter.recyclerview.CommonRecyclerAdapter;
import com.gongbo.fss.adapter.recyclerview.viewholder.CommonViewHolder;
import com.gongbo.fss.base.BaseFssActivity;
import com.gongbo.fss.bind.annotation.BindActivity;
import com.gongbo.fss.bind.annotation.BindView;
import com.gongbo.fss.demo.R;
import com.gongbo.fss.demo.adapter.ListDataModel;
import com.gongbo.fss.demo.base.BaseActivity;
import com.gongbo.fss.router.annotation.Route;

@Route(group = "recyclerView")
@BindActivity(value = R.layout.activity_recycler_view, finishViewId = R.id.img_back)
public class CommonRecyclerAdapterViewTestActivity extends BaseActivity {

    @BindView(R.id.recycler_view)
    private RecyclerView recyclerView;

    protected void initView() {
        recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
        recyclerView.setAdapter(new CommonRecyclerAdapter<String>(this, ListDataModel.getDatas(), R.layout.layout_list_item) {
            @Override
            public void onBindView(@NonNull CommonViewHolder holder, String s, int position) {
                super.onBindView(holder, s, position);
                holder.setText(R.id.tv_text, s);
            }
        });
    }
}
