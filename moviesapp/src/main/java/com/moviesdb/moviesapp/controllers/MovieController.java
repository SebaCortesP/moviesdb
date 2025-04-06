package com.moviesdb.moviesapp.controllers;
import org.springframework.web.bind.annotation.*;

import com.moviesdb.moviesapp.models.Movie;
import com.moviesdb.moviesapp.services.MovieService;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


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

    @PostMapping("/store")
    public Optional<Movie> storeMovie(@RequestBody Movie movie) {
        return movieService.storeMovie(movie);
    }

    @PutMapping("/update/{id}")
    public Optional<Movie> updateMovie(@PathVariable Long id, @RequestBody Movie movie ) {
        return movieService.updateMovie(id,movie);
    }
    
    @DeleteMapping("/delete/{id}")
    public void deleteMovie(@PathVariable Long id ) {
        movieService.deleteMovie(id);
    }
    
}

