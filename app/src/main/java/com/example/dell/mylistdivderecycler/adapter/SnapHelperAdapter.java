package com.example.dell.mylistdivderecycler.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.dell.mylistdivderecycler.R;

import java.util.ArrayList;

/**
 * Created by DELL on 2017/10/20.
 */

public class SnapHelperAdapter extends RecyclerView.Adapter {

    private ArrayList mData;
    private Context mContext;
    private final LayoutInflater mInflater;

    public SnapHelperAdapter(ArrayList mData, Context mContext) {
        this.mData = mData;
        this.mContext = mContext;
        mInflater = LayoutInflater.from(mContext);
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.item_shap, parent, false);
        return new SapHelpViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        String vo = (String) mData.get(position);
        SapHelpViewHolder helper = (SapHelpViewHolder) holder;
        helper.mTvTag.setText(vo);

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class SapHelpViewHolder extends RecyclerView.ViewHolder {
        public TextView mTvTag;

        public SapHelpViewHolder(View itemView) {
            super(itemView);
            this.mTvTag = (TextView) itemView.findViewById(R.id.tv_tag);
        }
    }
}
