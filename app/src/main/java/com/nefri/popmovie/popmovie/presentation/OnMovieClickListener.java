package com.nefri.popmovie.popmovie.presentation;

import android.view.View;

/**
 * OnMovieClickListener
 *
 * @author nefri-suswita
 * @since Dec 09, 2016.
 */
public interface OnMovieClickListener {

    void onMovieClick(View view, long movieId);

    void onFavMovieClick(View view, long movieId);
}
