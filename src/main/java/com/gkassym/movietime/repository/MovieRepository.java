package com.gkassym.movietime.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gkassym.movietime.model.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {

}
