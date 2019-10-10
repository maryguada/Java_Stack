package com.codingdojo.crud.services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.crud.models.Movie;
import com.codingdojo.crud.repositories.MovieRepository;

// this annotation is specific to help communicate from service layer to crud repository 
@Service 
public class MovieService {
	@Autowired 
	MovieRepository movieRepo ; 
	
	public List<Movie> getAllMovies() {
		return movieRepo.findAll(); 
	}

	public void createOrUpdateMovie(Movie movie) {
		// TODO Auto-generated method stub
		// now we need to call on movieRepo to save it for me 
		movieRepo.save(movie);		
	}

	public Movie getOneMovie(Long id) {
		// TODO Auto-generated method stub
		// need to create an Optional 
		// optional is a try class. Query for something 
		// if it exists, return. If not - it doesn't break, data will become null. 
		Optional<Movie> optionalMovie = movieRepo.findById(id);
		if(optionalMovie.isPresent()) {
			// it comes back as an iterable so we need to use the.get fx to get the book instance of itself.
			return optionalMovie.get();
		}else{
			return null;
		}

	}

	public void deleteMovie(Long id) {
		// TODO Auto-generated method stub
		movieRepo.deleteById(id);
	}
	
}
