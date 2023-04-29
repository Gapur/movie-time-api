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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getCountryOrigin() {
		return countryOrigin;
	}

	public void setCountryOrigin(String countryOrigin) {
		this.countryOrigin = countryOrigin;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getWriters() {
		return writers;
	}

	public void setWriters(String writers) {
		this.writers = writers;
	}

	public Double getBudget() {
		return budget;
	}

	public void setBudget(Double budget) {
		this.budget = budget;
	}

	public Double getGrossWorldwide() {
		return grossWorldwide;
	}

	public void setGrossWorldwide(Double grossWorldwide) {
		this.grossWorldwide = grossWorldwide;
	}

	public Integer getRuntime() {
		return runtime;
	}

	public void setRuntime(Integer runtime) {
		this.runtime = runtime;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getPoster() {
		return poster;
	}

	public void setPoster(String poster) {
		this.poster = poster;
	}
}
