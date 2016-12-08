package com.nefri.popmovie.popmovie.parameter;

/**
 * MoviesParameter
 * Copyright (c) 2016 GDP Labs. All rights reserved.
 *
 * @author nefri-suswita
 * @since Dec 08, 2016.
 */
public class MoviesParameter {

    private String sortBy;
    private int page;

    public MoviesParameter(String sortBy, int page) {
        this.sortBy = sortBy;
        this.page = page;
    }

    public String getSortBy() {
        return sortBy;
    }

    public int getPage() {
        return page;
    }
}
