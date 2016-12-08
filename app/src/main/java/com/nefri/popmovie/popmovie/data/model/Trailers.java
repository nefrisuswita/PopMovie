package com.nefri.popmovie.popmovie.data.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Trailers
 *
 * @author nefri-suswita
 * @since Dec 08, 2016.
 */
public class Trailers {

    @SerializedName("results")
    private List<Trailer> trailers = new ArrayList<>();

    public List<Trailer> getTrailers() {
        return trailers;
    }
}
