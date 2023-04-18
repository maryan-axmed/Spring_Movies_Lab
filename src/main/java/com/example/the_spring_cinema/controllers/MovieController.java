package com.example.the_spring_cinema.controllers;

import com.example.the_spring_cinema.models.Movie;
import com.example.the_spring_cinema.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping(value = "/movies")
public class MovieController {

    @Autowired
    MovieService movieService;

//    GET request for /movies
    @GetMapping
    public ResponseEntity<List<Movie>> getMovie(){
//        reference to MovieService as that is where the logic is
        List<Movie> movies = movieService.getNewMovie();
        return new ResponseEntity<>(movies, HttpStatus.OK);
    }

//    GET request for /movies/{id}
//    logic is that if the id is present and the move can be found
//    then the movie will be returned
//    if not, then a NOT_FOUND error will be thrown.
    @GetMapping(value = "/{id}")
    public ResponseEntity<Movie> getMovieById(@PathVariable int id){
        Optional<Movie> movie = movieService.getMovieById(id);
        if(movie.isPresent()) {
            return new ResponseEntity<>(movie.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }

//    POST request for /movies
    @PostMapping
    public ResponseEntity<Movie> newMovie(){
        Movie movie = movieService.newMovie();
        return new ResponseEntity<>(movie, HttpStatus.OK);
    }

}
