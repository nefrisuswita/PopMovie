package com.nefri.popmovie.popmovie.data.model;

import com.google.gson.annotations.SerializedName;

/**
 * Trailer
 * {Default file description, change this}
 * Copyright (c) 2016 GDP Labs. All rights reserved.
 *
 * @author nefri-suswita
 * @since Dec 08, 2016.
 */
public class Trailer {

    @SerializedName("id")
    private String id;
    @SerializedName("key")
    private String key;
    @SerializedName("name")
    private String name;
    @SerializedName("site")
    private String site;
    @SerializedName("size")
    private String size;

    public String getId() {
        return id;
    }

    public String getKey() {
        return key;
    }

    public String getName() {
        return name;
    }

    public String getSite() {
        return site;
    }

    public String getSize() {
        return size;
    }
}
