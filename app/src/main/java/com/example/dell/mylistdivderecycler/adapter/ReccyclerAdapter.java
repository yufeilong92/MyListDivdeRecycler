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
 * Created by DELL on 2017/10/16.
 */

public class ReccyclerAdapter extends RecyclerView.Adapter {

    private ArrayList<?> mData;
    private Context mContext;
    private final LayoutInflater mInflater;

    public ReccyclerAdapter(ArrayList<?> mData, Context mContext) {
        this.mData = mData;
        this.mContext = mContext;
        mInflater = LayoutInflater.from(mContext);
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = mInflater.inflate(R.layout.item_recycerview, parent,false);
        RecyclerHolder hollder = new RecyclerHolder(view);
        return hollder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        RecyclerHolder holder1 = (RecyclerHolder) holder;
        holder1.mTvContent.setText((CharSequence) mData.get(position));
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class RecyclerHolder extends RecyclerView.ViewHolder {
        public TextView mTvContent;

        public RecyclerHolder(View itemView) {
            super(itemView);
            this.mTvContent = (TextView) itemView.findViewById(R.id.tv_content);
        }
    }

}
