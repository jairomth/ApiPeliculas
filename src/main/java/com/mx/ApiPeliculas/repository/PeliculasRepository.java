package com.mx.ApiPeliculas.repository;

import org.springframework.data.repository.CrudRepository;

import com.mx.ApiPeliculas.entity.Peliculas;

public interface PeliculasRepository extends CrudRepository<Peliculas, Long> {

}
