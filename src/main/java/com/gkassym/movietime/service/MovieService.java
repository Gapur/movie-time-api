package com.gkassym.movietime.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gkassym.movietime.model.Movie;
import com.gkassym.movietime.repository.MovieRepository;

@Service
public class MovieService {

	@Autowired
	MovieRepository movieRepository;
	
	public Movie createMovie(Movie movie) {
		return movieRepository.save(movie);
	}
	
	public List<Movie> getMovies() {
		return movieRepository.findAll();
	}
	
	public void deleteMovie(Long movieId) {
		movieRepository.deleteById(movieId);
	}
	
	public Movie updateMovie(Long movieId, Movie updatedMovie) {
		Movie movieById = movieRepository.findById(movieId).get();
		movieById.setName(updatedMovie.getName());
		movieById.setPoster(updatedMovie.getPoster());
		
		return movieRepository.save(movieById);
	}
}
