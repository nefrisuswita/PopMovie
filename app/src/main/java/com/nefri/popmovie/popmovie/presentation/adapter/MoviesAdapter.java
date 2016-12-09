package com.nefri.popmovie.popmovie.presentation.adapter;

import android.app.Fragment;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.nefri.popmovie.popmovie.presentation.OnMovieClickListener;

/**
 * MoviesAdapter
 *
 * @author nefri-suswita
 * @since Dec 09, 2016.
 */
public class MoviesAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context context;
    private Fragment fragment;
    private OnMovieClickListener onMovieClickListener;

    public MoviesAdapter(
        Fragment fragment, Context context, OnMovieClickListener onMovieClickListener) {
        this.context = context;
        this.fragment = fragment;
        this.onMovieClickListener = onMovieClickListener;
    }

    @Override public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override public int getItemCount() {
        return 0;
    }
}
