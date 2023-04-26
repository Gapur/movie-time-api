package com.gkassym.movietime.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "movie")
public class Movie {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "release_date")
	private Date releaseDate;
	
	@Column(name = "country_origin")
	private String countryOrigin;
	
	@Column(name = "director")
	private String director;
	
	@Column(name = "writers")
	private String writers;
	
	@Column(name = "budget")
	private Double budget;
	
	@Column(name = "gross_worldwide")
	private Double grossWorldwide;
	
	@Column(name = "runtime")
	private Integer runtime;
	
	@Column(name = "rating")
	private int rating;
	
	@Column(name = "poster")
	private String poster;
}
