package com.gkassym.movietime.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gkassym.movietime.model.Movie;
import com.gkassym.movietime.service.MovieService;

@RestController
@RequestMapping("/api")
public class MovieController {

	@Autowired
	MovieService movieService;
	
	@RequestMapping(value = "/movies", method = RequestMethod.POST)
	public Movie createMovie(@RequestBody Movie movie) {
		return movieService.createMovie(movie);
	}
	
	@RequestMapping(value = "/movies", method = RequestMethod.GET)
	public List<Movie> getMovies() {
		return movieService.getMovies();
	}
	
	@RequestMapping(value = "/movies/{movieId}", method = RequestMethod.PUT)
	public Movie updateMovie(@PathVariable(value = "movieId") Long movieId, @RequestBody Movie movie) {
		return movieService.updateMovie(movieId, movie);
	}
	
	@RequestMapping(value = "/movies/{movieId}", method = RequestMethod.DELETE)
	public void deleteMovie(@PathVariable(value = "movieId") Long movieId) {
		movieService.deleteMovie(movieId);
	}
}
