package com.example.the_spring_cinema.controllers;

import com.example.the_spring_cinema.models.Movie;
import com.example.the_spring_cinema.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(value = "/movies")
public class MovieController {

    @Autowired
    MovieService movieService;

//    GET request for /movies
    @GetMapping
    public ResponseEntity<Movie> getMovie(){
//        reference to MovieService as that is where the logic is
        Movie movie = movieService.getNewMovie();
        return new ResponseEntity<>(movie, HttpStatus.OK);
    }

//    GET request for /movies/{id}
    @GetMapping(value = "/{id}")
    public ResponseEntity<Movie> getMovieById(){

    }

//    POST request for /movies/{id}
    @PostMapping
    public ResponseEntity<Movie> newMovie(){

    }

}
