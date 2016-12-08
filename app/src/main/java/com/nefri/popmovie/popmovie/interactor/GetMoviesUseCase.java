package com.nefri.popmovie.popmovie.interactor;

import com.nefri.popmovie.popmovie.BuildConfig;
import com.nefri.popmovie.popmovie.ExecutorModule;
import com.nefri.popmovie.popmovie.data.model.Movies;
import com.nefri.popmovie.popmovie.parameter.MoviesParameter;
import com.nefri.popmovie.popmovie.service.MovieService;

import javax.inject.Inject;
import javax.inject.Named;

import rx.Observable;
import rx.Scheduler;

/**
 * GetMoviesUseCase
 *
 * @author nefri-suswita
 * @since Dec 08, 2016.
 */
public class GetMoviesUseCase extends UseCase<MoviesParameter, Movies>{

    private MovieService movieService;

    @Inject public GetMoviesUseCase(
        @Named(ExecutorModule.NAME_CONNECTION_SCHEDULER) Scheduler executionScheduler,
        @Named(ExecutorModule.NAME_UI_THREAD) Scheduler postExecutionScheduler,
        MovieService movieService) {
        super(executionScheduler, postExecutionScheduler);
        this.movieService = movieService;
    }

    @Override protected Observable<Movies> buildUseCaseObservable(MoviesParameter parameter) {
        return movieService.discoverMovies(
            parameter.getSortBy(), parameter.getPage(), BuildConfig.API_KEY);
    }
}
