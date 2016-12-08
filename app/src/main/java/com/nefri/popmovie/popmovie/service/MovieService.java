package com.nefri.popmovie.popmovie.service;

import com.nefri.popmovie.popmovie.data.model.Movies;
import com.nefri.popmovie.popmovie.data.model.Reviews;
import com.nefri.popmovie.popmovie.data.model.Trailers;

import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;

/**
 * MovieService
 *
 * @author nefri-suswita
 * @since Dec 08, 2016.
 */
public interface MovieService {

    @GET("3/movie/{sort_by}")
    Observable<Movies> discoverMovies(@Path("sort_by") String sortBy,
        @Query("page") int page, @Query("api_key") String apiKey);

    @GET("3/movie/{id}/videos")
    Observable<Trailers> findTrailersById(
        @Path("id") long movieId, @Query("api_key") String apiKey);

    @GET("3/movie/{id}/reviews")
    Observable<Reviews> findReviewsById(@Path("id") long movieId, @Query("api_key") String apiKey);
}
