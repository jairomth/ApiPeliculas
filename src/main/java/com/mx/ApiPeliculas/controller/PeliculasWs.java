package com.mx.ApiPeliculas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.ApiPeliculas.entity.Peliculas;
import com.mx.ApiPeliculas.service.PeliculasServImp;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("PeliculasWs")
@CrossOrigin
public class PeliculasWs {

	@Autowired
	PeliculasServImp imp;

	// http://localhost:9002/PeliculasWs/listar
	@GetMapping("listar")
	public List<Peliculas> listar() {
		return imp.listar();
	}

	// http://localhost:9002/PeliculasWs/guardar
	@PostMapping("guardar")
	public ResponseEntity<?> guardar(@RequestBody Peliculas pelicula) {
		// TODO: process POST request
		boolean response = imp.guardar(pelicula);

		if (response == true)
			return new ResponseEntity<>("Ese título ya se agregó a la base de datos", HttpStatus.OK);
		else
			return new ResponseEntity<>(pelicula, HttpStatus.CREATED);
	}

}
