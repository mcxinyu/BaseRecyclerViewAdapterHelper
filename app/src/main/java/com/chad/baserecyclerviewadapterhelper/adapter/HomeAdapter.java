package com.chad.baserecyclerviewadapterhelper.adapter;

import android.support.annotation.NonNull;

import com.chad.baserecyclerviewadapterhelper.R;
import com.chad.baserecyclerviewadapterhelper.entity.HomeItem;
import com.chad.library.adapter.v2.base.BaseQuickAdapter;
import com.chad.library.adapter.v2.base.BaseViewHolder;

import java.util.List;

/**
 * https://github.com/CymChad/BaseRecyclerViewAdapterHelper
 */
public class HomeAdapter extends BaseQuickAdapter<HomeItem, BaseViewHolder> {
    public HomeAdapter(int layoutResId, List data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(@NonNull BaseViewHolder helper, HomeItem item) {
        helper.setText(R.id.text, item.getTitle());
        helper.setImageResource(R.id.icon, item.getImageResource());
    }
}
