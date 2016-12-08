package com.nefri.popmovie.popmovie.data.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Reviews
 * {Default file description, change this}
 * Copyright (c) 2016 GDP Labs. All rights reserved.
 *
 * @author nefri-suswita
 * @since Dec 08, 2016.
 */
public class Reviews {

    @SerializedName("results")
    private List<Review> reviews = new ArrayList<>();

    public List<Review> getReviews() {
        return reviews;
    }
}
