package com.example.the_spring_cinema.services;

import com.example.the_spring_cinema.models.Movie;
import com.example.the_spring_cinema.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    MovieRepository movieRepository;

//    this is where the logic will sit
    private Movie movie;
    private List<Movie> movielist;

    public MovieService(){

    }

//    METHODS:
//    1. get/read a movie: we want to retrieve the movie id, title,
//    rating and duration
    public List<Movie> getNewMovie(){
       return movieRepository.findAll();
    }

//    2. get/read a movie by its id: so we need to pass an ID and retrieve
//    the movie title, rating and duration
//    but the database may only have a certain numbers of movies
//    so the logic will need check how many movies there are as well?
    public Optional<Movie> getMovieById(int id){
        return movieRepository.findById(id);
    }

//    3. we want to Post/create a new movie
//    then we want to add to our list of movies
    public Movie newMovie(){
        movie = new Movie("Iron Man", "12A");
        return movie;
    }



//    GETTERS AND SETTERS

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public List<Movie> getMovielist() {
        return movielist;
    }

    public void setMovieList(List<Movie> movielist) {
        this.movielist = movielist;
    }
}
