package com.codingdojo.lookify.services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.lookify.models.Song;
import com.codingdojo.lookify.repositories.SongRepository;
// services will contain the queries! 


@Service //we are creating service layer to communicate with service to crud repository  
public class SongService {
	@Autowired
	SongRepository songRepo;
	
	///////////////////  RETURNS ALL  ///////////////////
	public List<Song> allSongs(){
		return songRepo.findAll(); 
			
	}
	
	
	///////////////////  CREATES   ////////////////////////
	public Song createSong(Song s) {
		return songRepo.save(s); 
		
	}
	
	////////////////// SHOW ONE BY ID /////////////////////
	public Song findSong(Long id) {
		Optional<Song> optionalSong = songRepo.findById(id); 
		if(optionalSong.isPresent()) {
			return optionalSong.get(); 
			
		} else {
			
			return null; 
		}
	}
	 //////////////////// SEARCH ////////////////////////
	
	public List<Song> findSongs(String artist) {
		return songRepo.findByArtistContaining(artist);
		
	}
	
	 ///////////////////  TOP 10 /////////////////////////
	public List<Song> topTen(){
		return songRepo.findTop10ByOrderByRatingDesc(); 
	}
	
	
	 /////////////////// UPDATE  ///////////////////////// 
	public void updateSong(@Valid Song s) {
		songRepo.save(s);
	}
	
	 //////////////////// DELETE /////////////////////////
	public void deleteSong(Long id) {
		songRepo.deleteById(id);
	}
	
	
	
	
}
