package com.codingdojo.lookify.controllers;

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
import org.springframework.web.bind.annotation.RequestParam;

import com.codingdojo.lookify.models.Song;
import com.codingdojo.lookify.services.SongService;

@Controller 
public class SongCtrl {
	
	@Autowired 
	SongService songServ; 
	
//////////////////////    INDEX    /////////////////////
	
	@GetMapping("/")
	public String index() {
		return "/songs/index.jsp"; 
	}
	
/////////////////  GET ALL DISPLAY SONGS  ////////////////
	
	@GetMapping("/dashboard")
	public String dashboard(Model model) {
		List<Song> songs = songServ.allSongs(); 
		model.addAttribute("songs", songs); 
		return "songs/dashboard.jsp";
	}
	

/////////////////////  ADD A NEW SONG  /////////////////////////	
	@GetMapping("/songs/new")
	public String newSong(@ModelAttribute("newSong") Song song) {
		return "songs/new.jsp"; 
	}
	
//////////////////////  ADD POST ROUTE  ////////////////////////
	@PostMapping("/process")
	public String create(@Valid @ModelAttribute("newSong") Song song, BindingResult result) {
		if(result.hasErrors()) {
			return"songs/new.jsp"; 
		} else {
			songServ.createSong(song); 
			return"redirect:/dashboard";
		}
	}
	
///////////////////  SHOW / READ BY ID ///////////////////////
	@GetMapping("songs/{id}")
	public String showSong(Model model, @PathVariable("id") Long id) {
		Song song = songServ.findSong(id); 
		model.addAttribute("song", song); 
		return "songs/show.jsp"; 
	}
	
	
///////////////////// SHOW / READ ROUTE ///////////////////
//	@GetMapping("/movies/{movie_id}/show")
//	// need to grab the ID variable
//	
//	public String show(@PathVariable("movie_id") Long id, Model model) {
//	
//		Song song = songServ.getOneMovie(id); 
//		model.addAttribute("Movie", movie); 
//		return "movies/show.jsp"; 
//		
//	}
//	
	
///////////////////  SEARCH BY ARTIST ///////////////////////	
	@GetMapping("/search")
	public String search (Model model, @RequestParam("search") String artist) {
		List<Song> song= songServ.findSongs(artist); 
		model.addAttribute("song", song);
		return"songs/search.jsp"; 
			
		
	}

///////////////////  TOP 10  ///////////////////////
	@GetMapping("/search/topten")
	public String top(Model model) {
		List<Song> song = songServ.topTen();
		model.addAttribute("song", song);
		return "songs/topten.jsp"; 
	}
	
///////////////////  DELETE  ///////////////////////
	@DeleteMapping("songs/{id}")
	public String destroy(@PathVariable("id") Long id) {
		songServ.deleteSong(id);
		return "redirect:/dashboard"; 
	}
	
	

}
