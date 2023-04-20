package com.mini.backend.backEND.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mini.backend.backEND.service.MovieService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/movie/")
@AllArgsConstructor

public class MovieController {

    @Autowired
	private MovieService mvSvc;

    

	@GetMapping(path="{movieid}")
	public ResponseEntity<String> getNews(@PathVariable(name="movieid") String movieid) {

       String opt = mvSvc.getMovieDeets(movieid);
	 	
		return ResponseEntity.ok(opt);
	}
    }
    
    

