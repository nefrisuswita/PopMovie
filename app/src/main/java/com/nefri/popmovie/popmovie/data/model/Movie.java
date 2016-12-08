package com.nefri.popmovie.popmovie.data.model;

import android.support.annotation.Nullable;

import com.google.gson.annotations.SerializedName;
import com.nefri.popmovie.popmovie.Constant;

/**
 * Movie
 * {Default file description, change this}
 * Copyright (c) 2016 GDP Labs. All rights reserved.
 *
 * @author nefri-suswita
 * @since Dec 08, 2016.
 */
public class Movie {

    @SerializedName("id")
    private long id;
    @SerializedName("original_title")
    private String title;
    @SerializedName("poster_path")
    private String poster;
    @SerializedName("overview")
    private String overview;
    @SerializedName("vote_average")
    private String userRating;
    @SerializedName("release_date")
    private String releasedate;
    @SerializedName("backdrop_path")
    private String backdrop;

    public long getId() {
        return id;
    }

    @Nullable
    public String getTitle() {
        return title;
    }

    @Nullable
    public String getPoster() {
        return Constant.IMAGE_PATH + poster;
    }

    @Nullable
    public String getOverview() {
        return overview;
    }

    @Nullable
    public String getUserRating() {
        return userRating;
    }

    public String getReleasedate() {
        return releasedate;
    }

    @Nullable
    public String getBackdrop() {
        return backdrop;
    }
}
