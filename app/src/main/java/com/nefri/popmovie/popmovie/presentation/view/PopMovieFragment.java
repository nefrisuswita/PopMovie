package com.nefri.popmovie.popmovie.presentation.view;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nefri.popmovie.popmovie.R;
import com.nefri.popmovie.popmovie.presentation.OnMovieClickListener;
import com.nefri.popmovie.popmovie.presentation.adapter.MoviesAdapter;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * PopMovieFragment
 *
 * @author nefri-suswita
 * @since Dec 09, 2016.
 */
public class PopMovieFragment extends Fragment {

    @Bind(R.id.list_movies) RecyclerView listMovies;

    private MoviesAdapter moviesAdapter;

    @Nullable @Override public View onCreateView(LayoutInflater inflater, ViewGroup container,
        Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_popmovie_main, container, false);
        ButterKnife.bind(this, view);

        setupRecyclerView();
        return view;
    }

    private void setupRecyclerView() {
        moviesAdapter = new MoviesAdapter(this, getActivity(), new MovieClickListener());
        listMovies.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        listMovies.setAdapter(moviesAdapter);
    }

    private class MovieClickListener implements OnMovieClickListener {

        @Override public void onMovieClick(View view, long movieId) {

        }

        @Override public void onFavMovieClick(View view, long movieId) {

        }
    }
}
