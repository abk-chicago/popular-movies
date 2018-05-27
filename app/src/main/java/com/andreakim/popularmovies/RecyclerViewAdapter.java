package com.andreakim.popularmovies;

import android.content.Context;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ImageView;

import java.util.List;
import java.util.Objects;


public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.GridViewHolder>{

    private int mNumberItems;

    public RecyclerViewAdapter(int numberOfItems) {
        mNumberItems = numberOfItems;
    }

    @NonNull
    @Override
    public RecyclerViewAdapter.GridViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        Context context = viewGroup.getContext();
        int layoutIDforGridItem = R.layout.recycler_view_item;
        LayoutInflater inflater = LayoutInflater.from(context);
        boolean shouldAttachToParentImmediately = false;

        View view = inflater.inflate(layoutIDforGridItem,viewGroup,false);
        GridViewHolder viewHolder = new GridViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.GridViewHolder holder, int position) {
        holder.bind(position);
    }

    @Override
    public int getItemCount() {
        return mNumberItems;
    }


    class GridViewHolder extends RecyclerView.ViewHolder {
        ImageView gridItemView;

        public GridViewHolder(View itemView) {
            super(itemView);
            gridItemView = (ImageView) itemView.findViewById(R.id.poster_imageView);
        }

        void bind(int listIndex) {

            //TODO: bind view to image;
        }
    }
}
