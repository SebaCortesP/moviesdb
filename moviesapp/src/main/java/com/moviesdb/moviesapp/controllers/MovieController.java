package com.moviesdb.moviesapp.controllers;
import org.springframework.web.bind.annotation.*;

import com.moviesdb.moviesapp.models.Movie;
import com.moviesdb.moviesapp.services.MovieService;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/movies")
public class MovieController {
    @Autowired
    private MovieService movieService;

    @GetMapping
    public List<Movie> getAllMovies() {
        return movieService.getAllMovies();
    }

    @GetMapping("/{id}")
    public Optional<Movie> getMovieById(@PathVariable Long id) {
        return movieService.getMovieById(id);
    }
}

