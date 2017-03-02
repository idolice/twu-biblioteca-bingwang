package com.twu.biblioteca;

/**
 * Created by bingwang on 3/2/17.
 */
public class MovieInfo {
    private int quantity;
    private Movie movie;

    public MovieInfo(int quantity, Movie movie) {
        this.quantity = quantity;
        this.movie = movie;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }
}
