package com.andreakim.popularmovies;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MovieDetails {

    @SerializedName("page")
    @Expose
    public Integer page;
    @SerializedName("total_results")
    @Expose
    public Integer totalResults;
    @SerializedName("total_pages")
    @Expose
    public Integer totalPages;
    @SerializedName("results")
    @Expose
    public List<MoviesResult.Result> results = null;

    public MovieDetails withPage(Integer page) {
        this.page = page;
        return this;
    }

    public MovieDetails withTotalResults(Integer totalResults) {
        this.totalResults = totalResults;
        return this;
    }

    public MovieDetails withTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }

    public MovieDetails withResults(List<MoviesResult.Result> results) {
        this.results = results;
        return this;
    }

}

