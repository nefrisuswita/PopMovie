package com.nefri.popmovie.popmovie.data.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Movies
 *
 * @author nefri-suswita
 * @since Dec 08, 2016.
 */
public class Movies {

    @SerializedName("results")
    private List<Movie> movies = new ArrayList<>();

    public List<Movie> getMovies() {
        return movies;
    }
}
