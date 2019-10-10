package com.codingdojo.crud.contorllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.codingdojo.crud.models.Movie;
import com.codingdojo.crud.services.MovieService;

@Controller 
public class MovieCtrl {
	
	@Autowired
	MovieService movieServ; 

///////////////////// GET ALL MOVIES ////////////////////
	@GetMapping("/")
	public String home(Model model) {
		
		List <Movie> allMovies = movieServ.getAllMovies(); 
		model.addAttribute("Movies",allMovies);
		return "movies/index.jsp"; 	
		}
	
///////////////////// CREATE NEW MOVIE ///////////////////
	@GetMapping("/createNewMovie")
	public String newBook(Model model) {
		model.addAttribute("newMovieObject", new Movie());
		
		return "movies/new.jsp";
	}
	
	@PostMapping("/movies")
	public String createMovie(@Valid @ModelAttribute("newMovieObject") Movie movie, BindingResult results) {
		if(results.hasErrors()) {
			return "movies/new.jsp"; //do not render on POST. this is redirecting specifically. 
	}
	movieServ.createOrUpdateMovie(movie); 
	return "redirect:/"; 
}
	
///////////////////// SHOW / READ ROUTE ///////////////////
	@GetMapping("/movies/{movie_id}/show")
	// need to grab the ID variable
	
	public String show(@PathVariable("movie_id") Long id, Model model) {
		
		Movie movie = movieServ.getOneMovie(id); 
		model.addAttribute("Movie", movie); 
		return "movies/show.jsp"; 
		
	}
	
/////////////////////  EDIT  //////////////////////////
	@GetMapping("/movies/{movie_id}/update")
	public String editMovie(Model model, @PathVariable("movie_id") Long id) {
		
		Movie movie = movieServ.getOneMovie(id);
		model.addAttribute("editMovieObject", movie);
		return "movies/edit.jsp"; 
	}
	
	
/////////////////// UPDATE POST ROUTE ///////////////////	
	@PutMapping("/movies/{id}")
	public String updateMovie(@Valid @ModelAttribute("editMovieObject") Movie movie, BindingResult results, @PathVariable("id") Long id) {
		if(results.hasErrors()) {
			return "movies/edit.jsp"; //do not render on POST. this is redirecting specifically. 
	}
		movie.setId(id);
		movieServ.createOrUpdateMovie(movie); 
		return "redirect:/"; 
	}
	
	
/////////////////     DELETE   //////////////////
	@DeleteMapping("/movies/{movie_id}/delete")
	public String deleteMovie(@PathVariable("movie_id") Long id) {
		movieServ.deleteMovie(id);
		return "redirect:/";
	}
	
}
