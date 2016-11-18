package com.bijendra.materialdesignstyle.materialdesignstyle;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

/**
 * Created by Newdream on 18-Nov-16.
 */

public class ContentAdapter extends RecyclerView.Adapter<ContentAdapter.ViewHolder>{

    // Set numbers of List in RecyclerView.
    private static final int LENGTH = 28;

    public ContentAdapter()
    {

    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()),parent);
       // return null;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // no-op
        if(position==(LENGTH-1))
            Toast.makeText(holder.itemView.getContext(),"Fetch more elements",Toast.LENGTH_LONG).show();

    }

    @Override
    public int getItemCount() {
        return LENGTH;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
    public ViewHolder(LayoutInflater inflater, ViewGroup parent) {
        super(inflater.inflate(R.layout.item_tile, parent, false));
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = v.getContext();
                Intent intent = new Intent(context, DetailActivity.class);
                context.startActivity(intent);
            }
        });
    }
}
}
