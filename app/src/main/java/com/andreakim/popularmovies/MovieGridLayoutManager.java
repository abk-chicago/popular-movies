package com.andreakim.popularmovies;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MovieGridLayoutManager extends GridLayoutManager {
    int spanCount = 2;


    public MovieGridLayoutManager(Context context, int spanCount) {
        super(context, spanCount);
        this.spanCount = spanCount;
    }


}
