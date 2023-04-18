package com.example.the_spring_cinema.services;

import com.example.the_spring_cinema.models.Movie;
import com.example.the_spring_cinema.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    MovieRepository movieRepository;

//    this is where the logic will sit
    private Movie movie;
    private List<String> movielist;

    public MovieService(){

    }

//    METHODS:
//    1. get/read a movie: we want to retrieve the movie id, title,
//    rating and duration
    public Movie getNewMovie(){

    }

//    2. get/read a movie by its id: so we need to pass an ID and retrieve
//    the movie title, rating and duration
//    but the database may only have a certain numbers of movies
//    so the logic will need check how many movies there are as well?
    public Movie getMovieById(){


    }

//    3. we want to Post/create a new movie
//    then we want to add to our list of movies
    public Movie newMovie(){

    }



//    GETTERS AND SETTERS

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public List<String> getMovielist() {
        return movielist;
    }

    public void setMovielist(List<String> movielist) {
        this.movielist = movielist;
    }
}
