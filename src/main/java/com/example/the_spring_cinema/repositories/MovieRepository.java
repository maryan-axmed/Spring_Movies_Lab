package com.example.the_spring_cinema.repositories;

import com.example.the_spring_cinema.models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
//repository will connect the model to the database
public interface MovieRepository extends JpaRepository<Movie, Integer> {


}
