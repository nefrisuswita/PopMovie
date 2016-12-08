package com.nefri.popmovie.popmovie.data.model;

import com.google.gson.annotations.SerializedName;

/**
 * Review
 * {Default file description, change this}
 * Copyright (c) 2016 GDP Labs. All rights reserved.
 *
 * @author nefri-suswita
 * @since Dec 08, 2016.
 */
public class Review {

    @SerializedName("id")
    private String id;
    @SerializedName("author")
    private String author;
    @SerializedName("content")
    private String content;
    @SerializedName("url")
    private String url;

    public String getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }

    public String getUrl() {
        return url;
    }
}
